package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        int total = tabuleiro.getLinhas() * tabuleiro.getColunas();

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservadores(e -> {
//          o invokeLater() é tipo um "Thread.sleep()" o qual só vai executar após todos os eventos
//          que estão rodando terminarem de processar
            SwingUtilities.invokeLater(() -> {
                if(e.isGanhou()) {
                    JOptionPane.showMessageDialog(this, "VOCÊ GANHOU!!! :D");
                } else {
                    JOptionPane.showMessageDialog(this, "Você perdeu... D:");
                }
                tabuleiro.reiniciar();
            });
        });
    }
}
