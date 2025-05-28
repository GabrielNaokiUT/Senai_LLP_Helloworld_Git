import java.util.Scanner;

class Retangulo{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a altura do retângulo: ");
        float alt = leia.nextFloat();
        System.out.print("Digite a base do retângulo: ");
        float bas = leia.nextFloat();
        float a = bas * alt;
        System.out.print("A área desse retângulo é: " + a);
    }
}
