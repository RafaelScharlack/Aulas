package ExUsuario;

import java.util.Random;

public class Bilhete {

    static final double TARIFA = 5.20;
    long numero;
    double saldo;
    Usuario usuario;


    public Bilhete(Usuario usuario) {
        numero = gerarNumero();
        this.usuario = usuario;
    }

    public long gerarNumero() {
        Random random = new Random();
        return random.nextLong(1000, 10000);
    }

    //Método para carregar bilhete
    public void carregarBilhete(double valor) {
        saldo += valor;

    }
    //método para consutar o saldo do bilhete
    public double consultarSaldo() {
        return saldo;
    }
    // método para passar na catraca
    public String passarNaCatraca(){
        double debito = TARIFA / 2;
        if (usuario.perfil.equalsIgnoreCase("Comum")){
            debito = TARIFA;
        }
        if (saldo >= debito){
            saldo -= debito;
            return "Catraca liberada";
        }
       return "Saldo insuficiente";
    }
}
