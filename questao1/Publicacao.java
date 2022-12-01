package br.com.questao1;

public class Publicacao {

    public static double contadorPublicacao;
    private String dataPublicacao;
    private String textoPublicacao;
    private String linkMidia;



    public Publicacao() {
        contadorPublicacao+= 1;
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }
}
