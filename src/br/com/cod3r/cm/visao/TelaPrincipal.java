package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(30, 16, 50 );
//        Tabuleiro tabuleiro = new Tabuleiro(3, 3, 1 );
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(720, 690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

    // TODO futuramente,adicionar novos níveis de dificuldade (fácil, médio, difícil) + timer e outras coisas que eu for tendo ideia
}
