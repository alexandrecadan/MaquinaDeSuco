/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadesucodemacho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class MaquinaDeSucoDeMacho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanhoCopo = 500;
        int doseAcucar = 5;
        int doseAgua = 50;
        int doseSuco = 10;

        //ValorAtual
        int acucarAtual = 0;
        int aguaAtual = 0;
        int sucoAtual = 0;
        int volumeTotal = acucarAtual + aguaAtual + sucoAtual;

        int menu = 0;
        boolean adiciona = true;

        Scanner leitor = new Scanner(System.in);

        menu = leitor.nextInt();

        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("*     QUANTIDADE ATUAL     *");
        System.out.println("****************************");
        System.out.printf("*  TOTAL: %dml,%dml        *\n", volumeTotal, tamanhoCopo);
        System.out.printf("*  AÇUCAR: %dml             *\n", acucarAtual);
        System.out.printf("*  ÁGUA: %dml               *\n", aguaAtual);
        System.out.printf("*  SUCO: %dml               *\n", sucoAtual);
        
        exibirMenusIngredientes();
        
        menu = leitor.nextInt();

        System.out.println("Número lido" + menu);

        switch (menu) {
            case 0: //Açucar
                if (adiciona) {
                    acucarAtual += doseAcucar;
                } else {
                    acucarAtual -= doseAcucar;
                }
                break;

            case 1: // Água
                if (adiciona) {
                    aguaAtual += doseAgua;
                } else {
                    aguaAtual -= aguaAtual;
                }
                break;

            case 2: // Suco
                if (adiciona) {
                    sucoAtual += doseSuco;
                } else {
                    sucoAtual -= doseSuco;
                }
                break;

            default:
                System.out.println("Selecione o valor do 0 ao 2");
        }

        if (menu == 0) { //Açucar

        } else if (menu == 1) { // Água

        } else if (menu == 2) { // Suco

        }

        System.out.println(tamanhoCopo + aguaAtual);

    }

    static void exibirMenusIngredientes() {
        System.out.printf("****************************");
        System.out.println("SELECIONE O INGREDIENTE   *");
        System.out.println(" 0 = Açucar               *");
        System.out.println(" 1 = Água                 *");
        System.out.println(" 2 = Suco                 *");
        System.out.printf("****************************");
    }

}
