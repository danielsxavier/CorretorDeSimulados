package danielsxavier.com.github;

import javax.swing.JFrame;

public class Frame {

	private JFrame jFrame;

	public Frame() {
		jFrame = new JFrame("Corretor de Simulados Colegio Portal");
		jFrame.setSize(800, 600);
		jFrame.setVisible(true);
	}

	public JFrame getjFrame() {
		return jFrame;
	}
}
