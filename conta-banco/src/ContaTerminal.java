import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ContaTerminal { 

    private int Numero;
    private String Agencia;
    private String Nome_Cliente;
    private float Saldo;


    public ContaTerminal(int numero, String agencia, String nome_Cliente, float saldo) {
        Numero = numero;
        Agencia = agencia;
        Nome_Cliente = nome_Cliente;
        Saldo = saldo;
    }





    public int getNumero() {
        return Numero;
    }





    public void setNumero(int numero) {
        Numero = numero;
    }





    public String getAgencia() {
        return Agencia;
    }





    public void setAgencia(String agencia) {
        Agencia = agencia;
    }





    public String getNome_Cliente() {
        return Nome_Cliente;
    }





    public void setNome_Cliente(String nome_Cliente) {
        Nome_Cliente = nome_Cliente;
    }





    public float getSaldo() {
        return Saldo;
    }





    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    



    @Override
    public String toString() {
        return "Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero
                + ",  e seu saldo " + Saldo + " já está disponível para saque \"]";
    }





    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = terminal.nextLine();
        
        terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta !");
        int NumConta = terminal.nextInt();

        terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do correntista !");
        String Nome = terminal.nextLine();

        terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o Saldo que deseja usar para abrir a conta !");
        float saldo = terminal.nextFloat();

        ContaTerminal info = new ContaTerminal(NumConta, agencia, Nome, saldo);

        System.out.println(info.toString());
    }
}
