/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Konobar;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Kontroler;

/**
 *
 * @author alekd_000
 */
public class FrmPocetnaAdmin extends javax.swing.JFrame {

    Konobar konobar;
    /**
     * Creates new form FrmPocetna
     */
    public FrmPocetnaAdmin(Konobar konobar) {
        initComponents();
        this.konobar = konobar;
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnKonobari = new javax.swing.JButton();
        btnArtikli = new javax.swing.JButton();
        btnNarudzbine = new javax.swing.JButton();
        btnIzlaz = new javax.swing.JButton();
        txtKonobar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Glavni meni");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Caffe INFINITY");

        btnKonobari.setText("Konobari");
        btnKonobari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonobariActionPerformed(evt);
            }
        });

        btnArtikli.setText("Artikli");
        btnArtikli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtikliActionPerformed(evt);
            }
        });

        btnNarudzbine.setText("Narudžbine");
        btnNarudzbine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNarudzbineActionPerformed(evt);
            }
        });

        btnIzlaz.setText("Izlaz");
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });

        txtKonobar.setText("jLabel2");

        jLabel3.setText("Zdravo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIzlaz, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKonobar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnKonobari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnArtikli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNarudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKonobar)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(btnKonobari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArtikli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNarudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnIzlaz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonobariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonobariActionPerformed
        
        new FrmKonobari().setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnKonobariActionPerformed

    private void btnArtikliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtikliActionPerformed
        
        new FrmArtikli().setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnArtikliActionPerformed

    private void btnNarudzbineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNarudzbineActionPerformed
        
        new FrmNarudzbine(konobar).setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnNarudzbineActionPerformed

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        try {
            Kontroler.getInstance().odjaviKonobara(konobar);
        } catch (Exception ex) {
            Logger.getLogger(FrmPocetnaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }        
        System.exit(0);
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            Kontroler.getInstance().odjaviKonobara(konobar);
        } catch (Exception ex) {
            Logger.getLogger(FrmPocetnaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtikli;
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnKonobari;
    private javax.swing.JButton btnNarudzbine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtKonobar;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        txtKonobar.setText(konobar.toString());
    }
}
