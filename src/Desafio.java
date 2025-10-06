import java.util.Scanner;

public class Desafio {
    static void main() {
        String nome = "Peter Parker";
        String tipoConta = "Corrente";
        double saldo = 999.99;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: $" + saldo);
        System.out.println("\n*****************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Sacar valor
                3 - Depositar valor
                4 - Sair
                **********************
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é $" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo o sulficiente para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo $" + saldo);
                }
            } else if(opcao == 3) {
                System.out.println("Valor a receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo $" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }

        }
    }
}
