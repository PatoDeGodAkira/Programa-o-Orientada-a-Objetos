package at10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at10 {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Barra de Progresso");
        janela.setSize(400, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        JButton botaoCarregar = new JButton("Carregar");

        botaoCarregar.addActionListener(e -> {
            botaoCarregar.setEnabled(false);
            
            SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= 100; i++) {
                        if (i == 75) {
                            for (int j = 75; j < 85; j++) {
                                Thread.sleep(200);
                                publish(j);
                            }
                            JOptionPane.showMessageDialog(janela, "O código não deu erro não, tô só brincando!");
                        }
                        
                        if (i == 99) {
                            publish(90);
                            Thread.sleep(1000);
                            JOptionPane.showMessageDialog(janela, "Mas se eu quisesse que desse erro... hehe");
                            publish(99);
                        }
                        
                        Thread.sleep(50);
                        publish(i);
                    }
                    return null;
                }

                @Override
                protected void process(java.util.List<Integer> chunks) {
                    for (int chunk : chunks) {
                        progressBar.setValue(chunk);
                    }
                }

                @Override
                protected void done() {
                    JOptionPane.showMessageDialog(janela, "Processo concluído!");
                    botaoCarregar.setEnabled(true);
                }
            };
            
            worker.execute();
        });

        janela.add(progressBar);
        janela.add(botaoCarregar);
        janela.setVisible(true);
    }
}