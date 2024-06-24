package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        
        //três opções diferentes de chamada do construtor, pois todas foram implementadas
        Pessoa marcos = new Pessoa("12345678909", "Marcos");
        Pessoa carlos = new Pessoa("Carlos");
        Pessoa eduardo = new Pessoa();

        marcos.setEndereco("Rua dos Bobos");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
