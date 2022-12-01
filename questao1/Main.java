package br.com.questao1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String dataC, nome, dataNasc, senha;

        dataC = JOptionPane.showInputDialog("Data: ");
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        dataNasc = JOptionPane.showInputDialog("Data de nascimento: ");
        senha = JOptionPane.showInputDialog("Senha");

        RedeSocial rede = new RedeSocial("a","b","c",dataC, nome, dataNasc, senha);


        Publicacao p1 = new Publicacao();
        p1.setTextoPublicacao(JOptionPane.showInputDialog("Digite o texto da publicação:"));
        p1.setDataPublicacao(JOptionPane.showInputDialog("Digite a data da publicação"));

        Publicacao p2 = new Publicacao();
        p2.setTextoPublicacao(JOptionPane.showInputDialog("Digite o texto da publicação:"));
        p2.setDataPublicacao(JOptionPane.showInputDialog("Digite a data da publicação"));

        rede.inserePublicacao(p1);
        rede.inserePublicacao(p2);
        rede.imprimePublicacoes();

    }
}
