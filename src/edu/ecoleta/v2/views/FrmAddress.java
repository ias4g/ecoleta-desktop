package edu.ecoleta.v2.views;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.controllers.AddressCtrl;
import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.PointModel;
import edu.ecoleta.v2.models.ResultSearchCep;
import edu.ecoleta.v2.services.SetFields;
import edu.ecoleta.v2.services.Utils;
import java.net.MalformedURLException;
import java.sql.SQLException;
import org.dom4j.DocumentException;

public class FrmAddress extends javax.swing.JDialog {

    PointModel pm;

    public FrmAddress(java.awt.Frame parent, boolean modal, PointModel pm) {

        super(parent, modal);
        initComponents();

        jpInputsUpdates.setVisible(false);

        this.pm = pm;

        jpAddressHead.initDialog(this);
        Utils.fieldRestricted(txtZipcode, txtNumber);

        Utils.deserializeUf(cmbUfs);

    }

    public FrmAddress(javax.swing.JDialog parent, boolean modal, AddressModel am) {

        super(parent, modal);
        initComponents();

        jpInputsCreate.setVisible(false);

        jpAddressHead.initDialog(this);

        Utils.fieldRestricted(txtZipcodeUpdate, txtNumberUpdate);

        Utils.deserializeUf(cmbUfUpdate);

        SetFields.setFields(am, txtIdUpdate, txtZipcodeUpdate, txtAddressUpdate, txtNumberUpdate, txtComplementUpdate, txtDistrictUpdate, cmbUfUpdate, cmbCityUpdate, txtIdPointUpdate);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jpAddressHead = new edu.ecoleta.v2.components.SimpleTitleBar();
        jpInputsCreate = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        lblSearch = new javax.swing.JLabel();
        txtZipcode = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtAddress = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtNumber = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtComplement = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtDistrict = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        btnSave = new edu.ecoleta.v2.components.JButtonDefault();
        cmbUfs = new edu.ecoleta.v2.components.Combobox();
        cmbCities = new edu.ecoleta.v2.components.Combobox();
        jpInputsUpdates = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        lblSearchUpdate = new javax.swing.JLabel();
        txtIdUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtZipcodeUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtAddressUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtNumberUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtComplementUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtDistrictUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        cmbUfUpdate = new edu.ecoleta.v2.components.Combobox();
        cmbCityUpdate = new edu.ecoleta.v2.components.Combobox();
        txtIdPointUpdate = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        btnUpdate = new edu.ecoleta.v2.components.JButtonDefault();
        jpHead = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 590));
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Coletando endereço do ponto");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 1024, 80);
        getContentPane().add(jpAddressHead);
        jpAddressHead.setBounds(0, 0, 1024, 80);

        jpInputsCreate.setLayout(null);

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/search-icon@20.png"))); // NOI18N
        lblSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });
        jpInputsCreate.add(lblSearch);
        lblSearch.setBounds(252, 40, 20, 20);

        txtZipcode.setBackground(new java.awt.Color(217, 217, 217));
        txtZipcode.setForeground(new java.awt.Color(50, 33, 83));
        txtZipcode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtZipcode.setLabelText("Cep*");
        txtZipcode.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtZipcode);
        txtZipcode.setBounds(24, 24, 256, 56);

        txtAddress.setBackground(new java.awt.Color(217, 217, 217));
        txtAddress.setForeground(new java.awt.Color(50, 33, 83));
        txtAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtAddress.setLabelText("Endereço*");
        txtAddress.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtAddress);
        txtAddress.setBounds(296, 24, 656, 56);

        txtNumber.setBackground(new java.awt.Color(217, 217, 217));
        txtNumber.setForeground(new java.awt.Color(50, 33, 83));
        txtNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNumber.setLabelText("Número*");
        txtNumber.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtNumber);
        txtNumber.setBounds(24, 104, 256, 56);

        txtComplement.setBackground(new java.awt.Color(217, 217, 217));
        txtComplement.setForeground(new java.awt.Color(50, 33, 83));
        txtComplement.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtComplement.setLabelText("Complemento");
        txtComplement.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtComplement);
        txtComplement.setBounds(296, 104, 320, 56);

        txtDistrict.setBackground(new java.awt.Color(217, 217, 217));
        txtDistrict.setForeground(new java.awt.Color(50, 33, 83));
        txtDistrict.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtDistrict.setLabelText("Bairro*");
        txtDistrict.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtDistrict);
        txtDistrict.setBounds(632, 104, 320, 56);

        btnSave.setBackground(new java.awt.Color(52, 203, 121));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Avançar");
        btnSave.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jpInputsCreate.add(btnSave);
        btnSave.setBounds(24, 264, 928, 56);

        cmbUfs.setBackground(new java.awt.Color(217, 217, 217));
        cmbUfs.setForeground(new java.awt.Color(50, 33, 83));
        cmbUfs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cmbUfs.setSelectedIndex(-1);
        cmbUfs.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbUfs.setLabeText("UF(estado)");
        cmbUfs.setLineColor(new java.awt.Color(52, 203, 121));
        cmbUfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUfsActionPerformed(evt);
            }
        });
        jpInputsCreate.add(cmbUfs);
        cmbUfs.setBounds(24, 184, 456, 56);

        cmbCities.setBackground(new java.awt.Color(217, 217, 217));
        cmbCities.setForeground(new java.awt.Color(50, 33, 83));
        cmbCities.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cmbCities.setSelectedIndex(-1);
        cmbCities.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbCities.setLabeText("Cidade");
        cmbCities.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(cmbCities);
        cmbCities.setBounds(496, 184, 456, 56);

        getContentPane().add(jpInputsCreate);
        jpInputsCreate.setBounds(24, 222, 976, 344);

        jpInputsUpdates.setLayout(null);

        lblSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/search-icon@20.png"))); // NOI18N
        lblSearchUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchUpdateMouseClicked(evt);
            }
        });
        jpInputsUpdates.add(lblSearchUpdate);
        lblSearchUpdate.setBounds(330, 40, 20, 20);

        txtIdUpdate.setEditable(false);
        txtIdUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtIdUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtIdUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIdUpdate.setLabelText("Id");
        txtIdUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtIdUpdate);
        txtIdUpdate.setBounds(24, 24, 56, 56);

        txtZipcodeUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtZipcodeUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtZipcodeUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtZipcodeUpdate.setLabelText("Cep*");
        txtZipcodeUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtZipcodeUpdate);
        txtZipcodeUpdate.setBounds(96, 24, 256, 56);

        txtAddressUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtAddressUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtAddressUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtAddressUpdate.setLabelText("Endereço*");
        txtAddressUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtAddressUpdate);
        txtAddressUpdate.setBounds(368, 24, 584, 56);

        txtNumberUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtNumberUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtNumberUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNumberUpdate.setLabelText("Número*");
        txtNumberUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtNumberUpdate);
        txtNumberUpdate.setBounds(24, 104, 256, 56);

        txtComplementUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtComplementUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtComplementUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtComplementUpdate.setLabelText("Complemento");
        txtComplementUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtComplementUpdate);
        txtComplementUpdate.setBounds(296, 104, 320, 56);

        txtDistrictUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtDistrictUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtDistrictUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtDistrictUpdate.setLabelText("Bairro*");
        txtDistrictUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtDistrictUpdate);
        txtDistrictUpdate.setBounds(632, 104, 320, 56);

        cmbUfUpdate.setBackground(new java.awt.Color(217, 217, 217));
        cmbUfUpdate.setForeground(new java.awt.Color(50, 33, 83));
        cmbUfUpdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cmbUfUpdate.setSelectedIndex(-1);
        cmbUfUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbUfUpdate.setLabeText("UF(estado)");
        cmbUfUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        cmbUfUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUfUpdateActionPerformed(evt);
            }
        });
        jpInputsUpdates.add(cmbUfUpdate);
        cmbUfUpdate.setBounds(24, 184, 180, 56);

        cmbCityUpdate.setBackground(new java.awt.Color(217, 217, 217));
        cmbCityUpdate.setForeground(new java.awt.Color(50, 33, 83));
        cmbCityUpdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cmbCityUpdate.setSelectedIndex(-1);
        cmbCityUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbCityUpdate.setLabeText("Cidade");
        cmbCityUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(cmbCityUpdate);
        cmbCityUpdate.setBounds(220, 184, 256, 56);

        txtIdPointUpdate.setEditable(false);
        txtIdPointUpdate.setBackground(new java.awt.Color(217, 217, 217));
        txtIdPointUpdate.setForeground(new java.awt.Color(50, 33, 83));
        txtIdPointUpdate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIdPointUpdate.setLabelText("Id do ponto de coleta");
        txtIdPointUpdate.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtIdPointUpdate);
        txtIdPointUpdate.setBounds(492, 199, 460, 56);

        btnUpdate.setBackground(new java.awt.Color(52, 203, 121));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Salvar alteração");
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jpInputsUpdates.add(btnUpdate);
        btnUpdate.setBounds(24, 264, 928, 56);

        getContentPane().add(jpInputsUpdates);
        jpInputsUpdates.setBounds(24, 222, 976, 344);

        jpHead.setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/frm-address-head.png"))); // NOI18N
        jpHead.add(jLabel2, "card2");

        getContentPane().add(jpHead);
        jpHead.setBounds(0, 80, 1024, 256);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (txtZipcode.getText().isEmpty()
                || txtAddress.getText().isEmpty()
                || txtNumber.getText().isEmpty()
                || txtDistrict.getText().isEmpty()
                || cmbUfs.getSelectedItem().equals("Selecione um estado")
                || cmbCities.getSelectedItem().equals("Selecione uma cidade")) {
            new Alert(this, true, "Dados inválidos e/ou campos vazios!", AlertType.INFO).showAlert();
        } else {

            AddressModel am = new AddressModel();

            am.setZipcode(txtZipcode.getText());
            am.setPublicPlace(txtAddress.getText());
            am.setNumber(Integer.parseInt(txtNumber.getText()));
            am.setComplement(txtComplement.getText());
            am.setDistrict(txtDistrict.getText());
            am.setUf(String.valueOf(cmbUfs.getSelectedItem()));
            am.setCity(String.valueOf(cmbCities.getSelectedItem()));

            new FrmItems(new javax.swing.JFrame(), true, pm, am).setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked

        if (txtZipcode.getText().isEmpty()) {
            new Alert(this, true, "Preencha o campo CEP!", AlertType.INFO).showAlert();
        } else {

            if (txtZipcode.getText().length() < 8) {
                new Alert(this, true, "O CEP tem que ter 8 digitos", AlertType.INFO).showAlert();
            } else {

                try {

                    ResultSearchCep res = Utils.cepSearch(txtZipcode.getText());

                    if (res.isError()) {
                        new Alert(this, true, "CEP não encontrado e/ou inválido, tente novamente com um CEP diferente!", AlertType.INFO).showAlert();
                    } else {
                        SetFields.setFields(txtAddress, txtComplement, txtDistrict, cmbUfs, cmbCities, res);
                    }

                } catch (MalformedURLException | DocumentException ex) {
                    new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                }

            }
        }

    }//GEN-LAST:event_lblSearchMouseClicked

    private void lblSearchUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchUpdateMouseClicked

        if (txtZipcodeUpdate.getText().isEmpty()) {
            new Alert(this, true, "Preencha o campo CEP!", AlertType.INFO).showAlert();
        } else {

            if (txtZipcodeUpdate.getText().length() < 8) {
                new Alert(this, true, "O CEP tem que ter 8 digitos", AlertType.INFO).showAlert();
            } else {

                try {

                    ResultSearchCep res = Utils.cepSearch(txtZipcodeUpdate.getText());

                    if (res.isError()) {
                        new Alert(this, true, "CEP não encontrado e/ou inválido, tente novamente com um CEP diferente!", AlertType.INFO).showAlert();
                    } else {
                        SetFields.setFields(txtAddressUpdate, txtComplementUpdate, txtDistrictUpdate, cmbUfUpdate, cmbCityUpdate, res);
                    }

                } catch (MalformedURLException | DocumentException ex) {
                    new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                }

            }
        }

    }//GEN-LAST:event_lblSearchUpdateMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (txtIdUpdate.getText().isEmpty()
                || txtZipcodeUpdate.getText().isEmpty()
                || txtAddressUpdate.getText().isEmpty()
                || txtNumberUpdate.getText().isEmpty()
                || txtDistrictUpdate.getText().isEmpty()
                || cmbUfUpdate.getSelectedItem().equals("Selecione um estado")
                || cmbCityUpdate.getSelectedItem().equals("Selecione uma cidade")
                || txtIdPointUpdate.getText().isEmpty()) {
            new Alert(this, true, "Dados inválidos e/ou campos vazios!", AlertType.INFO).showAlert();
        } else {

            try {
                AddressModel am = new AddressModel();

                am.setId(Integer.parseInt(txtIdUpdate.getText()));
                am.setZipcode(txtZipcodeUpdate.getText());
                am.setPublicPlace(txtAddressUpdate.getText());
                am.setNumber(Integer.parseInt(txtNumberUpdate.getText()));
                am.setComplement(txtComplementUpdate.getText());
                am.setDistrict(txtDistrictUpdate.getText());
                am.setUf(String.valueOf(cmbUfUpdate.getSelectedItem()));
                am.setCity(String.valueOf(cmbCityUpdate.getSelectedItem()));
                am.setPointId(txtIdPointUpdate.getText());

                new AddressCtrl().updateAddress(am);

                new Alert(this, true, "Alterado com sucesso", AlertType.SUCCESS).showAlert();
                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbUfUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUfUpdateActionPerformed
        SetFields.addMunicipos(cmbCityUpdate, cmbUfUpdate);
    }//GEN-LAST:event_cmbUfUpdateActionPerformed

    private void cmbUfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUfsActionPerformed
        SetFields.addMunicipos(cmbCities, cmbUfs);
    }//GEN-LAST:event_cmbUfsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.JButtonDefault btnSave;
    private edu.ecoleta.v2.components.JButtonDefault btnUpdate;
    private edu.ecoleta.v2.components.Combobox cmbCities;
    private edu.ecoleta.v2.components.Combobox cmbCityUpdate;
    private edu.ecoleta.v2.components.Combobox cmbUfUpdate;
    private edu.ecoleta.v2.components.Combobox cmbUfs;
    private javax.swing.JLabel jLabel2;
    private edu.ecoleta.v2.components.SimpleTitleBar jpAddressHead;
    private javax.swing.JPanel jpHead;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputsCreate;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputsUpdates;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSearchUpdate;
    private javax.swing.JLabel lblTitle;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtAddress;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtAddressUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtComplement;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtComplementUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtDistrict;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtDistrictUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtIdPointUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtIdUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtNumber;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtNumberUpdate;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtZipcode;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtZipcodeUpdate;
    // End of variables declaration//GEN-END:variables
}
