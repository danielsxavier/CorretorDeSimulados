package danielsxavier.com.github;

import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

	Font font = new Font("SansSerif", Font.BOLD, 20);
		// get Jframe
		JFrame frameQuestions = new Frame().getjFrame();
		Questions contents = new Questions();
		Container contentPane = frameQuestions.getContentPane();
		
		//add buttons
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		frameQuestions.add(contents.getHeader());
		
		JPanel panelQuestions = new JPanel();
		JTextField questionsText = new JTextField("Questoes");
		questionsText.setFont(font);
		questionsText.setAlignmentX(JTextField.CENTER);
		panelQuestions.add(questionsText);
		contentPane.add(panelQuestions);
		
		//add questions area
		JScrollPane scrollQuestions= new JScrollPane(contents.getBodyQuestions());
		contentPane.add(scrollQuestions);
		
		JPanel panelTemplate = new JPanel();
		JTextField templateText = new JTextField("Gabarito");
		templateText.setFont(font);
		templateText.setAlignmentX(JTextField.CENTER);
		panelTemplate.add(templateText);
		contentPane.add(panelTemplate);
		
		//add template area
		JScrollPane scrollTemplate = new JScrollPane(contents.getBodyTemplate());
		contentPane.add(scrollTemplate);
		
		//set to visible
		frameQuestions.setVisible(true);
	}
}