# Desafio de orientação a objetos em Java

### Diagrama UML
```mermaid
classDiagram
    class Reprodutor {
        +iniciar()
        +pausar()
        +proximo()
        +anterior()
    }

    class ReprodutorMusical {
        +selecionarMusica(String exemplo)
        +sairMusica()
    }
    
    RepodutorMusical --> Reprodutor
    
    class ReprodutorVideo {
        +selecionarVideo()
        +rotacionarVideo()
        +ampliarVideo()  
        +sairVideo() 
    }
    
    RepodutorVideo --> Reprodutor

    class AparelhoTelefonico {
        +atender()
        +ligar(String numero)
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +acessarPagina(String url)
        +atualizarPagina()
    }

    class iPhone {
    }
    
    iPhone --> ReprodutorVideo --> Reprodutor
    iPhone --> ReprodutorMusical --> Reprodutor
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```