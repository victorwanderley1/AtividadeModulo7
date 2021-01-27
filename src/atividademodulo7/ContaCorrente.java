package atividademodulo7;

/**
 *
 * @author Victor
 */
public class ContaCorrente extends Conta{
    private double saldoChequeEspecial;

    public ContaCorrente(String nomeBanco, Double saldo, Integer numeroAgencia, Integer numeroConta, Double saldoChequeEspecial) {
        super(nomeBanco, saldo, numeroAgencia, numeroConta);
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }
    
    @Override
    public String toString() {
        return "ContaCorrente{" + "saldoChequeEspecial=" + saldoChequeEspecial + '}';
    }

    @Override
    public double getSaldo() {
        return this.saldoChequeEspecial + this.saldo;
    }
    
    @Override
    public void saque(double valorSaque){
        if (verificadorPossivelSacarSemChequeEspecial(valorSaque)){
            saqueSemChequeEspecial(valorSaque);
            System.out.println("Saque sem utilizar cheque especial\n "
                    + "Valor atual: R$ " + this.getSaldo());
        }
        else if (verificadorPossivelSacarComChequeEspecial(valorSaque)){
            saqueComChequeEspecial(valorSaque);
            System.out.println("Saque utilizando cheque especial\n "
                    + "Valor atual: R$ " + this.getSaldo());
        }
        else System.out.println("Valor insuficiente!");
        
        System.out.printf("Saldo restante R$: %.2f", this.getSaldo());
    } 
    
    private void saqueComChequeEspecial(double valorSaque){
        valorSaque -= this.saldo;
        zerarSaldo();
        this.setSaldoChequeEspecial(this.saldoChequeEspecial - valorSaque);
    }
    
    private void saqueSemChequeEspecial(double valorSaque){
       this.saldo -= valorSaque;
    }
    
    private boolean verificadorPossivelSacarComChequeEspecial (double valorVerificado){
        return valorVerificado <= this.getSaldo();
    }
    
    private boolean verificadorPossivelSacarSemChequeEspecial (double valorVerificado){
        return valorVerificado <= this.getSaldo() - this.saldoChequeEspecial;
    }
    
    private void zerarSaldo(){
        this.saldo = 0;
    } 
    
    @Override
    public String saldoConta(){
        return "Saldo em conta: R$ "+this.saldo
                +"\n Saldo cheque-especial"+this.saldoChequeEspecial;
    }
}
