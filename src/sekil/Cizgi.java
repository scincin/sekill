/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekil;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author selo
 */
public class Cizgi extends Sekil{
     @Override
    public void ciz(Graphics graphics) {
        super.paintComponent(graphics); 
        graphics.setColor(new Color(255, 0, 0));
        graphics.drawLine(200, 100, 50, 50);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}
