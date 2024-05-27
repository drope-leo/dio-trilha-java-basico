
import java.util.Scanner;

public class contaTerminal {
  public static void main(String[] args) {

     String nomeCliente;
     String numeroConta;
     String agencia;
    double saldo;
  Scanner teclado = new Scanner(System.in);
  System.out.print("Digite o nome do cliente :");
    nomeCliente = teclado.next(); 
    System.out.print("Digite o código da agência:");
  
    agencia = teclado.next();
    System.out.println("Digite o número da conta:");
    numeroConta = teclado.next();
    
    System.out.println("Digite o saldo:");
    saldo = teclado.nextDouble();
    System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é"+agencia+", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");
    System.out.println("Conta casdastrada com sucesso!");

  }
}



