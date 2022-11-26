package edu.ecoleta.v2.views;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.alert.AlertConfirm;
import br.com.ecoleta.alert.AlertOptions;
import br.com.ecoleta.tableCustom.TableCustom;
import br.com.ecoleta.tableCustom.TableCustomCellRender;
import br.com.ecoleta.types.AlertConfirmType;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.controllers.AddressCtrl;
import edu.ecoleta.v2.controllers.ItemsCtrl;
import edu.ecoleta.v2.controllers.PointController;
import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.ItemModel;
import edu.ecoleta.v2.models.PointModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmMyPoints extends javax.swing.JDialog {

    public FrmMyPoints(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        jpItemsTitle.initDialog(this);

        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);

        testData(jtPoints);
    }

    private void testData(JTable table) {

        TableCustomCellRender JTableRenderer = new TableCustomCellRender();

        table.getColumnModel().getColumn(3).setCellRenderer(JTableRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(JTableRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(JTableRenderer);

        ImageIcon InfoIcon = new ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/info@21.png"));
        ImageIcon updateIcon = new ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/edit@21.png"));
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/delete@21.png"));

        DefaultTableModel tableModel = (DefaultTableModel) jtPoints.getModel();
        tableModel.setRowCount(0);

        List<PointModel> resultData;

        try {

            resultData = new PointController().listPoint();

            if (resultData == null) {
                System.out.println("objeto null");
                return;
            }

            for (PointModel point : resultData) {

                Object data[] = {
                    point.getId(),
                    point.getName(),
                    point.getCreatedAt(),
                    InfoIcon,
                    updateIcon,
                    deleteIcon
                };

                tableModel.addRow(data);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, "Algo de errado não está certo -> " + ex.getMessage()
            );
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jpItemsTitle = new edu.ecoleta.v2.components.SimpleTitleBar();
        jpInputs = new edu.ecoleta.v2.components.JPanelRoundedBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPoints = new javax.swing.JTable();
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
        lblTitle.setText("Listando os ponto que você cadastrou");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 1024, 80);
        getContentPane().add(jpItemsTitle);
        jpItemsTitle.setBounds(0, 0, 1024, 80);

        jpInputs.setLayout(null);

        jtPoints.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtPoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "Nome", "Cadastrado", "Info", "Editar", "Excluir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPoints.setFocusable(false);
        jtPoints.setOpaque(false);
        jtPoints.setRequestFocusEnabled(false);
        jtPoints.setRowSelectionAllowed(false);
        jtPoints.setSelectionBackground(new java.awt.Color(217, 217, 217));
        jtPoints.getTableHeader().setReorderingAllowed(false);
        jtPoints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPointsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPoints);
        if (jtPoints.getColumnModel().getColumnCount() > 0) {
            jtPoints.getColumnModel().getColumn(0).setResizable(false);
            jtPoints.getColumnModel().getColumn(0).setPreferredWidth(200);
            jtPoints.getColumnModel().getColumn(1).setResizable(false);
            jtPoints.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtPoints.getColumnModel().getColumn(2).setResizable(false);
            jtPoints.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtPoints.getColumnModel().getColumn(3).setResizable(false);
            jtPoints.getColumnModel().getColumn(3).setPreferredWidth(0);
            jtPoints.getColumnModel().getColumn(4).setResizable(false);
            jtPoints.getColumnModel().getColumn(4).setPreferredWidth(0);
            jtPoints.getColumnModel().getColumn(5).setResizable(false);
            jtPoints.getColumnModel().getColumn(5).setPreferredWidth(0);
        }

        jpInputs.add(jScrollPane1);
        jScrollPane1.setBounds(24, 24, 928, 290);

        getContentPane().add(jpInputs);
        jpInputs.setBounds(24, 223, 976, 344);

        jpHead.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/frm-points-head.png"))); // NOI18N
        jpHead.add(jLabel1, "card2");

        getContentPane().add(jpHead);
        jpHead.setBounds(0, 80, 1024, 256);

        setSize(new java.awt.Dimension(1024, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtPointsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPointsMouseClicked

        int selectedLine = jtPoints.getSelectedRow();
        int clickedColumn = jtPoints.getSelectedColumn();

//        String user = System.getProperty("user.name");
        String id = jtPoints.getValueAt(selectedLine, 0).toString();

        switch (clickedColumn) {

            case 3 -> {

                try {

                    PointModel point = new PointController().listPointById(id);
                    AddressModel address = new AddressCtrl().listAddressById(id);
                    List<ItemModel> items = new ItemsCtrl().findForItemsByPointId(id);

                    new FrmPointDescription(this, true, point, address, items).setVisible(true);

                } catch (ClassNotFoundException | SQLException ex) {
                    new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                }

            }

            case 4 -> {

                AlertOptions al = new AlertOptions(this, true);
                al.showAlert();
                if (al.getOpenFrame() == null) {
                    return;
                }

                switch (al.getOpenFrame()) {

                    case OPEN_DIALOG_DETAILS -> {

                        try {
                            PointModel pm = new PointController().listPointById(id);
                            new FrmDetails(this, true, pm).setVisible(true);
                        } catch (ClassNotFoundException | SQLException ex) {
                            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                        }

                        dispose();
                    }

                    case OPEN_DIALOG_ADDRESS -> {

                        try {
                            AddressModel am = new AddressCtrl().listAddressById(id);
                            new FrmAddress(this, true, am).setVisible(true);
                        } catch (ClassNotFoundException | SQLException ex) {
                            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                        }

                        dispose();
                    }

                    case OPEN_DIALOG_ITEMS -> {

                        try {
                            new ItemsCtrl().deleteItemsByPoint(id);
                            new FrmItems(this, true, id).setVisible(true);
                        } catch (ClassNotFoundException | SQLException ex) {
                            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                        }
                    }

                }

            }

            case 5 -> {
                AlertConfirm ac = new AlertConfirm(this, true, "Você está prestes a deletar\no ponto de coleta\n" + jtPoints.getValueAt(selectedLine, 1).toString().toUpperCase() + "\n\nTem certeza disso?");
                ac.showAlert();
                if (ac.getAletConfirmType() == AlertConfirmType.YES) {
                    try {
                        new PointController().deletePoint(id);
                        new Alert(this, true, "Ponto excluido com sucesso", AlertType.SUCCESS).showAlert();

                        DefaultTableModel tableModel = (DefaultTableModel) jtPoints.getModel();
                        tableModel.removeRow(selectedLine);

                    } catch (ClassNotFoundException | SQLException ex) {
                        new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
                    }
                }
            }

        }
    }//GEN-LAST:event_jtPointsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpHead;
    private edu.ecoleta.v2.components.JPanelRoundedBorder jpInputs;
    private edu.ecoleta.v2.components.SimpleTitleBar jpItemsTitle;
    private javax.swing.JTable jtPoints;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
