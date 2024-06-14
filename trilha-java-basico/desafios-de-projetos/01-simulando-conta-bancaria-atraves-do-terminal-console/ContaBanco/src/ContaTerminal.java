import java.net.SocketPermission;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar classe scaner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagem para o usuário
        //TODO: Obter pela classe scaner os valores digitados pelo terminal
        System.out.println("Digite o seu nome");
        String NomeCliente = scanner.next();

        System.out.println("Agora digite nome da sua agencia");
        String Agencia = scanner.next();
        
        System.out.println("Infome o número da sua conta");
        int NumeroConta = scanner.nextInt();

        System.out.println("Qual o Valor do saldo  presente na conta");
        double SaldoConta = scanner.nextDouble();
        
        //TODO: Exibir a mensagem conta criada
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println ("O nome da sua agência é: " + Agencia);
        System.out.println ("Seu número de conta é: " + NumeroConta); 
        System.out.println ("E o seu saldo de " + SaldoConta + " já está disponível para saque");
    }
}
