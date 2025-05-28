import java.util.Scanner;

class Circulo{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        Double r = leia.nextDouble();   
        Double a = Math.PI * r * r;
        System.out.print("A área desse círculo é: " + a);
    }
}

