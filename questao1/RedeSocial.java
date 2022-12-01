package br.com.questao1;
import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial extends Publicacao{
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();



    public RedeSocial(String dataPublicacao, String textoPublicacao, String linkMidia, String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        super();
        contadorPublicacao--;
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }

    public void imprimePublicacoes(){
        JOptionPane.showMessageDialog(null, "Numero de publicações: " + getContadorPublicacao());
        for(int i = 0; i< publicacoes.size(); i++){
            JOptionPane.showMessageDialog(null, "Data publicacao :" + publicacoes.get(i).getDataPublicacao() + "\n" + "Texto publicação: " + publicacoes.get(i).getTextoPublicacao());
        }
    }
}
