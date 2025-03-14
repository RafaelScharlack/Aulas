package ExUsuario;

public class Usuario {

    String nome;
    long cpf;
    String perfil;

    public Usuario(String perfil, String nome, long cpf) {
        this.perfil = perfil;
        this.nome = nome;
        this.cpf = cpf;
    }
}
