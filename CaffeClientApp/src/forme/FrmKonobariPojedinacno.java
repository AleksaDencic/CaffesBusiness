/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Konobar;
import forme.modeli.ModelTblKonobar;
import java.awt.Frame;
import java.net.SocketException;
import javax.swing.JOptionPane;
import logic.Kontroler;

/**
 *
 * @author alekd_000
 */
public class FrmKonobariPojedinacno extends javax.swing.JFrame {

    Konobar konobar;
    Mod mod;
    ModelTblKonobar mtk;
    /**
     * Creates new form FrmKonobariPojedinacno
     */
    public FrmKonobariPojedinacno(Frame frame, boolean rootPaneCheckingEnabled, Mod mod, Konobar konobar, ModelTblKonobar mtk) {
        this.konobar = konobar;
        this.mtk = mtk;
        initComponents();
        setLocationRelativeTo(null);
        lblSifraKonobaraVal.setVisible(false);
        lblImeVal.setVisible(false);
        lblPrezimeVal.setVisible(false);
        lblAdresaVal.setVisible(false);
        lblBrojTelefonaVal.setVisible(false);
        lblUsernameVal.setVisible(false);
        lblPasswordVal.setVisible(false);
        lblPasswordPonovljenaVal.setVisible(false);
        this.mod = mod;
        
        if (mod == Mod.EDIT || mod == Mod.VIEW) {
            txtKonobarID.setText(konobar.getKonobarID() + "");
            txtIme.setText(konobar.getIme());
            txtPrezime.setText(konobar.getPrezime());
            txtAdresa.setText(konobar.getAdresa());
            txtBrojTelefona.setText(konobar.getBrojTelefona());
            cbAdmin.setSelectedItem(konobar.getAdresa());
            txtUsername.setText(konobar.getUsername());
            txtPassword.setText(konobar.getPassword());   
            txtPasswordPonovljena.setText(konobar.getPassword()); 
        }
        
        if (mod == Mod.VIEW) {
            txtKonobarID.setEnabled(false);
            txtIme.setEnabled(false);
            txtPrezime.setEnabled(false);
            txtAdresa.setEnabled(false);
            txtBrojTelefona.setEnabled(false);
            cbAdmin.setEnabled(false);
            txtUsername.setEnabled(false);
            txtPassword.setVisible(false);
            lblPassword.setVisible(false);
            txtPasswordPonovljena.setVisible(false);
            lblPasswordPonovljena.setVisible(false);
            btnSacuvaj.setVisible(false);
        }
        
        
        if (mod == Mod.EDIT) {
            txtKonobarID.setEnabled(false);
            if(konobar.getUsername() == txtUsername.getText()){
                txtUsername.setEnabled(false);
                txtPassword.setEnabled(false);
                txtPasswordPonovljena.setEnabled(false);
            }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtAdresa = new javax.swing.JTextField();
        txtBrojTelefona = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        cbAdmin = new javax.swing.JComboBox();
        btnSacuvaj = new javax.swing.JButton();
        lblImeVal = new javax.swing.JLabel();
        lblPrezimeVal = new javax.swing.JLabel();
        lblAdresaVal = new javax.swing.JLabel();
        lblBrojTelefonaVal = new javax.swing.JLabel();
        lblUsernameVal = new javax.swing.JLabel();
        lblPasswordVal = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordPonovljena = new javax.swing.JPasswordField();
        lblPasswordPonovljena = new javax.swing.JLabel();
        lblPasswordPonovljenaVal = new javax.swing.JLabel();
        txtKonobarID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblSifraKonobaraVal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konobar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci o konobaru"));

        jLabel2.setText("Ime");

        jLabel3.setText("Prezime");

        jLabel4.setText("Adresa");

        jLabel5.setText("Broj telefona");

        jLabel6.setText("Admin");

        jLabel7.setText("Korisničko ime");

        lblPassword.setText("Password");

        txtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeActionPerformed(evt);
            }
        });

        btnSacuvaj.setText("Sačuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        lblImeVal.setForeground(new java.awt.Color(255, 0, 0));
        lblImeVal.setText("Morate uneti ime!");

        lblPrezimeVal.setForeground(new java.awt.Color(255, 0, 0));
        lblPrezimeVal.setText("Morate uneti prezime!");

        lblAdresaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblAdresaVal.setText("Morate uneti adresu!");

        lblBrojTelefonaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblBrojTelefonaVal.setText("Morate uneti broj telefona!");

        lblUsernameVal.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameVal.setText("Morate uneti korisničko ime!");

        lblPasswordVal.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordVal.setText("Morate uneti lozinku!");

        lblPasswordPonovljena.setText("Ponovite lozinku");

        lblPasswordPonovljenaVal.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordPonovljenaVal.setText("Morate ponoviti unos lozinke!");

        jLabel1.setText("Šifra konobara");

        lblSifraKonobaraVal.setForeground(new java.awt.Color(255, 0, 0));
        lblSifraKonobaraVal.setText("Morate uneti šifru!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(lblPassword)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKonobarID)
                            .addComponent(txtUsername)
                            .addComponent(txtBrojTelefona)
                            .addComponent(txtAdresa)
                            .addComponent(txtPrezime)
                            .addComponent(txtIme)
                            .addComponent(cbAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImeVal)
                            .addComponent(lblPrezimeVal)
                            .addComponent(lblAdresaVal)
                            .addComponent(lblBrojTelefonaVal)
                            .addComponent(lblUsernameVal)
                            .addComponent(lblPasswordVal)
                            .addComponent(lblSifraKonobaraVal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPasswordPonovljena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(txtPasswordPonovljena, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblPasswordPonovljenaVal)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKonobarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblSifraKonobaraVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblImeVal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblPrezimeVal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblAdresaVal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblBrojTelefonaVal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(lblUsernameVal))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassword)
                        .addComponent(lblPasswordVal)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordPonovljena)
                    .addComponent(txtPasswordPonovljena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordPonovljenaVal))
                .addGap(18, 18, 18)
                .addComponent(btnSacuvaj)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        
        try {
          
            if (!validacija()) {
                return;
            }
            konobar.setKonobarID(Integer.parseInt(txtKonobarID.getText()));
            konobar.setIme(txtIme.getText());
            konobar.setPrezime(txtPrezime.getText());
            konobar.setAdresa(txtAdresa.getText());
            konobar.setBrojTelefona(txtBrojTelefona.getText());
            konobar.setAdmin((boolean) cbAdmin.getSelectedItem());
            konobar.setUsername(txtUsername.getText());
            konobar.setPassword(String.valueOf(txtPassword.getPassword()));
            
            if (mod == Mod.NEW) {
                Kontroler.getInstance().kreirajKonobara(konobar);
                mtk.dodajKonobara(konobar);
                JOptionPane.showMessageDialog(rootPane, "Konobar uspesno kreiran.");
                dispose();
            }
            if (mod == Mod.EDIT) {             
                Kontroler.getInstance().izmeniKonobara(konobar);
                mtk.updateKonobar(konobar);
                JOptionPane.showMessageDialog(rootPane, "Konobar uspesno izmenjen.");
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

    private void txtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cbAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdresaVal;
    private javax.swing.JLabel lblBrojTelefonaVal;
    private javax.swing.JLabel lblImeVal;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordPonovljena;
    private javax.swing.JLabel lblPasswordPonovljenaVal;
    private javax.swing.JLabel lblPasswordVal;
    private javax.swing.JLabel lblPrezimeVal;
    private javax.swing.JLabel lblSifraKonobaraVal;
    private javax.swing.JLabel lblUsernameVal;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtBrojTelefona;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKonobarID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordPonovljena;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        cbAdmin.addItem(true);
        cbAdmin.addItem(false);
    }

    private boolean validacija() {
        
        boolean validator = true;  
        
        String sifraKonobara = txtKonobarID.getText();
        try {
            int sifraKonobaraInt = Integer.parseInt(sifraKonobara);
            if (sifraKonobaraInt <= 0) {
                throw new NumberFormatException();
            }
            konobar.setKonobarID(sifraKonobaraInt);
            lblSifraKonobaraVal.setVisible(false);
        } catch (NumberFormatException ex) {
            validator = false;
            lblSifraKonobaraVal.setVisible(true);
        }
        
        if (txtIme.getText().equals("")) {
            validator = false;
        }
        lblImeVal.setVisible(txtIme.getText().equals(""));
        
        if (txtPrezime.getText().equals("")) {
            validator = false;
        }
        lblPrezimeVal.setVisible(txtPrezime.getText().equals(""));
        
        if (txtAdresa.getText().equals("")) {
            validator = false;
        }
        lblAdresaVal.setVisible(txtAdresa.getText().equals(""));
        
        if (txtBrojTelefona.getText().equals("")) {
            validator = false;
        }
        lblBrojTelefonaVal.setVisible(txtBrojTelefona.getText().equals(""));
        
        if (txtUsername.getText().equals("")) {
            validator = false;
        }
        lblUsernameVal.setVisible(txtUsername.getText().equals(""));
        
        if (String.valueOf(txtPassword.getPassword()).equals("")) {
            validator = false;
        }
        lblPasswordVal.setVisible(String.valueOf(txtPassword.getPassword()).equals(""));
        
        if (String.valueOf(txtPasswordPonovljena.getPassword()).equals("")) {
            validator = false;
        }
        lblPasswordPonovljenaVal.setVisible(String.valueOf(txtPasswordPonovljena.getPassword()).equals(""));
        
        if(!String.valueOf(txtPasswordPonovljena.getPassword()).equals(String.valueOf(txtPassword.getPassword()))){
            validator = false;
            JOptionPane.showMessageDialog(rootPane, "Ponovljena lozinka mora da bude ista kao i lozinka!");
        }        
        
        return validator;
    }
}