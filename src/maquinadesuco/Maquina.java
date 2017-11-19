package maquinadesuco;

public class Maquina {

    private int doseAcucar;
    private int doseAgua;
    private int doseSuco;

    private Menu menu;

    private Maquina maquina;

    private CopoSuco copoSuco;

    public Maquina() {
        this.doseAcucar = 5;
        this.doseAgua = 50;
        this.doseSuco = 15;
        iniciarCopoSuco();
        iniciarMenu();
    }

    public void exibirMenu() {
        this.menu.exibirMenusIngredientes();
    }

    public void iniciarSistemaMaquina() {
        iniciarCopoSuco();
        iniciarMenu();
    }

    public void iniciarCopoSuco() {
        if (copoSuco == null) {
            this.copoSuco = new CopoSuco();
        }
    }

    public void iniciarMenu() {
        if (menu == null) {
            this.menu = new Menu(this.copoSuco, this);
        }
    }

    public int getDoseAcucar() {
        return doseAcucar;
    }

    public void setDoseAcucar(int doseAcucar) {
        this.doseAcucar = doseAcucar;
    }

    public int getDoseAgua() {
        return doseAgua;
    }

    public void setDoseAgua(int doseAgua) {
        this.doseAgua = doseAgua;
    }

    public int getDoseSuco() {
        return doseSuco;
    }

    public void setDoseSuco(int doseSuco) {
        this.doseSuco = doseSuco;
    }

    public Maquina getMaquina() {
        return this.maquina;
    }

}
