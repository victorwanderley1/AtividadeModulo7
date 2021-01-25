package atividademodulo7;

/**
 *
 * @author Victor
 */
public class ContaCorrente extends Conta{
    private Double saldoChequeEspecial;

    public ContaCorrente(String nomeBanco, Double saldo, Integer numeroAgencia, Integer numeroConta, Double saldoChequeEspecial) {
        super(nomeBanco, saldo, numeroAgencia, numeroConta);
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
        if (valorSaque <= this.getSaldo() - this.saldoChequeEspecial){
            this.saldo -= valorSaque;
            System.out.println("Saque sem utilizar cheque especial\n "
                    + "Valor atual: R$ " + this.getSaldo());
        }
        else if (valorSaque <= this.getSaldo()){
            valorSaque -= this.saldo;
            this.saldo = 0;
            this.saldoChequeEspecial -= valorSaque;
            System.out.println("Saque utilizando cheque especial\n "
                    + "Valor atual: R$ " + this.getSaldo());
        }
        else System.out.println("Valor insuficiente!");
    } 
    
    
}
