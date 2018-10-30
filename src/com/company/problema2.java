package com.company;

import java.util.Scanner;

public class problema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distancia = 0;
        int velocidad_maxima = 0;
        int tiempo = 0;


        while (true) {
            distancia = teclado.nextInt();
            velocidad_maxima = teclado.nextInt();
            tiempo = teclado.nextInt();


            float mis_metros = distancia;
            float mis_segundos = tiempo;

            float kilometros = mis_metros / 1000;
            float horas = mis_segundos / 3600;
            float velocidadActual = kilometros / horas;


            if (distancia == 0 || velocidad_maxima == 0 || tiempo == 0) {
                return;
            }else if (distancia < 0 || velocidad_maxima < 0 || tiempo < 0) {
                System.out.println("ERROR");
            } else if (velocidadActual <= velocidad_maxima) {
                System.out.println("OK");
            } else {
                if (velocidadActual > (velocidad_maxima * 1.2)) {
                    System.out.println("PUNTOS");
                } else {
                    if (velocidadActual > velocidad_maxima) {
                        System.out.println("MULTA");
                    }
                }

            }

        }

    }
}
