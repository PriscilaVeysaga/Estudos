package aula02;

public class ClienteApp {

    public static void main(String[] args){
        
        ClientePF clientepf1 = new ClientePF("Priscila", "rua das flores", "123456");
        ClientePJ clientepj1 = new ClientePJ("Sheila", "rua das margaridas", "654321");

        System.out.println("cliente pf dados: " + clientepf1.getNome() + ", " 
                                                + clientepf1.getEndereco() + ", " 
                                                + clientepf1.getCpf() );

        System.out.println("cliente pj dados: " + clientepj1.getNome() + " ," 
                                                + clientepj1.getEndereco() + ", " 
                                                + clientepj1.getCnpj() );

    }
}
