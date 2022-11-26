package edu.ecoleta.v2.views;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.scrollCustom.ScrollBarCustomUI;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.components.JLabelRoundedBorder;
import edu.ecoleta.v2.controllers.ItemsCtrl;
import edu.ecoleta.v2.controllers.RegisterController;
import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.ItemModel;
import edu.ecoleta.v2.models.PointModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class FrmItems extends javax.swing.JDialog {

    PointModel pm;
    AddressModel am;
    private String id = null;

    private final List<String> itensSelected = new ArrayList();

    public FrmItems(java.awt.Frame parent, boolean modal, PointModel pm, AddressModel am) {

        super(parent, modal);
        initComponents();

        this.pm = pm;
        this.am = am;

        setItems();
        jpItemsTitle.initDialog(this);
        jspItems.getHorizontalScrollBar().setUI(new ScrollBarCustomUI());

    }

    public FrmItems(javax.swing.JDialog parent, boolean modal, String id) {

        super(parent, modal);
        initComponents();

        this.id = id;
        setItems();
        jpItemsTitle.initDialog(this);
        btnNext.setText("Salvar Alteração");
        jspItems.getHorizontalScrollBar().setUI(new ScrollBarCustomUI());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jpItemsTitle = new edu.ecoleta.v2.components.SimpleTitleBar();
        jpInputs = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        jspItems = new javax.swing.JScrollPane();
        jpItens = new javax.swing.JPanel();
        btnNext = new edu.ecoleta.v2.components.JButtonDefault();
        jpHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Coletando os itens disponiveis no ponto");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 1024, 80);
        getContentPane().add(jpItemsTitle);
        jpItemsTitle.setBounds(0, 0, 1024, 80);

        jpInputs.setLayout(null);

        jspItems.setBackground(new java.awt.Color(217, 217, 217));
        jspItems.setBorder(null);
        jspItems.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jpItens.setBackground(new java.awt.Color(217, 217, 217));
        jpItens.setLayout(new java.awt.GridLayout(1, 0, 8, 8));
        jspItems.setViewportView(jpItens);

        jpInputs.add(jspItems);
        jspItems.setBounds(24, 24, 928, 190);

        btnNext.setBackground(new java.awt.Color(52, 203, 121));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Avançar");
        btnNext.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jpInputs.add(btnNext);
        btnNext.setBounds(24, 264, 928, 56);

        getContentPane().add(jpInputs);
        jpInputs.setBounds(24, 223, 976, 344);

        jpHead.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/bg-frm-items-head.png"))); // NOI18N
        jpHead.add(jLabel1, "card2");

        getContentPane().add(jpHead);
        jpHead.setBounds(0, 80, 1024, 256);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        register();

    }//GEN-LAST:event_btnNextActionPerformed

    private void setItems() {

        try {

            ItemsCtrl ic = new ItemsCtrl();
            List<ItemModel> ics = ic.ReadItems();
            List<Boolean> isSelectedItem = new ArrayList<>();

            for (ItemModel item : ics) {

                itensSelected.add(null);
                isSelectedItem.add(false);

                JLabel label = new JLabelRoundedBorder();

                label.setSize(150, 140);
                label.setIconTextGap(10);
                label.setName(String.valueOf(item.getId()));
                label.setText(item.getTitle());
                label.setToolTipText(item.getSlug());
                label.setBackground(new Color(255, 255, 255));
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/" + item.getSlug() + ".png")));

                label.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {

                        int i = Integer.parseInt(label.getName()) - 1;
                        boolean j = !isSelectedItem.get(i);
                        isSelectedItem.set(i, j);

                        boolean toggle = isSelectedItem.get(i);

                        if (toggle) {

                            label.setBackground(new Color(214, 245, 228));
                            itensSelected.set(i, label.getName());

                        } else {

                            itensSelected.set(i, null);
                            label.setBackground(new Color(255, 255, 255));

                        }
                    }

                });

                jpItens.add(label);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }

    private void register() {

        String res;
        int hasValue = 0;

        for (Object it : itensSelected) {
            if (it != null) {
                hasValue++;
            }
        }

        if (hasValue <= 0) {
            new Alert(this, true, "Marque pelo menos um item!", AlertType.INFO).showAlert();
            return;
        }

        if (id != null) {

            try {
                new ItemsCtrl().UpdatesItems(id, itensSelected);
                new Alert(this, true, "Editado com sucesso!", AlertType.SUCCESS).showAlert();
            } catch (SQLException | ClassNotFoundException ex) {
                new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
            }

            dispose();

        } else {

            RegisterController rc = new RegisterController();
            res = rc.createRegister(pm, am, itensSelected);

            if (res.equalsIgnoreCase("ok")) {
                new Alert(this, true, "Ponto cadastrado com sucesso", AlertType.SUCCESS).showAlert();
                dispose();
            } else {
                new Alert(this, true, res, AlertType.ERROR).showAlert();
                this.dispose();
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.JButtonDefault btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpHead;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputs;
    private edu.ecoleta.v2.components.SimpleTitleBar jpItemsTitle;
    private javax.swing.JPanel jpItens;
    private javax.swing.JScrollPane jspItems;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
