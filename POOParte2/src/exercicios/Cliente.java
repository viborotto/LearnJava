package exercicios;

public class Cliente {

    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public Cliente(String nomeTitular, int numeroConta, double initialDeposit) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        deposito(initialDeposit);
    }

    public Cliente(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {

        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {

        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Depósito
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void saque(double valorSaque){
        this.saldo -= valorSaque-5.00;
    }
    public String toString() {
        return "Account "
                + numeroConta
                + ", Holder: "
                + nomeTitular
                + ", Balance: $ "
                + String.format("%.2f", saldo);
    }

}
