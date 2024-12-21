/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circles;

/**
 *
 * @author admin
 */
import javax.swing.JOptionPane;

public class circles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String r = JOptionPane.showInputDialog(" enter raduis: ");
        double ra = Double.parseDouble(r);
        circle me = new circle(ra);
        JOptionPane.showMessageDialog(null, "radius: " + me.Radius());
        JOptionPane.showMessageDialog(null, "area: " + me.area());
        JOptionPane.showMessageDialog(null, "circumference " + me.circumference());
        JOptionPane.showMessageDialog(null, "diameter " + me.diameter());
    }
}
