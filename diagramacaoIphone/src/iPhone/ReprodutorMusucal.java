package iPhone;

public class ReprodutorMusucal extends IPhone{


    public void tocar(){
        System.out.println("Tocando Musica");
    }

    public void pausar(){
        System.out.println("Musica Pausada");
    }

    public void tocar(String music){

        System.out.println("Agora Tocando Musica: " + music);
    }

}

