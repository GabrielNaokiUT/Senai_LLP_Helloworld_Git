import java.util.Scanner;

class Piramide{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a medida da base da pirâmide retângulo: ");
        Double bas = leia.nextDouble();  
        System.out.print("Digite a altura da base da pirâmide retângulo: ");
        Double altbas = leia.nextDouble();
        Double abas = bas * altbas;
        System.out.print("Digite a altura da pirâmide: ");
        Double alt = leia.nextDouble();
        Double alado = (bas * alt) / 2;
        Double atotal = abas + alado;
        System.out.print("A área desse círculo é: " + atotal);
    }
}

