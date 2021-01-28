package atividademodulo7;


public class AtividadeModulo7 {

    
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente("Banco Novo", 2000d, 001, 1234, 1000d);
        Conta conta2 = new ContaPoupanca("Banco Velho", 500, 002, 5678, 17, 1.8);
        Conta conta3 = new ContaSalario("Banco Nem Velho Nem Novo", 1045, 003, 1020, 5);
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        
        conta1.saque(800);
    }
    
}

