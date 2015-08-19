package danielsxavier.com.github.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AboutActionListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {	
	JOptionPane.showMessageDialog(null, "Criado por: Daniel da Silva Xavier" + "\nGithub: " + "https://github.com/danielsxavier" + "\nEmail: danielsxo@gmail.com");
    }

}
