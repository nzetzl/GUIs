import javax.swing.*;
import java.awt.Component;


public class CirclePopUps {
    
    public static void main(String[] args) {
        JOptionPane popUp = new JOptionPane("You need to Upgrade your software!");
        Icon icon = UIManager.getIcon("OptionPane.warningIcon");
        popUp.setIcon(icon);
        JDialog d = popUp.createDialog(null, "You Got Hacked!");
        d.setLocationRelativeTo(null);
        while(true) {
            for (int i = 0; i < 10; i++) {
                d.setLocation(100 * i, 0);
                d.setVisible(true);
            }
            for (int i = 0; i < 8; i++) {
                d.setLocation(1000, 100 * i);
                d.setVisible(true);
            }
            for (int i = 0; i < 10; i++) {
                d.setLocation(1000 - 100 * i, 1000);
                d.setVisible(true);
            }
            for (int i = 0; i < 10; i++) {
                d.setLocation(0, 1000 - 100 * i);
                d.setVisible(true);
            }
        }
    }
}