public class ClienteBanco {
    private String nomeCliente;
    public String obterNomeCliente(){
        return this.nomeCliente;
    }
    //construtor vazio sera usado na classe Facade
    public ClienteBanco(){}
    //construtor sera usado para instanciar um objeto
    public ClienteBanco(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
}
