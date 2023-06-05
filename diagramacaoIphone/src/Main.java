import iPhone.IPhone;
import iPhone.Ligacao;
import iPhone.Navegador;
import iPhone.ReprodutorMusucal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Ligacao ligacao = new Ligacao();
        Navegador Navegador = new Navegador();
        ReprodutorMusucal repodutor = new ReprodutorMusucal();

        ligacao.ligarCelular();
        ligacao.ligar();
        ligacao.atender();
        ligacao.desligarCelular();
    }
}