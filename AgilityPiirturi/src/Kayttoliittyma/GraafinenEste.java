/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import agilitypiirturi.Este;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author iitu
 */
public class GraafinenEste extends Este {

    public GraafinenEste(int x, int y, int kulma) {
        super(x, y, kulma);
    }

    public void draw(Graphics g) {
        int x = this.getX();
        int y = this.getY();

        //piirrä este
        g.setColor(Color.black);
        g.fillOval(x- 12, y - 12, 24, 24);
        g.setColor(Color.BLUE);
        g.fillOval(x - 10, y - 10, 20, 20);
    }
}