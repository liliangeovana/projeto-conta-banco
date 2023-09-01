import java.util.Locale;
import java.util.Scanner;
/**
 * <h1>Conta em Banco</h1>
 * <p>
 *    Receber dados para criação de conta fictícia.  
 * </p>
 * <p>
 * <strong>Note: Leia atentamente a documentação desta classe 
 * para desfrutar dos recursos oferecidos pelo autor.
 * </p>
 * 
 * @author Lílian Saraiva
 * @version 1.0
 * @since 01/09/2023
 */

public class ContaTerminal {

    /**
     * Este método é utilizado para captar os dados do usuário
     * @param numeroConta número da conta em formato inteiro
     * @param numeroAgencia indica número da agência em formato de texto
     * @param nomeCliente este é o nome do cliente
     * @param saldo saldo do cliente em formato double
     */

    public static void main (String[] args){ 
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

    System.out.print("Número da agência: ");
        String numeroAgencia = scanner.next();

    System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();

    System.out.print("Para finalizar, digite seu saldo: ");
        double saldo = scanner.nextDouble();

    System.out.print("Olá "+nomeCliente+", obrigada por criar uma conta em nosso banco, sua agência é "+numeroAgencia+ ", conta "+numeroConta+" e o seu saldo de R$"+saldo+ " já está disponível para saque.");
    }
}