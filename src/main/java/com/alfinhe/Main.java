package com.alfinhe;

import javax.swing.*;

public class Main {
    public static void main( String[] args ) {
        Diciplina diciplina = new Diciplina ( );

        Formando formando;
        String nome;
        double nota;
        for (int i = 0; i < 10; i++) {
            nome = JOptionPane.showInputDialog ( "Escreva o nome do Fernado:" );
            nota = Double.parseDouble ( JOptionPane.showInputDialog ( "Escreva a nota do Fernado:" ) );
            formando = new Formando ( );
            formando.setNome ( nome );
           formando.setNota ( String.valueOf ( nota ) );
            diciplina.listaFormandos.add ( formando );
            for (Formando form : diciplina.listaFormandos) {
                System.out.println ( form.getNome ( ) );
                System.out.println ( form.getNota ( ) );
            }
        }
    }
}