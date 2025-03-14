package ExUsuario;

import javax.swing.*;
import static javax.swing.JOptionPane.*;
import static  java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
public class Util {

    private Bilhete [] bilhete = new Bilhete[5];
    private int index = 0;

    public void menu (){
        String aux = "Escolha uma opção\n";
        aux += "1. emitir bilhete\n";
        aux += "2. Carregar bilhete\n";
        aux += "3. Exibir saldo \n";
        aux += "4. Passar na catraca \n";
        aux += "5. Finalizar \n";

        int opc;

        while (true) {
            opc = parseInt(showInputDialog(aux));
            if (opc == 5)
                break;
        }
        if (opc < 1 || opc > 5){
            showInputDialog(null, "Opção inválida");
        }
        else {
            switch (opc){
                case 1:
                    emitirBilhete();
                    break;
            }
        }
    }

    public void emitirBilhete(){

        String nome = showInputDialog("Digite o seu nome");
        String perfil = showInputDialog("Digite o seu perfil --> ( Comum, estudante ou professor )");
        long cpf = parseLong(showInputDialog("Digite o CPF"));
        Usuario usuario = new Usuario(nome, perfil, cpf);
        bilhete[index] = new Bilhete(usuario);
        index++;


    }

}
