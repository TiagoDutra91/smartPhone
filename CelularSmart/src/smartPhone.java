import NavegadorInternet.navegadorInternet;
import ReprodutorMusical.reprodutorMusical;
import Telefone.telefone;

public class smartPhone implements navegadorInternet, reprodutorMusical, telefone{

    
    public static void ligar() {
        System.out.println("ligando via smartPhone");
    }
    public void atender() {
        System.out.println("atendendo via smartPhone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz via smartPhone");
    }
    public void tocar() {
        System.out.println("Tocando Musica via smartPhone");
    }
    public void pausar() {
        System.out.println("Pausando Musica via smartPhone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando Musica via smartPhone");
    }
    public void exibirPagina() {
        System.out.println("Exibindo Pagina Web via smartPhone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba via smartPhone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina Web via smartPhone");
    
    }
    }

