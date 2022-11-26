package edu.ecoleta.v2.components;

import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class SimpleButtonBar extends javax.swing.JPanel {

    public SimpleButtonBar() {
        initComponents();
        setOpaque(false);
        cmdClose.setIcon(iconClose.toIcon());
    }

    public void initEvent(JFrame fram) {

        cmdClose.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

    }

    public void initEventDispose(JDialog dial) {
        cmdClose.addActionListener((ActionEvent ae) -> {
            dial.dispose();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconClose = new javaswingdev.GoogleMaterialIcon();
        iconMax = new javaswingdev.GoogleMaterialIcon();
        iconMinimize = new javaswingdev.GoogleMaterialIcon();
        iconRestore = new javaswingdev.GoogleMaterialIcon();
        cmdClose = new edu.ecoleta.v2.components.Buttont();

        iconClose.setColor1(new java.awt.Color(111, 111, 111));
        iconClose.setColor2(new java.awt.Color(215, 215, 215));
        iconClose.setIcon(javaswingdev.GoogleMaterialDesignIcon.CLOSE);
        iconClose.setSize(18);

        iconMax.setColor1(new java.awt.Color(111, 111, 111));
        iconMax.setColor2(new java.awt.Color(215, 215, 215));
        iconMax.setIcon(javaswingdev.GoogleMaterialDesignIcon.CONTENT_COPY);
        iconMax.setSize(16);

        iconMinimize.setColor1(new java.awt.Color(111, 111, 111));
        iconMinimize.setColor2(new java.awt.Color(215, 215, 215));
        iconMinimize.setIcon(javaswingdev.GoogleMaterialDesignIcon.REMOVE);
        iconMinimize.setSize(18);

        iconRestore.setColor1(new java.awt.Color(111, 111, 111));
        iconRestore.setColor2(new java.awt.Color(215, 215, 215));
        iconRestore.setIcon(javaswingdev.GoogleMaterialDesignIcon.CROP_DIN);

        setMaximumSize(new java.awt.Dimension(64, 64));
        setMinimumSize(new java.awt.Dimension(64, 64));
        setPreferredSize(new java.awt.Dimension(64, 64));
        setLayout(null);

        cmdClose.setHoverColor(new java.awt.Color(255, 0, 0));
        add(cmdClose);
        cmdClose.setBounds(16, 16, 32, 32);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.Buttont cmdClose;
    private javaswingdev.GoogleMaterialIcon iconClose;
    private javaswingdev.GoogleMaterialIcon iconMax;
    private javaswingdev.GoogleMaterialIcon iconMinimize;
    private javaswingdev.GoogleMaterialIcon iconRestore;
    // End of variables declaration//GEN-END:variables
}
