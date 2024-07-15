import NavegadorInternet.adicionarNovaAba;
import NavegadorInternet.atualizarPagina;
import NavegadorInternet.exibirPagina;
import NavegadorInternet.navegadorInternet;
import ReprodutorMusical.pausar;
import ReprodutorMusical.reprodutorMusical;
import ReprodutorMusical.selecionarMusica;
import ReprodutorMusical.tocar;
import Telefone.atender;
import Telefone.iniciarCorreioVoz;
import Telefone.ligar;
import Telefone.telefone;

public class smartPhone {
    public static void main(String[] args) {
    telefone celular = new ligar();
    telefone celularAtender = new atender();
    telefone celularVoz = new iniciarCorreioVoz();
       
        celular.AppTelefone();
        celularAtender.AppTelefone();
        celularVoz.AppTelefone();

        System.out.println("\n _________________");
    
    reprodutorMusical player = new tocar();
    reprodutorMusical playerPause = new pausar();
    reprodutorMusical playerSelecionar = new selecionarMusica();

    player.AppMusica();
    playerPause.AppMusica();
    playerSelecionar.AppMusica();

        System.out.println("\n____________________");

    navegadorInternet web = new exibirPagina();
    navegadorInternet webAtualizar = new atualizarPagina();
    navegadorInternet webNovaAba = new adicionarNovaAba();

    web.AppNavegador();
    webNovaAba.AppNavegador();
    webAtualizar.AppNavegador();




    
    


    
}
}
