public class AplicacaoCliente {

    public static void main(String[] args){
        ClienteBanco cliente = new ClienteBanco("Luiz Fernando Pereira");
        ContaBancaria conta = new ContaBancaria("1234-5");

        Facade facade = new Facade();
        facade.fazerDeposito(1500, cliente, conta);
    }
}
