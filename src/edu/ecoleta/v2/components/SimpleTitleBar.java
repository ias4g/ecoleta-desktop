package edu.ecoleta.v2.components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SimpleTitleBar extends javax.swing.JPanel {

    private int x;
    private int y;

    public SimpleTitleBar() {
        initComponents();
    }

    public void init(JFrame fram) {
        initMoving(fram);
        simpleButtonBar2.initEvent(fram);
    }

    public void initDialog(JDialog dial) {
        initMovingDialog(dial);
        simpleButtonBar2.initEventDispose(dial);
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

    private void initMovingDialog(JDialog dial) {

        panelMove.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (dial.getSize().width <= 1024 && SwingUtilities.isLeftMouseButton(me)) {
                    x = me.getX() + 3;
                    y = me.getY() + 3;
                }
            }
        });

        panelMove.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    dial.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        simpleButtonBar2 = new edu.ecoleta.v2.components.SimpleButtonBar();

        setBackground(new java.awt.Color(50, 33, 83));
        setMaximumSize(new java.awt.Dimension(1024, 80));
        setMinimumSize(new java.awt.Dimension(1024, 80));
        setPreferredSize(new java.awt.Dimension(1024, 80));
        setLayout(null);

        panelMove.setOpaque(false);
        panelMove.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/logo-icon.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMove.add(jLabel1);
        jLabel1.setBounds(24, 0, 112, 80);

        add(panelMove);
        panelMove.setBounds(0, 0, 925, 80);
        add(simpleButtonBar2);
        simpleButtonBar2.setBounds(936, 8, 64, 64);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelMove;
    private edu.ecoleta.v2.components.SimpleButtonBar simpleButtonBar2;
    // End of variables declaration//GEN-END:variables
}
