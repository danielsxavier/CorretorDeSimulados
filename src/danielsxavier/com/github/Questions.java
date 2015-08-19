package danielsxavier.com.github;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import danielsxavier.com.github.events.AboutActionListener;
import danielsxavier.com.github.events.CalculateActionListener;
import danielsxavier.com.github.events.CleanActionListener;
import danielsxavier.com.github.events.QuestionActionListener;
import danielsxavier.com.github.events.TemplateActionListener;

public class Questions {

	private JPanel header, bodyQuestions, bodyTemplate;
	private HashMap<Integer, QuestionVO> answers = new HashMap<Integer, QuestionVO>();
	private HashMap<Integer, QuestionVO> template = new HashMap<Integer, QuestionVO>();
	private Collection<JTextField> textFields = new ArrayList<JTextField>();
	private Collection<ButtonGroup> buttonGroups = new ArrayList<>();
	

	public Questions() {

		this.header = new JPanel();
		this.bodyQuestions = new JPanel();
		this.bodyTemplate = new JPanel();
		
		this.bodyQuestions.setLayout(new GridLayout(3, 2));
		this.bodyTemplate.setLayout(new GridLayout(3, 2));

		addContentHeader();
		addContentBodyQuestions();
		addContentBodyTemplate();

		this.header.setVisible(true);
		this.bodyQuestions.setVisible(true);
		this.bodyTemplate.setVisible(true);
	}

	public void addContentHeader() {
		JButton calculate = new JButton("Calcular nota");
		calculate.addActionListener(new CalculateActionListener(this.answers, this.template));
		this.header.add(calculate);
		
		JButton clean = new JButton("Limpar");
		clean.addActionListener(new CleanActionListener(this.textFields, this.buttonGroups));
		this.header.add(clean);
		
		JButton about = new JButton("Sobre");
		about.addActionListener(new AboutActionListener());
		this.header.add(about);
	}

	public void addContentBodyQuestions() {
		ButtonGroup group;

		for (int i = 1; i <= 60; i++) {
			QuestionVO question = new QuestionVO(i);
			this.answers.put(question.getNumber(), question);
			JTextField field = new JTextField(question.toString());
			this.textFields.add(field);
			JRadioButton btn1 = new JRadioButton("a");
			JRadioButton btn2 = new JRadioButton("b");
			JRadioButton btn3 = new JRadioButton("c");
			JRadioButton btn4 = new JRadioButton("d");
			JRadioButton btn5 = new JRadioButton("e");
			
			btn1.addActionListener(new QuestionActionListener(question.getNumber(),	this.answers, field));
			btn2.addActionListener(new QuestionActionListener(question.getNumber(), this.answers, field));
			btn3.addActionListener(new QuestionActionListener(question.getNumber(), this.answers, field));
			btn4.addActionListener(new QuestionActionListener(question.getNumber(), this.answers, field));
			btn5.addActionListener(new QuestionActionListener(question.getNumber(), this.answers, field));
			
			

			group = new ButtonGroup();
			group.add(btn1);
			group.add(btn2);
			group.add(btn3);
			group.add(btn4);
			group.add(btn5);
			this.buttonGroups.add(group);

			JPanel questions = new JPanel();

			questions.add(field);
			questions.add(btn1);
			questions.add(btn2);
			questions.add(btn3);
			questions.add(btn4);
			questions.add(btn5);
			questions.setLayout(new BoxLayout(questions, BoxLayout.Y_AXIS));
			this.bodyQuestions.add(questions);
		}
	}
	
	public void addContentBodyTemplate() {
		ButtonGroup group;

		for (int i = 1; i <= 60; i++) {
			QuestionVO template = new QuestionVO(i);
			this.template.put(template.getNumber(), template);
			JTextField field = new JTextField(template.toString());
			JRadioButton btn1 = new JRadioButton("a");
			JRadioButton btn2 = new JRadioButton("b");
			JRadioButton btn3 = new JRadioButton("c");
			JRadioButton btn4 = new JRadioButton("d");
			JRadioButton btn5 = new JRadioButton("e");
			
			btn1.addActionListener(new TemplateActionListener(template.getNumber(),	this.template, field));
			btn2.addActionListener(new TemplateActionListener(template.getNumber(), this.template, field));
			btn3.addActionListener(new TemplateActionListener(template.getNumber(), this.template, field));
			btn4.addActionListener(new TemplateActionListener(template.getNumber(), this.template, field));
			btn5.addActionListener(new TemplateActionListener(template.getNumber(), this.template, field));

			group = new ButtonGroup();
			group.add(btn1);
			group.add(btn2);
			group.add(btn3);
			group.add(btn4);
			group.add(btn5);

			JPanel questions = new JPanel();

			questions.add(field);
			questions.add(btn1);
			questions.add(btn2);
			questions.add(btn3);
			questions.add(btn4);
			questions.add(btn5);
			questions.setLayout(new BoxLayout(questions, BoxLayout.Y_AXIS));
			
			this.bodyTemplate.add(questions);
		}
	}

	public JPanel getBodyQuestions() {
		return bodyQuestions;
	}

	public JPanel getBodyTemplate() {
		return bodyTemplate;
	}

	public JPanel getHeader() {
		return header;
	}
	
	

}
