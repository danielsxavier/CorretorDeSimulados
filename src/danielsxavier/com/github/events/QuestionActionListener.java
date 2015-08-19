package danielsxavier.com.github.events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JTextField;

import danielsxavier.com.github.QuestionVO;

public class QuestionActionListener implements ActionListener {

	private Integer numberQuestion;
	private HashMap<Integer, QuestionVO> answers;
	private QuestionVO questionVO;
	private JTextField field;

	public QuestionActionListener(Integer numberQuestion, HashMap<Integer, QuestionVO> answers, JTextField field) {
		super();
		this.numberQuestion = numberQuestion;
		this.answers = answers;
		this.field = field;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.numberQuestion + "-" + e.getActionCommand());
		this.questionVO = this.answers.get(this.numberQuestion);
		this.questionVO.setResposta(e.getActionCommand());
		this.field.setBackground(Color.GREEN);
	}

}
