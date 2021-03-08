
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class BlocoDeNotas extends javax.swing.JFrame {
    File arquivo;
    /**
     * Creates new form BlocoDeNotas
     */
    public BlocoDeNotas() {
        initComponents();
        arquivo = null;
        FileNameExtensionFilter textoFiltro = new FileNameExtensionFilter("Arquivo de texto", "txt");
        seletorArquivos.addChoosableFileFilter(textoFiltro);
        seletorArquivos.setFileFilter(textoFiltro);
        seletorArquivos.setAcceptAllFileFilterUsed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletorArquivos = new javax.swing.JFileChooser();
        painelTexto = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuNovo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalvar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuCopiar = new javax.swing.JMenuItem();
        menuColar = new javax.swing.JMenuItem();
        menuRecortar = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloco de Notas");

        texto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        painelTexto.setViewportView(texto);

        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuNovo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novo.png"))); // NOI18N
        menuNovo.setText("Novo");
        menuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuNovo);

        menuAbrir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abrir.png"))); // NOI18N
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuAbrir);
        menuArquivo.add(jSeparator1);

        menuSalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        menuSalvar.setText("Salvar");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSalvar);

        jMenuBar1.add(menuArquivo);

        menuEditar.setText("Editar");
        menuEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuCopiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copiar.png"))); // NOI18N
        menuCopiar.setText("Copiar");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        menuEditar.add(menuCopiar);

        menuColar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colar.png"))); // NOI18N
        menuColar.setText("Colar");
        menuColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColarActionPerformed(evt);
            }
        });
        menuEditar.add(menuColar);

        menuRecortar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recortar.png"))); // NOI18N
        menuRecortar.setText("Recortar");
        menuRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecortarActionPerformed(evt);
            }
        });
        menuEditar.add(menuRecortar);

        jMenuBar1.add(menuEditar);

        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuSobre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        int retorno = seletorArquivos.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            arquivo = seletorArquivos.getSelectedFile();
            try{
                BufferedReader bfLeitura = new BufferedReader(new FileReader(arquivo));
                String linha = new String("");
                String textoArquivo = new String("");
                while (linha!=null) {
                    linha = bfLeitura.readLine();
                    if (linha != null) {
                        textoArquivo+=linha;
                    }
                    texto.setText(textoArquivo);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao abrir o arquivo", "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        if (arquivo == null) {
            int retorno = seletorArquivos.showSaveDialog(this);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                arquivo = seletorArquivos.getSelectedFile();
            }
        }
        if (arquivo != null) {
            try {
                BufferedWriter bfEscrita = new BufferedWriter(new FileWriter(arquivo));
                bfEscrita.append(texto.getText());
                bfEscrita.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao salvar o arquivo", "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void menuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoActionPerformed
        texto.setText("");
        arquivo = null;
    }//GEN-LAST:event_menuNovoActionPerformed

    private void menuRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecortarActionPerformed
        texto.cut();
    }//GEN-LAST:event_menuRecortarActionPerformed

    private void menuColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColarActionPerformed
        texto.paste();
    }//GEN-LAST:event_menuColarActionPerformed

    private void menuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopiarActionPerformed
        texto.copy();
    }//GEN-LAST:event_menuCopiarActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlocoDeNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuColar;
    private javax.swing.JMenuItem menuCopiar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuNovo;
    private javax.swing.JMenuItem menuRecortar;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JScrollPane painelTexto;
    private javax.swing.JFileChooser seletorArquivos;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
