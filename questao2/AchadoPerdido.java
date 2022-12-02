package br.com.questao2;

public class AchadoPerdido implements Publicacao{
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public void AchadoPerdido(String titulo, String descricao, String tipo, String status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora){
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }

    public String visualizarDetalhes(){
        return "Titulo: " +titulo + "\nDescricao: " + descricao + "\nTipo: " +  tipo + "\nStatus: " + status + "\nFoto: " + foto + "\nLocal achado: " + local_achado + "\nData Hora: " + data_hora;
    }

    @Override
    public Boolean buscarTitulo(String titulo) {
        if(titulo != " "){
            return true;
        }
        return false;
    }
}
