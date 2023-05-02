public class ContaBancaria {
    private String numeroConta;
    private float saldo;

    public float getSaldo(){
        return saldo;
    }
    public float setSaldo(float saldo){
        this.saldo = saldo;
        return saldo;
    }
    public float depositar(float valor){
        System.out.println("Depositando");
        return this.setSaldo(this.getSaldo() + valor);
    }
    //metodo usado na classe Facade
    public String obterNumConta(){
        System.out.println("Obtendo numero da conta");
        return this.numeroConta;
    }//metodo usado na classe Facade
    public float obterSaldo(){
        System.out.println("Obtendo saldo");
        return this.getSaldo();
    }
    //construtor vazio sera usado na classe Facade
    public ContaBancaria(){}
    //construtor sera usado na aplicacao cliente
    public ContaBancaria(String conta){
        this.numeroConta = conta;
    }
}
