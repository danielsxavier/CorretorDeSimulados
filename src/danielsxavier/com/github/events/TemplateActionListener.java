package danielsxavier.com.github.events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JTextField;

import danielsxavier.com.github.QuestionVO;

public class TemplateActionListener implements ActionListener {

    private Integer numberQuestion;
    private HashMap<Integer, QuestionVO> template;
    private QuestionVO questionVO;
    private JTextField field;

    public TemplateActionListener(Integer numberQuestion, HashMap<Integer, QuestionVO> template, JTextField field) {
	super();
	this.numberQuestion = numberQuestion;
	this.template = template;
	this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	System.out.println(this.numberQuestion + "-" + e.getActionCommand());
	this.questionVO = this.template.get(this.numberQuestion);
	this.questionVO.setResposta(e.getActionCommand());
	this.field.setBackground(Color.GREEN);
    }

}
