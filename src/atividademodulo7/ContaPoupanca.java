package atividademodulo7;

/**
 *
 * @author Victor
 */
public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(String nomeBanco, double saldo, Integer numeroAgencia, Integer numeroConta, int diaAniversario, double taxaDeJuros) {
        super(nomeBanco, saldo, numeroAgencia, numeroConta);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }
    
    
    @Override
    public double getSaldo() {
        return this.saldo + this.taxaDeJuros*saldo;
    }

    @Override
    public void saque(double valorSaque) {
        this.saldo = this.getSaldo();
        if (valorSaque <= this.saldo){
            this.saldo -= valorSaque;  
        }
    }
    
}
