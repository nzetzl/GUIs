import javax.swing.*;
import java.awt.Component;


public class PopUps extends JDialog {
    
    public static void main(String[] args) {
        JOptionPane popUp = new JOptionPane("You need to Upgrade your software!");
        Icon icon = UIManager.getIcon("OptionPane.warningIcon");
        popUp.setIcon(icon);
        JDialog d = popUp.createDialog(null, "You Got Hacked!");
        d.setLocationRelativeTo(null);
        while(true) {
            for (int i = 0; i < 8; i++) {
                d.setLocation(150 * i, 100 * i);
                d.setVisible(true);
            }
            for (int i = 0; i < 8; i++) {
                d.setLocation(150 * i, 750 - 125 * i);
                d.setVisible(true);
            }
        }
    }
}