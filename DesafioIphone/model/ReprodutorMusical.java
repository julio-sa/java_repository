package DesafioIphone.model;

public class ReprodutorMusical{
    public void tocar() {
        System.out.println("Iniciando reprodutor de midia");
    }

    public void pausar() {
        System.out.println("Reprodutor de midia pausado");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo musica " + musica);
    }

    public void reproduzindoFilme(String midia){
        System.out.println("Reproduzindo " + midia);
    }
}
