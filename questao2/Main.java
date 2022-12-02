package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        AchadoPerdido ap = new AchadoPerdido();

        ap.AchadoPerdido("452", "Anel dourado", "Joia", "Perdido");
        ap.completaDados("foto.png","Super Mercado", "22:33  15/10/2005");
        System.out.println(ap.visualizarDetalhes());
    }
}
