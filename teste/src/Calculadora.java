import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

//        Scanner scanner =  new Scanner(System.in);
//
//        System.out.println("Insira um numero: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Insira outro numero: ");
//        int num2 = scanner.nextInt();
//
//        int resultado = 0;
//        resultado = num1 + num2;
//
//        System.out.println("O resultado é: " + resultado);

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja fazer uma operação? S/N: ");
        String resposta = sc.next();

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz");
            System.out.println("0 - Sair");
            int operação = sc.nextInt();

            if (operação == 0) {
                System.out.println("Encerrando calculadora...");
                break;
            }
            if (operação < 1 || operação > 6) {
                System.out.println("Operação inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro numero: ");
            double a = sc.nextDouble();

            double b = 0;
            if (operação != 6) {
                System.out.print("Digite o segundo numero: ");
                b = sc.nextDouble();
            }

            double resultado = 0;

            switch (operação) {
                case 1:
                    resultado = a + b;
                    break;

                case 2:
                    resultado = a - b;
                    break;

                case 3:
                    resultado = a * b;
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    resultado = a / b;
                    break;

                case 5:
                    resultado = Math.pow(a, b);
                    break;

                case 6:
                    if (a == 0) {
                        System.out.println("O índice da raiz não pode ser zero.");
                        return;
                    }
                    if (a < 0) {
                        System.out.println("Não é possível calcular raiz de número negativo.");
                        return;
                    }
                    resultado = Math.sqrt(a);
                    break;
            }

            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja fazer outra operação? S/N");
            resposta = sc.next();
        }

        System.out.println("Encerrando...");
        sc.close();
    }
}