/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Artikal;
import forme.modeli.ModelTblArtikal;
import java.awt.Frame;
import java.net.SocketException;
import javax.swing.JOptionPane;
import logic.Kontroler;
import transfer.util.JedinicaMere;

/**
 *
 * @author alekd_000
 */
public class FrmArtikliPojedinacno extends javax.swing.JFrame {

    Artikal artikal;
    Mod mod;
    
    ModelTblArtikal mta;
    
    /**
     * Creates new form FrmArtikliPojedinacno
     */
    public FrmArtikliPojedinacno(Frame frame, boolean rootPaneCheckingEnabled, Mod mod, Artikal artikal, ModelTblArtikal mta) {
        this.artikal = artikal;
        initComponents();
        setLocationRelativeTo(null);
        this.mta = mta;
        lblSifraArtiklaVal.setVisible(false);
        lblNazivArtiklaVal.setVisible(false);
        lblCenaVal.setVisible(false);
        this.mod = mod;
        
        if (mod == Mod.VIEW) {
            txtSifraArtikla.setEnabled(false);
            txtNazivArtikla.setEnabled(false);
            cbJedinicaMere.setEnabled(false);
            txtCena.setEnabled(false);            
            btnSacuvaj.setVisible(false);
        }
        
        if (mod == Mod.EDIT) {
            txtSifraArtikla.setEnabled(false);
        }
        
        if (mod == Mod.EDIT || mod == Mod.VIEW) {
            txtSifraArtikla.setText(String.valueOf(artikal.getArtikalID()));
            txtNazivArtikla.setText(artikal.getNazivArtikla());
            cbJedinicaMere.setSelectedItem(artikal.getJedinicaMere());
            txtCena.setText(String.valueOf(artikal.getCena()));          
        }

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSifraArtikla = new javax.swing.JTextField();
        txtNazivArtikla = new javax.swing.JTextField();
        txtCena = new javax.swing.JTextField();
        lblSifraArtiklaVal = new javax.swing.JLabel();
        lblNazivArtiklaVal = new javax.swing.JLabel();
        lblCenaVal = new javax.swing.JLabel();
        btnSacuvaj = new javax.swing.JButton();
        cbJedinicaMere = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artikal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci o artiklu"));

        jLabel1.setText("Sifra artikla");

        jLabel2.setText("Naziv artikla");

        jLabel3.setText("Jedinica mere");

        jLabel4.setText("Cena");

        txtCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCenaActionPerformed(evt);
            }
        });

        lblSifraArtiklaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblSifraArtiklaVal.setText("Morate uneti šifru artikla!");

        lblNazivArtiklaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblNazivArtiklaVal.setText("Morate uneti naziv artikla!");

        lblCenaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblCenaVal.setText("Morate uneti cenu!");

        btnSacuvaj.setText("Sačuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbJedinicaMere, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNazivArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNazivArtiklaVal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSifraArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSifraArtiklaVal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCenaVal)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSifraArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSifraArtiklaVal))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNazivArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNazivArtiklaVal))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbJedinicaMere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCenaVal))
                .addGap(28, 28, 28)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCenaActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        
        try {
          
            if (!validacija()) {
                return;
            }
            artikal.setArtikalID(Integer.parseInt(txtSifraArtikla.getText()));
            artikal.setNazivArtikla(txtNazivArtikla.getText());
            artikal.setJedinicaMere((JedinicaMere) cbJedinicaMere.getSelectedItem());
            artikal.setCena(Double.valueOf(txtCena.getText()));
            if (mod == Mod.NEW) {
                Kontroler.getInstance().kreirajArtikal(artikal);
                mta.dodajArtikal(artikal);
                JOptionPane.showMessageDialog(rootPane, "Artikal uspesno kreiran.");
                dispose();
            }
            if (mod == Mod.EDIT) {
                Kontroler.getInstance().izmeniArtikal(artikal);
                mta.updateArtikal(artikal);
                JOptionPane.showMessageDialog(rootPane, "Artikal uspesno izmenjen.");
                dispose();

            }
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(rootPane, "Konekcija je izgubljena. Ulogujte se ponovo.");
            new FrmKonektovanje().setVisible(true);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cbJedinicaMere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCenaVal;
    private javax.swing.JLabel lblNazivArtiklaVal;
    private javax.swing.JLabel lblSifraArtiklaVal;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtNazivArtikla;
    private javax.swing.JTextField txtSifraArtikla;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        for (JedinicaMere jm : JedinicaMere.values()) {
            cbJedinicaMere.addItem(jm);
        }
    }

    private boolean validacija() {
        boolean validator = true;        
        
        String sifraArtikla = txtSifraArtikla.getText();
        try {
            int sifraArtiklaInt = Integer.parseInt(sifraArtikla);
            if (sifraArtiklaInt <= 0) {
                throw new NumberFormatException();
            }
            artikal.setArtikalID(sifraArtiklaInt);
            lblSifraArtiklaVal.setVisible(false);
        } catch (NumberFormatException ex) {
            validator = false;
            lblSifraArtiklaVal.setVisible(true);
        }
        
        if (txtNazivArtikla.getText().equals("")) {
            validator = false;
        }
        lblNazivArtiklaVal.setVisible(txtNazivArtikla.getText().equals(""));
        
        String cenaArtikla = txtCena.getText();
        try {
            double cenaArtiklaInt = Double.parseDouble(cenaArtikla);
            if (cenaArtiklaInt <= 0) {
                throw new NumberFormatException();
            }
            artikal.setCena(cenaArtiklaInt);
            lblCenaVal.setVisible(false);
        } catch (NumberFormatException ex) {
            validator = false;
            lblCenaVal.setVisible(true);
        }
       
        return validator;
    }
}
