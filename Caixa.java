import java.util.Scanner;

class Caixa{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a altura da caixa: ");
        Double alt = leia.nextDouble();   
        System.out.print("Digite o comprimento da caixa: ");
        Double comp = leia.nextDouble();
        System.out.print("Digite a largura da caixa: ");
        Double larg = leia.nextDouble();
        Double a = alt * comp * larg;
        System.out.print("A área dessa caixa é: " + a);
    }
}

