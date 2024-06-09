package com.mobile;

import com.mobile.funcionalidades.IAparelhoTelefonico;
import com.mobile.funcionalidades.INavegador;
import com.mobile.funcionalidades.IReprodutor;
import com.mobile.funcionalidades.reprodutores.IReprodutorMusical;
import com.mobile.funcionalidades.reprodutores.IReprodutorVideo;

public class Iphone implements INavegador, IAparelhoTelefonico, IReprodutorVideo, IReprodutorMusical {
    //navegador
    public void acessarPagina(String url) {
        System.out.println("Acessando pagina " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba de pesquisa");
    }

    //telefone

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

    //reprodutor
    @Override
    public void iniciar() {
        System.out.println("Iniciando player");
    }

    @Override
    public void pausar() {
        System.out.println("Player pausado");
    }

    @Override
    public void anterior() {
        System.out.println("Reproduzir o player anterior");
    }

    @Override
    public void proximo() {
        System.out.println("Reproduzir o player seguinte");
    }
    //musica

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void sairMusica() {
        System.out.println("Saindo da musica");
    }

    //Video

    @Override
    public void selecionarVideo(String Video) {
        System.out.println("Video selecionado: " + Video);
    }

    @Override
    public void ampĺicarVideo() {
        System.out.println("Amplicando imagem do video");
    }

    @Override
    public void rotacionarVideo() {
        System.out.println("Rotacionado video");
    }

    @Override
    public void sairVideo() {
        System.out.println("Saindo do video");
    }
}
