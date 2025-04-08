
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner recebedor = new Scanner(System.in);


        //Receber o numero da agencia
        System.out.print("Por favor insire o numero da agencia (Ex. 067-8): ");
        agencia = recebedor.next();
        //Receber o numero da conta
        System.out.print("Por favor insire o número da conta: ");
        numero = recebedor.nextInt();
        //Receber o nome do Cliente
        System.out.print("Por favor insira seu nome: ");
        nomeCliente = recebedor.next();
        //O saldo colcar em 0 porque acabo-se de criar a conta
        saldo = 0;

        System.out.println("Hola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+Integer.toString(numero)+" e seu saldo é "+Double.toString(saldo));
    }
}
