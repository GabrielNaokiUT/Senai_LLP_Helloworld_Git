import java.util.Scanner;

class Bola{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio da bola: ");
        Double r = leia.nextDouble();   
        Double a = 4 * Math.PI * r * r;
        System.out.print("A área da bola é: " + a);
    }
}

