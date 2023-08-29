public class Main {
    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        llenarMatriz(cuadrado);
        mostrar(cuadrado);
        mostrarCuadradoMagico(cuadrado);
    }
    public static void llenarMatriz(int[][] cuadrado){
        int random;
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                do {
                    random = (int) (Math.random() * 9) + 1;
                } while (validar(cuadrado, random) == -1);
                cuadrado[i][j]=random;
            }
        }
    }
    public static int validar(int[][] cuadrado, int random){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                if (random == cuadrado[i][j]){
                    return -1;
                }
            }
        }
        return random;
    }
    public static void mostrar(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("["+cuadrado[i][j]+"]");
            }
            System.out.println();
        }
    }
    public static boolean verificarCuadradoMagico(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length ; i++) {
            if (cuadrado[i][0]+cuadrado[i][1]+cuadrado[i][2] != 15){
                return false;
            }
        }
        for (int i = 0; i < cuadrado[i].length; i++) {
            if (cuadrado[0][i]+cuadrado[1][i]+cuadrado[2][i]!=15){
                return false;
            }
        }
        if (cuadrado[0][0]+cuadrado[1][1]+cuadrado[2][2]!=15 || cuadrado[2][0]+cuadrado[1][1]+cuadrado[0][2]!=15){
            return false;
        }
        return true;
    }
    public static void mostrarCuadradoMagico(int[][] cuadrado){
        if (verificarCuadradoMagico(cuadrado)){
            System.out.println("Es un cuadrado mágico");
        }else {
            System.out.println("No es un cuadrado mágico");
        }
    }
}