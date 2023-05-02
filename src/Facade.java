public class Facade {
    private ClienteBanco nomeCliente;
    private ContaBancaria numeroConta;

    public Facade(){
        this.nomeCliente = new ClienteBanco();
        this.numeroConta = new ContaBancaria();
    }
    public ClienteBanco getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(ClienteBanco nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public ContaBancaria getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(ContaBancaria numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void fazerDeposito(float valor, ClienteBanco nomeCliente, ContaBancaria numeroConta){
        System.out.printf("Ola, o beneficiario de seu deposito e o(a) cliente %s\n", nomeCliente.obterNomeCliente());
        System.out.printf("Voce escolhe a conta %s\n", numeroConta.obterNumConta());
        System.out.printf("O saldo desta conta e: %.2f\n", numeroConta.obterSaldo());
        System.out.printf("Voce esta depositando R$: %s\n", numeroConta.setSaldo(numeroConta.getSaldo() + valor));
        System.out.printf("Depositado R$ %.2f na conta de %s\n", valor, nomeCliente.obterNomeCliente());
        System.out.printf("O saldo desta conta e: R$ %.2f", numeroConta.obterSaldo());
    }
}
