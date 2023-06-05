package iPhone;

public class Navegador extends IPhone {


    public void exibirPagina(String pagina){
        System.out.println("Exibindo pagina: "+ pagina);
    }

    public void adicionarAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(String pagina){
        System.out.println("Pagina Atualizada");
    }
}
