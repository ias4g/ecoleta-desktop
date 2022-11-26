package edu.ecoleta.v2.views;

import edu.ecoleta.v2.components.About;
import edu.ecoleta.v2.services.Utils;

public class Home extends javax.swing.JFrame {

    public Home() {

        initComponents();
        Utils.insertIconFrame(this);
        simpleTitleBar1.init(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtaH1 = new javax.swing.JTextArea();
        jtaH2 = new javax.swing.JTextArea();
        lblImage = new javax.swing.JLabel();
        btnEnter = new edu.ecoleta.v2.components.JButtonDefault();
        btnEdit = new edu.ecoleta.v2.components.JButtonDefault();
        simpleTitleBar1 = new edu.ecoleta.v2.titlebar.SimpleTitleBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);

        jtaH1.setEditable(false);
        jtaH1.setBackground(new java.awt.Color(217, 217, 217));
        jtaH1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jtaH1.setLineWrap(true);
        jtaH1.setTabSize(0);
        jtaH1.setText("Seu marketplace\nde coleta de\nresíduos.");
        jtaH1.setWrapStyleWord(true);
        jtaH1.setBorder(null);

        jtaH2.setEditable(false);
        jtaH2.setBackground(new java.awt.Color(217, 217, 217));
        jtaH2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtaH2.setLineWrap(true);
        jtaH2.setTabSize(0);
        jtaH2.setText("Ajudamos pessoas a encontrarem pontos\nde coleta de forma efeciente.");
        jtaH2.setWrapStyleWord(true);
        jtaH2.setBorder(null);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/bg-image.png"))); // NOI18N

        btnEnter.setBackground(new java.awt.Color(52, 203, 121));
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/enter@16.png"))); // NOI18N
        btnEnter.setText("Cadastrar um ponto de coleta");
        btnEnter.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEnter.setIconTextGap(8);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(102, 51, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/edit@16.png"))); // NOI18N
        btnEdit.setText("Editar ponto existente");
        btnEdit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEdit.setIconTextGap(8);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/info@21.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simpleTitleBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtaH2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtaH1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(lblImage)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addComponent(jtaH1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jtaH2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        new FrmMyPoints(this, true).setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        new FrmDetails(this, true).setVisible(true);

    }//GEN-LAST:event_btnEnterActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new About(this).showMessage();
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.JButtonDefault btnEdit;
    private edu.ecoleta.v2.components.JButtonDefault btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jtaH1;
    private javax.swing.JTextArea jtaH2;
    private javax.swing.JLabel lblImage;
    private edu.ecoleta.v2.titlebar.SimpleTitleBar simpleTitleBar1;
    // End of variables declaration//GEN-END:variables
}
