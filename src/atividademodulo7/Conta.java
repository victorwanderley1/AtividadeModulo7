package atividademodulo7;

/**
 *
 * @author Victor
 */
public abstract class Conta {
    protected String nomeBanco;
    protected double saldo;
    protected Integer numeroAgencia;
    protected Integer numeroConta;

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public abstract double getSaldo();
    
    public void setNumeroAgencia(Integer numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    
    public Integer getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    
    public void setNumeroConta(Integer numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public Integer getNumeroConta(){
        return this.numeroConta;
    }

    @Override
    public String toString() {
        return   "\nBanco   -> "+nomeBanco
                +"\nAgência -> "+numeroAgencia
                +"\nConta   -> "+numeroConta;
    }
    
    public abstract void saque(double valorSaque);
    
    public void deposito(double valorDeposito){
        if (valorMaiorQueZero(valorDeposito)){
            this.saldo += valorDeposito;
            System.out.println("Valor depositado!");
        }else System.out.println("Valor não depositado!");
    }
    
    private boolean valorMaiorQueZero(double valorComparado){
        return valorComparado >= 0;
    }
    
    public abstract String saldoConta();
    
    public Conta(String nomeBanco, double saldo, Integer numeroAgencia, Integer numeroConta) {
        this.nomeBanco = nomeBanco;
        this.saldo = saldo;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
    }
    
    
}
