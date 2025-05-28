import java.util.Scanner;

class Tubo{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do tubo : ");
        Double r = leia.nextDouble(); 
        System.out.print("Digite a altura do tubo: ");
        Double alt = leia.nextDouble();
        Double a = 2 * Math.PI * r * (r + alt);
        System.out.print("A área desse tubo é: " + a);
    }
}

