package com.gft.desafio.oop;

public class VideoGame extends Produto implements Imposto {

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(){}

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    double imposto = 0;
    @Override
    public double calculaImposto() {

        if(isUsado()) {
            imposto = ((getQtd() * getPreco()) / 100) * 25;
        } else {
            imposto = ((getQtd() * getPreco()) / 100) * 45;
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "\n *** Video Game *** " +
                "\nNome: " + getNome() +
                "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nisUsado: " + isUsado() +
                "\nPreço: R$ " + getPreco() +
                "\nQuantidade: " + getQtd() +
                "\nPreço total: R$ " + ((getQtd() * getPreco()) + calculaImposto()) +
                "\nImposto: R$ " + calculaImposto();
    }
}
