package org.example.modelos.modelos;


import org.example.modelos.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

  public Filme(String dogville, int i) {
    super();
  }

  public Filme() {

  }
}
