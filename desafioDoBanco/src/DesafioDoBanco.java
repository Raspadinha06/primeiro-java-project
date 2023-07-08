import java.util.Scanner;

public class DesafioDoBanco {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);
        String nome = "Davi";
        String tipoDeConta = "Corrente";
        double saldoEmConta = 1765.76;
        String menu = """
                    
                    Operações:
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """;

        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo em conta: R$" + saldoEmConta);
        System.out.println("\n**********************");

        int operacaoDesejada = 0;
        while (operacaoDesejada != 4){
            System.out.println(menu);
            System.out.println("Digite a operação desejada:");
            operacaoDesejada = leituraDeDados.nextInt(); // Natural break of the loop while

            if(operacaoDesejada > 4){
                System.out.println("Operação inválida");

            }   else if(operacaoDesejada == 1){
                System.out.println("Saldo em conta: R$" + saldoEmConta);
            }   else if(operacaoDesejada == 2){
                System.out.println("Digite o valor a ser recebido: ");
                double valorParaReceber = leituraDeDados.nextDouble();
                saldoEmConta += valorParaReceber;
                System.out.println("Novo valor da conta: R$" + saldoEmConta);
            }   else if(operacaoDesejada == 3){
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferido = leituraDeDados.nextDouble();
                    if(valorTransferido > saldoEmConta){
                        System.out.println("Saldo insuficiente para transferência.");
                    } else{
                        saldoEmConta -= valorTransferido;
                        System.out.println("Novo valor da conta: R$" + saldoEmConta);
                    }
            }   else if (operacaoDesejada == 4){
                System.out.println("Obrigado por acessar o NewBank!");
                break;
            }
        }
    }
}
