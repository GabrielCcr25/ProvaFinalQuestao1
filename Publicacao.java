package br.com.Questao1;

public class Publicacao {
     private String dataPublicacao;
     private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }
}
