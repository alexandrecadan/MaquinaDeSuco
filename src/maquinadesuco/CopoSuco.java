package maquinadesuco;

public class CopoSuco {

    public static final int ACUCAR = 1;
    private static final int AGUA = 2;
    private static final int SUCO = 3;

    private int tamanhoCopo;

    //ValorAtual
    private int acucarAtual;
    private int aguaAtual;
    private int sucoAtual;

    public CopoSuco() {
        this.tamanhoCopo = 300;
        this.acucarAtual = 0;
        this.aguaAtual = 0;
        this.sucoAtual = 0;
    }
    
    public void dosarIngrediente(int ingrediente, int dose) {
        switch (ingrediente) {
            case ACUCAR:
                this.acucarAtual += dose;
                break;
            case AGUA:
                this.aguaAtual += dose;
                break;
            case SUCO:
                this.sucoAtual += dose;
                break;
        }
    }

    public int calcularVolumeTotal() {
        return acucarAtual + aguaAtual + sucoAtual;
    }

    public int getTamanhoCopo() {
        return tamanhoCopo;
    }

    public void setTamanhoCopo(int tamanhoCopo) {
        this.tamanhoCopo = tamanhoCopo;
    }

    public int getAcucarAtual() {
        return acucarAtual;
    }

    public void setAcucarAtual(int acucarAtual) {
        this.acucarAtual = acucarAtual;
    }

    public int getAguaAtual() {
        return aguaAtual;
    }

    public void setAguaAtual(int aguaAtual) {
        this.aguaAtual = aguaAtual;
    }

    public int getSucoAtual() {
        return sucoAtual;
    }

    public void setSucoAtual(int sucoAtual) {
        this.sucoAtual = sucoAtual;
    }
}
