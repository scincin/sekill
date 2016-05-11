/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekil;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Line2D;

/**
 *
 * @author selo
 */
public class Ucgen extends Sekil {

    @Override
    public void ciz(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(new Color(255, 0, 0));
        graphics.drawLine(50, 150, 150, 150); //üçgenin tabanı - bottom
        graphics.drawLine(100, 100, 50, 150); //sol taraf - left line
        graphics.drawLine(100, 100, 150, 150);//sağ taraf - right line
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }

}
