package javaCurso;

public class JavaCurso {

    static int numero = 20;

    static void somarDoisNumeros(int num1, int num2) {
        System.out.println(numero);
        System.out.println(num1 + num2);
    }

    static int retornarSomaDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(numero);
        somarDoisNumeros(2, 3);

        //System.out.println(retornarSomaDoisNumeros(1, 2));
    }

}
