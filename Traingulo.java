import java.util.Scanner;

class Traingulo{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a altura do triângulo: ");
        float alt = leia.nextFloat();
        System.out.print("Digite a base do triañgulo: ");
        float bas = leia.nextFloat();
        float a = (bas * alt) / 2;
        System.out.print("A área desse triãngulo é: " + a);
    }
}
 
