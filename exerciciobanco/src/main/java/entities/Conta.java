package entities;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    public Conta(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        this.saldo -= saldo + 5.0;
    }

    @Override
    public String toString() {
        return "Conta bancária "
                + "numeroConta: " + numeroConta
                + ", nomeTitular: " + nomeTitular + '\''
                + ", saldo: R$"
                + String.format("%.2f", saldo);
    }
}
