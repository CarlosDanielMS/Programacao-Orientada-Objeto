// Classe Funcionario
public class ContaBancaria{
    private String titular;
    private int numeroConta;
    private double saldo;
    

    
    public ContaBancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;        
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;        
    }

    public double getSaldo(int saldo){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;        
    }


    public void exibir(){
        System.out.println("Titular da Conta: " + titular);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo da Conta: " + saldo);

    }
}
