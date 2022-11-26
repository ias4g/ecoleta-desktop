package edu.ecoleta.v2.views;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.controllers.PointController;
import edu.ecoleta.v2.models.PointModel;
import edu.ecoleta.v2.services.Utils;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

public class FrmDetails extends javax.swing.JDialog {

    private File imageFile = null;
    private byte[] imageBytes = null;

    public FrmDetails(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();

        jpInputsUpdates.setVisible(false);

        Utils.insertIconDialog(this);
        jpTitleFrmDetailsPoint.initDialog(this);

    }

    public FrmDetails(javax.swing.JDialog parent, boolean modal, PointModel pm) {

        super(parent, modal);
        initComponents();

        this.imageBytes = pm.getImage();

        jpInputsCreate.setVisible(false);
        lblTitle.setText("Alterando detalhes de " + pm.getName().toUpperCase());

        btnSaveUpdateChange.setText("Salvar Alteração");

        fillTextFields(pm);
        Utils.insertIconDialog(this);
        jpTitleFrmDetailsPoint.initDialog(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jpTitleFrmDetailsPoint = new edu.ecoleta.v2.components.SimpleTitleBar();
        jpInputsCreate = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        txtName = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtEmail = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtWhatsApp = new edu.ecoleta.v2.components.JFormattedFieldWithPlaceholder();
        jPanelRoundedBorder2 = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        jLabel5 = new javax.swing.JLabel();
        lblCamera = new javax.swing.JLabel();
        btnSaveCreate = new edu.ecoleta.v2.components.JButtonDefault();
        jpInputsUpdates = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        txtUpdateId = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtUpdateName = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtUpdateEmail = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtUpdateWhatsApp = new edu.ecoleta.v2.components.JFormattedFieldWithPlaceholder();
        txtUpdateCreatedAt = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        txtUpdateUpdatedAt = new edu.ecoleta.v2.components.JTextFieldWithPlaceholder();
        jPanelRoundedBorder1 = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        jLabel4 = new javax.swing.JLabel();
        lblUpdateCamera = new javax.swing.JLabel();
        btnSaveUpdateChange = new edu.ecoleta.v2.components.JButtonDefault();
        jpHead = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Coletando detalhes do ponto");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 1024, 80);
        getContentPane().add(jpTitleFrmDetailsPoint);
        jpTitleFrmDetailsPoint.setBounds(0, 0, 1024, 80);

        jpInputsCreate.setLayout(null);

        txtName.setBackground(new java.awt.Color(217, 217, 217));
        txtName.setForeground(new java.awt.Color(50, 33, 83));
        txtName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtName.setLabelText("Nome do ponto*");
        txtName.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtName);
        txtName.setBounds(24, 24, 928, 56);

        txtEmail.setBackground(new java.awt.Color(217, 217, 217));
        txtEmail.setForeground(new java.awt.Color(50, 33, 83));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtEmail.setLabelText("E-mail*");
        txtEmail.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsCreate.add(txtEmail);
        txtEmail.setBounds(24, 104, 928, 56);

        txtWhatsApp.setBackground(new java.awt.Color(217, 217, 217));
        txtWhatsApp.setForeground(new java.awt.Color(50, 33, 83));
        txtWhatsApp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        try {
            txtWhatsApp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtWhatsApp.setLabelText("WhatsApp*");
        txtWhatsApp.setLineColor(new java.awt.Color(52, 203, 121));
        txtWhatsApp.setOpaque(true);
        jpInputsCreate.add(txtWhatsApp);
        txtWhatsApp.setBounds(24, 184, 656, 56);

        jPanelRoundedBorder2.setBackground(new java.awt.Color(204, 204, 204));
        jPanelRoundedBorder2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(142, 142, 142));
        jLabel5.setText("Selecone uma imagem");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelRoundedBorder2.add(jLabel5);
        jLabel5.setBounds(16, 0, 182, 56);

        lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/camera-ico@48.png"))); // NOI18N
        lblCamera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCameraMouseClicked(evt);
            }
        });
        jPanelRoundedBorder2.add(lblCamera);
        lblCamera.setBounds(204, 4, 48, 48);

        jpInputsCreate.add(jPanelRoundedBorder2);
        jPanelRoundedBorder2.setBounds(696, 184, 256, 56);

        btnSaveCreate.setBackground(new java.awt.Color(52, 203, 121));
        btnSaveCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCreate.setText("Avançar");
        btnSaveCreate.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSaveCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCreateActionPerformed(evt);
            }
        });
        jpInputsCreate.add(btnSaveCreate);
        btnSaveCreate.setBounds(24, 264, 928, 56);

        getContentPane().add(jpInputsCreate);
        jpInputsCreate.setBounds(24, 222, 976, 344);

        jpInputsUpdates.setLayout(null);

        txtUpdateId.setEditable(false);
        txtUpdateId.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateId.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUpdateId.setLabelText("Id");
        txtUpdateId.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtUpdateId);
        txtUpdateId.setBounds(24, 24, 370, 56);

        txtUpdateName.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateName.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUpdateName.setLabelText("Nome do ponto*");
        txtUpdateName.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtUpdateName);
        txtUpdateName.setBounds(410, 24, 542, 56);

        txtUpdateEmail.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateEmail.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUpdateEmail.setLabelText("E-mail*");
        txtUpdateEmail.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtUpdateEmail);
        txtUpdateEmail.setBounds(24, 104, 370, 56);

        txtUpdateWhatsApp.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateWhatsApp.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateWhatsApp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        try {
            txtUpdateWhatsApp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUpdateWhatsApp.setLabelText("WhatsApp*");
        txtUpdateWhatsApp.setLineColor(new java.awt.Color(52, 203, 121));
        txtUpdateWhatsApp.setOpaque(true);
        jpInputsUpdates.add(txtUpdateWhatsApp);
        txtUpdateWhatsApp.setBounds(410, 104, 542, 56);

        txtUpdateCreatedAt.setEditable(false);
        txtUpdateCreatedAt.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateCreatedAt.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateCreatedAt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUpdateCreatedAt.setLabelText("Criado em");
        txtUpdateCreatedAt.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtUpdateCreatedAt);
        txtUpdateCreatedAt.setBounds(24, 184, 320, 56);

        txtUpdateUpdatedAt.setEditable(false);
        txtUpdateUpdatedAt.setBackground(new java.awt.Color(217, 217, 217));
        txtUpdateUpdatedAt.setForeground(new java.awt.Color(50, 33, 83));
        txtUpdateUpdatedAt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUpdateUpdatedAt.setLabelText("Alterado em");
        txtUpdateUpdatedAt.setLineColor(new java.awt.Color(52, 203, 121));
        jpInputsUpdates.add(txtUpdateUpdatedAt);
        txtUpdateUpdatedAt.setBounds(360, 184, 320, 56);

        jPanelRoundedBorder1.setBackground(new java.awt.Color(204, 204, 204));
        jPanelRoundedBorder1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(142, 142, 142));
        jLabel4.setText("Selecone uma imagem");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelRoundedBorder1.add(jLabel4);
        jLabel4.setBounds(16, 0, 182, 56);

        lblUpdateCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/camera-ico@48.png"))); // NOI18N
        lblUpdateCamera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUpdateCamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateCameraMouseClicked(evt);
            }
        });
        jPanelRoundedBorder1.add(lblUpdateCamera);
        lblUpdateCamera.setBounds(204, 4, 48, 48);

        jpInputsUpdates.add(jPanelRoundedBorder1);
        jPanelRoundedBorder1.setBounds(696, 184, 256, 56);

        btnSaveUpdateChange.setBackground(new java.awt.Color(52, 203, 121));
        btnSaveUpdateChange.setForeground(new java.awt.Color(50, 33, 83));
        btnSaveUpdateChange.setText("Salvar alteração");
        btnSaveUpdateChange.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSaveUpdateChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUpdateChangeActionPerformed(evt);
            }
        });
        jpInputsUpdates.add(btnSaveUpdateChange);
        btnSaveUpdateChange.setBounds(24, 264, 928, 56);

        getContentPane().add(jpInputsUpdates);
        jpInputsUpdates.setBounds(24, 222, 976, 344);

        jpHead.setLayout(new java.awt.CardLayout());

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/bg-frm-details-head.png"))); // NOI18N
        jpHead.add(lblImage, "card2");

        getContentPane().add(jpHead);
        jpHead.setBounds(0, 80, 1024, 256);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpdateCameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateCameraMouseClicked

        imageFile = Utils.selectImage(this);

        Utils.openImageWithFile(imageFile, lblImage);

        repaint();

    }//GEN-LAST:event_lblUpdateCameraMouseClicked

    private void btnSaveUpdateChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUpdateChangeActionPerformed

        if (txtUpdateName.getText().isEmpty() || txtUpdateEmail.getText().isEmpty() || txtUpdateWhatsApp.getText().isEmpty()) {

            new Alert(this, true, "Ops... preencha os campos obrigatórios (*).", AlertType.INFO).showAlert();

        } else {

            try {

                PointModel pm = new PointModel();

                pm.setId(txtUpdateId.getText());
                pm.setName(txtUpdateName.getText());
                pm.setEmail(txtUpdateEmail.getText());

                if (imageFile == null) {
                    pm.setImage(imageBytes);
                } else {
                    pm.setImage(Utils.getImageFile(imageFile));
                }

                pm.setWhatsApp(txtUpdateWhatsApp.getText());

                new PointController().updatePoint(pm);

                new Alert(this, true, "Alterado com sucesso", AlertType.SUCCESS).showAlert();
                dispose();

            } catch (ClassNotFoundException | SQLException | IOException ex) {
                new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
            }

        }

    }//GEN-LAST:event_btnSaveUpdateChangeActionPerformed

    private void lblCameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCameraMouseClicked

        imageFile = Utils.selectImage(this);
        Utils.openImageWithFile(imageFile, lblImage);

        repaint();

    }//GEN-LAST:event_lblCameraMouseClicked

    private void btnSaveCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCreateActionPerformed

        if (txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtWhatsApp.getText().isEmpty()) {

            new Alert(this, true, "Ops... preencha os campos obrigatórios (*).", AlertType.INFO).showAlert();

        } else {

            try {

                final UUID uuid = UUID.randomUUID();

                PointModel pm = new PointModel();

                pm.setId(String.valueOf(uuid));
                pm.setName(txtName.getText());
                pm.setEmail(txtEmail.getText());
                pm.setImage(Utils.getImageFile(imageFile));
                pm.setWhatsApp(txtWhatsApp.getText());

                new FrmAddress(new javax.swing.JFrame(), true, pm).setVisible(true);
                dispose();

            } catch (IOException ex) {
                new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
            }

        }

    }//GEN-LAST:event_btnSaveCreateActionPerformed

    private void fillTextFields(PointModel pm) {

        Utils.openImageWithBytes(pm.getImage(), jpHead, lblImage);
        txtUpdateId.setText(pm.getId());
        txtUpdateName.setText(pm.getName());
        txtUpdateEmail.setText(pm.getEmail());
        txtUpdateWhatsApp.setText(pm.getWhatsApp());
        txtUpdateCreatedAt.setText(pm.getCreatedAt());

        if (pm.getUpdateAt() == null) {
            txtUpdateUpdatedAt.setText("");
            txtUpdateUpdatedAt.setVisible(false);
        } else {
            txtUpdateUpdatedAt.setText(pm.getUpdateAt());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.JButtonDefault btnSaveCreate;
    private edu.ecoleta.v2.components.JButtonDefault btnSaveUpdateChange;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jPanelRoundedBorder1;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jPanelRoundedBorder2;
    private javax.swing.JPanel jpHead;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputsCreate;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputsUpdates;
    private edu.ecoleta.v2.components.SimpleTitleBar jpTitleFrmDetailsPoint;
    private javax.swing.JLabel lblCamera;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdateCamera;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtEmail;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtName;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtUpdateCreatedAt;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtUpdateEmail;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtUpdateId;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtUpdateName;
    private edu.ecoleta.v2.components.JTextFieldWithPlaceholder txtUpdateUpdatedAt;
    private edu.ecoleta.v2.components.JFormattedFieldWithPlaceholder txtUpdateWhatsApp;
    private edu.ecoleta.v2.components.JFormattedFieldWithPlaceholder txtWhatsApp;
    // End of variables declaration//GEN-END:variables
}
