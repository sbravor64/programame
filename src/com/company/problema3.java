package com.company;

public class problema3 {

    public static void main(String[] args) {
        //       Scanner sc= new Scanner(System.in);
        //       String texto = sc.nextLine();

        boolean[] descartados = new boolean[6];
        int ncamas = 2;
        int palabras = 3;
        int eqthq = 0;

        while(true) {
            for (int i = eqthq + 1; i <= 3; i++) {
                if (i == 3) {
                    descartados[3] = true;
                    eqthq = 3;

                }
            }
        }

        System.out.println("final");
    }
}
