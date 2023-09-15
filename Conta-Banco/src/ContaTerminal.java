import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Saldo da sua conta.");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nome +" obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia +" , a sua conta de numero "+ conta +" contem o saldo de " + saldo +" que já está disponível para saque");
    }
}
