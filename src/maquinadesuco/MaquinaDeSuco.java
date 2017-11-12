package maquinadesuco;

import java.util.Scanner;

public class MaquinaDeSuco {

    static int tamanhoCopo = 500;
    static int doseAcucar = 5;
    static int doseAgua = 20;
    static int doseSuco = 10;

    //ValorAtual
    static int acucarAtual = 0;
    static int aguaAtual = 0;
    static int sucoAtual = 0;

    public static void main(String[] args) {

        while (true) {
            exibirValoresAtuais();
            exibirMenusIngredientes();
            selecionarMenu();
        }

    }

    static void selecionarMenu() {

        Scanner leitor = new Scanner(System.in);

        int menu = 0;

        menu = leitor.nextInt();

        System.out.println(retornarNomeIngredientes(menu));

        //Não exibir menu
        if (menu == 1) {
            if (acucarAtual == 0) {
                acucarAtual += doseAcucar;
            } else if (calcularVolumeTotal() + doseAcucar >= tamanhoCopo) {
                acucarAtual -= doseAcucar;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }

        } else if (menu
                == 2) {
            if (aguaAtual == 0) {
                aguaAtual += doseAgua;
            } else if (calcularVolumeTotal() + doseAgua >= tamanhoCopo) {
                aguaAtual -= doseAgua;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }

        } else if (menu
                == 3) {
            if (sucoAtual == 0) {
                sucoAtual += doseSuco;
            } else if (calcularVolumeTotal() + doseSuco >= tamanhoCopo) {
                sucoAtual -= doseSuco;
            } else {
                adicionarRemoverIngredienteSelecionado(leitor, menu);
            }

        }

        System.out.println(tamanhoCopo + aguaAtual);
    }

    static void adicionarRemoverIngredienteSelecionado(Scanner leitor, int menu) {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("* Digite:                  *");
        System.out.println("* + (Mais Ingrediente)     *");
        System.out.println("* - (Menos Ingrediente)    *");
        System.out.println("****************************");

        String adicionaRemove = leitor.next();

        boolean adiciona = adicionaRemove.equals("+");

        switch (menu) {
            case 1: //Açucar
                if (adiciona) {
                    acucarAtual += doseAcucar;
                } else {
                    acucarAtual -= doseAcucar;
                }
                break;

            case 2: // Água
                if (adiciona) {
                    aguaAtual += doseAgua;
                } else {
                    aguaAtual -= aguaAtual;
                }
                break;

            case 3: // Suco
                if (adiciona) {
                    sucoAtual += doseSuco;
                } else {
                    sucoAtual -= doseSuco;
                }
                break;

            default:
                System.out.println("Selecione o valor do 0 ao 2");
        }
    }

    static String retornarNomeIngredientes(int menu) {
        String retorno = "Ingrediente selecionado: ";

        switch (menu) {
            case 1:
                return retorno + "Açucar";
            case 2:
                return retorno + "Água";
            case 3:
                return retorno + "Suco";
            default:
        }

        return retorno;
    }

    static void exibirValoresAtuais() {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE MACHO *");
        System.out.println("****************************");
        System.out.println("*     QUANTIDADE ATUAL     *");
        System.out.println("****************************");
        System.out.printf("*  AÇUCAR: %dml             *\n", acucarAtual);
        System.out.printf("*  ÁGUA: %dml               *\n", aguaAtual);
        System.out.printf("*  SUCO: %dml               *\n", sucoAtual);
        System.out.printf("*  TOTAL: %dml,%dml        *\n", calcularVolumeTotal(), tamanhoCopo);
    }

    static void exibirMenusIngredientes() {
        System.out.println("****************************");
        System.out.println("* SELECIONE O INGREDIENTE  *");
        System.out.println("* 1 = Açucar               *");
        System.out.println("* 2 = Água                 *");
        System.out.println("* 3 = Suco                 *");
        System.out.println("****************************");
    }

    static int calcularVolumeTotal() {
        return acucarAtual + aguaAtual + sucoAtual;
    }
}
