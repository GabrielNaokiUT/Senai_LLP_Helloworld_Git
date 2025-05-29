import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora simples com notação polonesa reversa");
        System.out.print("Digite um número, número e operador: ");


        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida");
            return;
        }
        int a = sc.nextInt();


        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida");
            return;
        }
        int b = sc.nextInt();


        if (!sc.hasNext()) {
            System.out.println("Entrada inválida");
            return;
        }
        char op = sc.next().charAt(0);


        int resultado;
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero");
                    sc.close();
                    return;
                }
                resultado = a / b;
                break;
            default:
                System.out.println("Operador inválido");
                sc.close();
                return;
        }


        System.out.println("= " + resultado);
        sc.close();
    }
}
