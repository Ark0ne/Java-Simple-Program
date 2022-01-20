/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penentunilaimahasiswa;

//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.JOptionPane;
import mainmenu.MainMenu;

/**
 *
 * @author acer
 */
public class PenilaiMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form PenilaiMahasiswa
     */
    private double hasil;
    private String grade, keterangan;

    public PenilaiMahasiswa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNama = new javax.swing.JPanel();
        labelNamaLengkap = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        panelButton = new javax.swing.JPanel();
        buttonHitung = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        panelHasil = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        labelRata = new javax.swing.JLabel();
        labelGrade = new javax.swing.JLabel();
        labelHasil = new javax.swing.JLabel();
        panelNilai = new javax.swing.JPanel();
        labelUts = new javax.swing.JLabel();
        labelTM = new javax.swing.JLabel();
        labelUAS = new javax.swing.JLabel();
        txtTM = new javax.swing.JTextField();
        txtUTS = new javax.swing.JTextField();
        txtUAS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        panelNama.setBackground(new java.awt.Color(255, 255, 102));

        labelNamaLengkap.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelNamaLengkap.setForeground(new java.awt.Color(0, 0, 0));
        labelNamaLengkap.setText("Nama Lengkap ");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelNamaLayout = new javax.swing.GroupLayout(panelNama);
        panelNama.setLayout(panelNamaLayout);
        panelNamaLayout.setHorizontalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelNamaLayout.setVerticalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelButton.setBackground(new java.awt.Color(255, 204, 204));

        buttonHitung.setText("Hitung");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });
        panelButton.add(buttonHitung);

        buttonClear.setText("Bersihkan");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        panelButton.add(buttonClear);

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        panelButton.add(buttonSimpan);

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        panelButton.add(buttonKeluar);

        panelHasil.setBackground(new java.awt.Color(204, 204, 255));
        panelHasil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        labelNama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(0, 0, 0));
        labelNama.setText("Nama :");

        labelRata.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelRata.setForeground(new java.awt.Color(0, 0, 0));
        labelRata.setText("Nilai Rata Rata :");

        labelGrade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelGrade.setForeground(new java.awt.Color(0, 0, 0));
        labelGrade.setText("Grade :");

        labelHasil.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelHasil.setForeground(new java.awt.Color(0, 0, 0));
        labelHasil.setText("Hasil :");

        javax.swing.GroupLayout panelHasilLayout = new javax.swing.GroupLayout(panelHasil);
        panelHasil.setLayout(panelHasilLayout);
        panelHasilLayout.setHorizontalGroup(
            panelHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHasilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNama)
                    .addComponent(labelRata)
                    .addComponent(labelGrade)
                    .addComponent(labelHasil))
                .addGap(37, 37, 37))
        );
        panelHasilLayout.setVerticalGroup(
            panelHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHasilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHasil)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelNilai.setBackground(new java.awt.Color(204, 204, 255));
        panelNilai.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nilai", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        labelUts.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelUts.setForeground(new java.awt.Color(0, 0, 0));
        labelUts.setText("UTS");

        labelTM.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelTM.setForeground(new java.awt.Color(0, 0, 0));
        labelTM.setText("TM");

        labelUAS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelUAS.setForeground(new java.awt.Color(0, 0, 0));
        labelUAS.setText("UAS");

        txtTM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTMKeyTyped(evt);
            }
        });

        txtUTS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUTSKeyTyped(evt);
            }
        });

        txtUAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUASKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelNilaiLayout = new javax.swing.GroupLayout(panelNilai);
        panelNilai.setLayout(panelNilaiLayout);
        panelNilaiLayout.setHorizontalGroup(
            panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNilaiLayout.createSequentialGroup()
                        .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNilaiLayout.createSequentialGroup()
                                .addComponent(labelTM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTM, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addGroup(panelNilaiLayout.createSequentialGroup()
                                .addComponent(labelUAS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUAS)))
                        .addGap(17, 17, 17))
                    .addGroup(panelNilaiLayout.createSequentialGroup()
                        .addComponent(labelUts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUTS)
                        .addGap(18, 18, 18))))
        );
        panelNilaiLayout.setVerticalGroup(
            panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNilaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUts)
                    .addComponent(txtUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTM)
                    .addComponent(txtTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUAS)
                    .addComponent(txtUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(panelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(415, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setEmpty() {
        txtNama.setText("");
        txtUTS.setText("");
        txtTM.setText("");
        txtUAS.setText("");
        labelNama.setText("Nama :");
        labelRata.setText("Nilai Rata-Rata :");
        labelGrade.setText("Grade :");
        labelHasil.setText("Hasil :");
    }

    private void setMsgEmpty() {
        if (txtNama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "MASUKAN NAMA LENGKAP !!", "EROR", JOptionPane.ERROR_MESSAGE);
            txtNama.requestFocus();
        } else if (txtUTS.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "MASUKAN NILAI UTS !!", "EROR", JOptionPane.ERROR_MESSAGE);
            txtUTS.requestFocus();
        } else if (txtTM.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "MASUKAN NILAI TM !!", "EROR", JOptionPane.ERROR_MESSAGE);
            txtTM.requestFocus();
        } else if (txtUAS.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "MASUKAN NILAI UAS !!", "EROR", JOptionPane.ERROR_MESSAGE);
            txtUAS.requestFocus();
        }
    }

    private double hasilHitung() {
        double UTS, TM, UAS;
        UTS = Double.parseDouble(txtUTS.getText());
        TM = Double.parseDouble(txtTM.getText());
        UAS = Double.parseDouble(txtUAS.getText());

        hasil = (UTS + TM + UAS) / 3;

        return hasil;
    }

    private void ketGrade() {
        if (hasil >= 90 && hasil <= 100) {
            grade = "A";
        } else if (hasil >= 80 && hasil <= 89) {
            grade = "B";
        } else if (hasil >= 70 && hasil <= 79) {
            grade = "C";
        } else if (hasil >= 0 && hasil <= 69) {
            grade = "D";
        }
    }

    private void ketHasil() {
        if (grade == "A" || grade == "B" || grade == "C") {
            keterangan = "Lulus";
        } else if (grade == "D") {
            keterangan = "Tidak Lulus";
        }
    }

    private void keyNumerik(KeyEvent key) {
        char c = key.getKeyChar();
        if (!((Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_ENTER)
                || (c == KeyEvent.VK_PERIOD)))) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukan Nilai Numerik Dengan Benar");
            key.consume();
        }
    }

    private void keyAlpha(KeyEvent key) {
        char c = key.getKeyChar();
        if (!((Character.isAlphabetic(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_ENTER)
                || (c == KeyEvent.VK_PERIOD)))) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukan Huruf Alphabeth Dengan Benar");
            key.consume();
        }
    }
    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // TODO add your handling code here:
        if (txtNama.getText().trim().equals("") || txtUTS.getText().trim().equals("")
                || txtTM.getText().trim().equals("") || txtUAS.getText().trim().equals("")) {
            setMsgEmpty();
        } else {
            hasilHitung();
            ketGrade();
            ketHasil();
            labelNama.setText("Nama : " + txtNama.getText());
            labelRata.setText("Nilai Rata-Rata : " + (String.valueOf(String.format("%.2f", hasil))));
            labelGrade.setText("Grade : " + grade);
            labelHasil.setText("Hasil :" + keterangan);
        }
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        setEmpty();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        dispose();

    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("HitungNilai.txt"));
            String simpan = labelNama.getText() + '\n'
                    + labelRata.getText() + '\n'
                    + labelGrade.getText() + '\n'
                    + labelHasil.getText();
            out.write(simpan);
            JOptionPane.showMessageDialog(null, "File Berhasil Disimpan");
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void txtUTSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUTSKeyTyped
        // TODO add your handling code here:
        keyNumerik(evt);
    }//GEN-LAST:event_txtUTSKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
        keyAlpha(evt);
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtTMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTMKeyTyped
        // TODO add your handling code here:
        keyNumerik(evt);
    }//GEN-LAST:event_txtTMKeyTyped

    private void txtUASKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUASKeyTyped
        // TODO add your handling code here:
        keyNumerik(evt);
    }//GEN-LAST:event_txtUASKeyTyped

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
            java.util.logging.Logger.getLogger(PenilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenilaiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelGrade;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNamaLengkap;
    private javax.swing.JLabel labelRata;
    private javax.swing.JLabel labelTM;
    private javax.swing.JLabel labelUAS;
    private javax.swing.JLabel labelUts;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelHasil;
    private javax.swing.JPanel panelNama;
    private javax.swing.JPanel panelNilai;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTM;
    private javax.swing.JTextField txtUAS;
    private javax.swing.JTextField txtUTS;
    // End of variables declaration//GEN-END:variables
}