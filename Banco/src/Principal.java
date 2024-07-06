public class Principal {

    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");


        Conta cc = new ContaCorrente(bruno);
        cc.depositar(100);
    

        Conta cp = new ContaPoupanca(bruno);

        cc.transferir(50, cp);

        cc.ImprimirExtrato();
        cc.ImprimirInfosComuns();
        System.out.println("   ");
        cp.ImprimirExtrato();
        cp.ImprimirInfosComuns();

    }
}