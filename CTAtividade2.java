import java.util.*;


public class CTAtividade2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void limparTela(){
        System.out.print("\033[H\033[2J");
    }

    public static double coletarValor(String menssagem){

        System.out.print(menssagem);
        double valor = scanner.nextDouble();
        //recolheno o caracter de quebra de linha
        scanner.nextLine();

        return valor;
    }

    public static void main(String...args){
        //usando ponto em vez de vírgula
        scanner.useLocale(Locale.US);

        //lendo os dados do usuário
        System.out.print("Informe seu nome: ");
        String titular = scanner.nextLine();
        Conta conta = new Conta(titular);

        //guarda o valor da operação
        int operacao;

        do {
            limparTela();

            //mostrando o menu
            System.out.println(" ============ Banco ============ \n\n");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.print("\n Informe a operação: ");
            operacao = scanner.nextInt();

            limparTela();

            switch(operacao){
                case 1: {
                    double valor = coletarValor(" Informe o valor a ser depositado: ");

                    //tentando efetuar o depósito
                    if(conta.depositar(valor)){
                        System.out.println(" Saldo atualizado com sucesso!\n Novo saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("O valor deve ser maior que 0!");
                    }

                    break;
                }
                case 2: {
                    double valor = coletarValor(" Informe o valor a ser sacado: ");

                    //tentando efetuar o saque
                    if(conta.sacar(valor)){
                        System.out.println(" Saque efetuado com sucesso!\n Novo saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente");
                    }

                    break;
                }
            }

            //aguardando ENTER para continuar
            System.out.print("Pressione ENTER para continuar");
            scanner.nextLine();

        } while(operacao >= 1 && operacao <= 2);

    }
}