package com.alfinhe;

public class Formando {

 private String nome;
 private String nota;

    public String getNome( ) {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }
    public String getNota( ) {
        return nota;
    }
    public void setNota( String nota ) {
        this.nota = nota;
    }
    public Formando( String nome, String nota ) {
        this.nome = nome;
        this.nota = nota;
    }

    public Formando( ) {
    }
}
