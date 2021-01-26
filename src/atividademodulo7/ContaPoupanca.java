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
        if (valorSaque <= this.saldo){
            this.saldo -= valorSaque;
            //Pode ser substituido por um método para imprimir o saldo fora da função 
            System.out.printf("Saldo restante R$: %.2f", this.getSaldo());
        }
    }
    
}
