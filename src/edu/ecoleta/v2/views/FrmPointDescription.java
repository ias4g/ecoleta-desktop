package edu.ecoleta.v2.views;

import br.com.ecoleta.scrollCustom.ScrollBarCustomUI;
import edu.ecoleta.v2.components.JLabelRoundedBorder;
import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.ItemModel;
import edu.ecoleta.v2.models.PointModel;
import edu.ecoleta.v2.services.Utils;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;

public class FrmPointDescription extends javax.swing.JDialog {

    public FrmPointDescription(javax.swing.JDialog parent, boolean modal, PointModel point, AddressModel address, List<ItemModel> items) {
        super(parent, modal);
        initComponents();

        setItems(items);
        setPoints(point);
        setAddress(address);
        jpTitleBar.initDialog(this);
        jspItems.getHorizontalScrollBar().setUI(new ScrollBarCustomUI());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jpTitleBar = new edu.ecoleta.v2.components.SimpleTitleBar();
        jPanelRoundedBorderTransparent1 = new edu.ecoleta.v2.components.JPanelRoundedBorderTransparent();
        lblMarketName = new javax.swing.JLabel();
        lblMarketAddress = new javax.swing.JLabel();
        lblMarketWhats = new javax.swing.JLabel();
        lblMarketEmail = new javax.swing.JLabel();
        jpHead = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jspItems = new javax.swing.JScrollPane();
        jpItens = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Detalhes completo do ponto");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 1024, 80);
        getContentPane().add(jpTitleBar);
        jpTitleBar.setBounds(0, 0, 1024, 80);

        jPanelRoundedBorderTransparent1.setLayout(null);

        lblMarketName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMarketName.setForeground(new java.awt.Color(255, 255, 255));
        lblMarketName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarketName.setText("SUPERMERCADO BARBOSA");
        jPanelRoundedBorderTransparent1.add(lblMarketName);
        lblMarketName.setBounds(24, 24, 928, 28);

        lblMarketAddress.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblMarketAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblMarketAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarketAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/endereço.png"))); // NOI18N
        lblMarketAddress.setText("Rua Coronel Carlos Ambrogi, 336, Cs 04 - Jd. São José, Pirituba - São Paulo/SP, 02969130");
        jPanelRoundedBorderTransparent1.add(lblMarketAddress);
        lblMarketAddress.setBounds(24, 76, 928, 24);

        lblMarketWhats.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblMarketWhats.setForeground(new java.awt.Color(255, 255, 255));
        lblMarketWhats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/whatsapp.png"))); // NOI18N
        lblMarketWhats.setText("+55 11 9 6502-7954");
        jPanelRoundedBorderTransparent1.add(lblMarketWhats);
        lblMarketWhats.setBounds(24, 116, 428, 24);

        lblMarketEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblMarketEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblMarketEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMarketEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/email.png"))); // NOI18N
        lblMarketEmail.setText("barbosa@barbosa.com.br");
        jPanelRoundedBorderTransparent1.add(lblMarketEmail);
        lblMarketEmail.setBounds(524, 116, 428, 24);

        getContentPane().add(jPanelRoundedBorderTransparent1);
        jPanelRoundedBorderTransparent1.setBounds(24, 222, 976, 160);

        jpHead.setLayout(new java.awt.CardLayout());

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/market.png"))); // NOI18N
        jpHead.add(lblImage, "card2");

        getContentPane().add(jpHead);
        jpHead.setBounds(0, 80, 1024, 256);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Itens que o ponto coleta");
        jLabel5.setIconTextGap(8);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(24, 400, 976, 19);

        jspItems.setBorder(null);
        jspItems.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jpItens.setBackground(new java.awt.Color(217, 217, 217));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout1.setAlignOnBaseline(true);
        jpItens.setLayout(flowLayout1);
        jspItems.setViewportView(jpItens);

        getContentPane().add(jspItems);
        jspItems.setBounds(24, 425, 976, 150);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setItems(List<ItemModel> items) {

        for (ItemModel item : items) {

            JLabel label = new JLabelRoundedBorder();

            label.setIconTextGap(8);
            label.setText(item.getTitle());
            label.setBackground(Color.white);
            label.setFont(new java.awt.Font("Arial", 0, 12));
            label.setMaximumSize(new java.awt.Dimension(150, 138));
            label.setMinimumSize(new java.awt.Dimension(150, 138));
            label.setPreferredSize(new java.awt.Dimension(150, 138));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/" + item.getSlug() + ".png")));

            jpItens.add(label);
        }

    }

    private void setPoints(PointModel point) {
        Utils.openImageWithBytes(point.getImage(), jpHead, lblImage);
        lblMarketName.setText(point.getName().toUpperCase());
        lblMarketWhats.setText(point.getWhatsApp());
        lblMarketEmail.setText(point.getEmail());
    }

    private void setAddress(AddressModel address) {
        lblMarketAddress.setText(address.getPublicPlace() + ", nº" + address.getNumber() + ", " + address.getComplement() + " | " + address.getDistrict() + " | " + address.getCity() + "/" + address.getUf() + ", " + address.getZipcode());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private edu.ecoleta.v2.components.JPanelRoundedBorderTransparent jPanelRoundedBorderTransparent1;
    private javax.swing.JPanel jpHead;
    private javax.swing.JPanel jpItens;
    private edu.ecoleta.v2.components.SimpleTitleBar jpTitleBar;
    private javax.swing.JScrollPane jspItems;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMarketAddress;
    private javax.swing.JLabel lblMarketEmail;
    private javax.swing.JLabel lblMarketName;
    private javax.swing.JLabel lblMarketWhats;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
