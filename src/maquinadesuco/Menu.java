package maquinadesuco;

import java.util.Scanner;

public class Menu {

    private static final int MENU_ACUCAR = 1;
    private static final int MENU_AGUA = 2;
    private static final int MENU_SUCO = 3;
    
    private CopoSuco copoSuco;
    
    private Maquina maquina; 

    public Menu(CopoSuco copoSuco, Maquina maquina) {
        this.copoSuco = new CopoSuco();
        this.maquina = new Maquina();
    }

    public void selecionarMenu() {

        Scanner leitor = new Scanner(System.in);
        int menu = 0;
        menu = leitor.nextInt();
        System.out.println(retornarNomeIngredientes(menu));

        //Não exibir Menu
        switch (menu) {
            case MENU_ACUCAR:
                if (this.copoSuco.getAcucarAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, maquina.getMaquina().getDoseAcucar());
                } else {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, -maquina.getMaquina().getDoseAcucar());
                }
                break;
            case MENU_AGUA:
                if (this.copoSuco.getAguaAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, maquina.getMaquina().getDoseAgua());
                } else {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, -maquina.getMaquina().getDoseAgua());
                }
                break;
            case MENU_SUCO:
                if (this.copoSuco.getSucoAtual() == 0) {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, maquina.getMaquina().getDoseSuco());
                } else {
                    this.getCopoSuco().dosarIngrediente(CopoSuco.ACUCAR, -maquina.getMaquina().getDoseSuco());
                }
                break;

        }

    }

    public void exibirValoresAtuais() {
        System.out.println("****************************");
        System.out.println("* MÁQUINA DE SUCO DE FRUTA *");
        System.out.println("****************************");
        System.out.println("*     QUANTIDADE ATUAL     *");
        System.out.println("****************************");
        System.out.printf("*  AÇUCAR: %dml             *\n", copoSuco.getAcucarAtual());
        System.out.printf("*  ÁGUA: %dml               *\n", copoSuco.getAguaAtual());
        System.out.printf("*  SUCO: %dml               *\n", copoSuco.getSucoAtual());
        System.out.printf("*  TOTAL: %dml,%dml        *\n", copoSuco.calcularVolumeTotal(), copoSuco.getTamanhoCopo());
        if (copoSuco.calcularVolumeTotal() > copoSuco.getTamanhoCopo()) {
            System.out.println("* !! QUANTIDADE EXCEDIDA !! *");
        }
    }

    public void exibirMenusIngredientes() {
        System.out.println("****************************");
        System.out.println("* SELECIONE O INGREDIENTE  *");
        System.out.println("* 1 = Açucar               *");
        System.out.println("* 2 = Água                 *");
        System.out.println("* 3 = Suco                 *");
        System.out.println("****************************");
    }

    private String retornarNomeIngredientes(int menu) {
        String retorno = "Ingrediente selecionado: ";

        switch (menu) {
            case MENU_ACUCAR:
                return retorno + "Açucar";
            case MENU_AGUA:
                return retorno + "Água";
            case MENU_SUCO:
                return retorno + "Suco";
            default:
        }

        return retorno;
    }
    
    public CopoSuco getCopoSuco(){
        return this.copoSuco;
    }

}
