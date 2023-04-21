import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double saldoDoCliente = 0;
        int opcao = 0;

        // Recebendo os dados do cliente

        System.out.println("Insira seus dados do banco: ");
        System.out.println();
        System.out.println("Nome: ");
        String nome = leitura.nextLine();
        System.out.println("Tipo conta:");
        String tipoDeConta = leitura.nextLine();

        // Emitindo os dados do cliente na tela

        System.out.println("**************");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo da conta: R$" + saldoDoCliente);
        System.out.println("**************");
        System.out.println();


        System.out.println("""
                Operações 
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

        System.out.println("Digite a opção desejada:");
        opcao = leitura.nextInt();

        if ( opcao == 1 ) {
            System.out.println("Salda da conta: R$" + saldoDoCliente);
        } else if ( opcao == 2 ) {
            System.out.println("Informe o valor a receber:");
            double receber = leitura.nextDouble();
            saldoDoCliente += receber;
            System.out.println("Saldo da conta atualizado R$"+ saldoDoCliente);
        } else if ( opcao == 3 ) {
            System.out.println("Digite o valor que deseja transferir:");
            double transferir = leitura.nextDouble();
            saldoDoCliente -= transferir;
            System.out.println("""
                    Transferencia realizada com sucesso!
                    
                    Saldo atual: R$
                    """ + saldoDoCliente);
        }

    }
}
