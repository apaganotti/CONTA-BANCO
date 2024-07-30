import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
        
        // Fechar o scanner
        scanner.close();
    }
}
