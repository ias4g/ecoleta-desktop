package edu.ecoleta.v2.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Area;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

public class AboutBackground extends JPanel {

    public AboutBackground() {
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(new Color(245, 245, 245));
        setForeground(new Color(118, 118, 118));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 40;
        int width = getWidth();
        int heigth = getHeight();
        Area area = new Area(new Rectangle2D.Double(x, y, width, heigth - y));
        g2.setColor(getBackground());
        g2.fill(area);

        g2.dispose();

        super.paintComponent(g);
    }

}
