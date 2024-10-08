package DesafioIphone.model;

public class ReprodutorMusical{
    public void Tocar() {
        System.out.println("Iniciando reprodutor de midia");
    }

    public void Pausar() {
        System.out.println("Reprodutor de midia pausado");
    }

    public void SelecionarMusica(String musica) {
        System.out.println("Reproduzindo musica " + musica);
    }

    public void ReproduzindoFilme(String midia){
        System.out.println("Reproduzindo " + midia);
    }
}
