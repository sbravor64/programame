package com.company;

import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int uvas = 4354;

        while(uvas != 0) {
            uvas = teclado.nextInt();

            int niveles = 0;
            int totaluvas = 0;

            while (uvas > totaluvas) {
                niveles++;
                totaluvas = niveles + totaluvas;
            }
            if(totaluvas != 0)
                System.out.println(niveles);
        }
    }
}
