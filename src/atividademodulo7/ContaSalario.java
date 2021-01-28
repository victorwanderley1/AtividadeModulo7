/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividademodulo7;

/**
 *
 * @author Victor
 */
public class ContaSalario extends Conta{
    private final int limiteSaques;
    private int saquesFeitos;

    public ContaSalario(String nomeBanco, double saldo, Integer numeroAgencia, Integer numeroConta, int limiteSaques) {
        super(nomeBanco, saldo, numeroAgencia, numeroConta);
        this.limiteSaques = limiteSaques;
        this.saquesFeitos = 0;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void saque(double valorSaque) {
        if (limiteSaques < saquesFeitos){
            if (valorSaque <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - valorSaque);
                this.saquesFeitos++;
                //Pode ser substituido por um método para imprimir o saldo fora da função 
                System.out.printf("Saldo restante R$: %.2f", this.getSaldo());
            }else System.out.println("Valor insuficiente!");
        }else System.out.println("Quantidade de saques excedida");
    }

    @Override
    public String saldoConta() {
        return "\nSaldo em conta: R$ "+this.saldo;
    }
    
    public void limparQuantidadeDeSaques(){
        this.saquesFeitos = 0;
    }
    private String quantSaquesRestantes(){
        return "\nQuantidade de Saques Restantes: "+String.valueOf(this.limiteSaques-this.saquesFeitos);
    }
    @Override
    public String toString() {
        return super.toString()+saldoConta()+quantSaquesRestantes();
    }
}
