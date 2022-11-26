package edu.ecoleta.v2.titlebar;

import edu.ecoleta.v2.components.About;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SimpleTitleBar extends javax.swing.JPanel {

    private ComponentResizer resize;
    private int x;
    private int y;

    public SimpleTitleBar() {
        initComponents();
    }

    public void init(JFrame fram) {
        resize = new ComponentResizer();
        resize.setSnapSize(new Dimension(10, 10));
        resize.setMinimumSize(new Dimension(300, 60));
        resize.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        resize.registerComponent(fram);
        initMoving(fram);
        simpleButtonBar1.initEvent(fram);
    }

    private void initMoving(JFrame fram) {
        panelMove.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (fram.getExtendedState() != JFrame.MAXIMIZED_BOTH && SwingUtilities.isLeftMouseButton(me)) {
                    x = me.getX() + 3;
                    y = me.getY() + 3;
                }
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me) && me.getClickCount() == 2) {
                    if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        fram.setExtendedState(JFrame.NORMAL);
                    } else {
                        fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    }
                }
            }

        });
        panelMove.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        fram.setExtendedState(JFrame.NORMAL);
                    }
                    fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        simpleButtonBar1 = new edu.ecoleta.v2.titlebar.SimpleButtonBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 33, 83));
        setLayout(new java.awt.CardLayout());

        panelMove.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/logo-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoveLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(simpleButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoveLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(simpleButtonBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16))
        );

        add(panelMove, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelMove;
    private edu.ecoleta.v2.titlebar.SimpleButtonBar simpleButtonBar1;
    // End of variables declaration//GEN-END:variables
}
