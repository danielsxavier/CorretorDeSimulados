package danielsxavier.com.github.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JOptionPane;

import danielsxavier.com.github.QuestionVO;
import danielsxavier.com.github.exceptions.NotFilled;

public class CalculateActionListener implements ActionListener {

    private HashMap<Integer, QuestionVO> answers;
    private HashMap<Integer, QuestionVO> template;

    public CalculateActionListener(HashMap<Integer, QuestionVO> answers, HashMap<Integer, QuestionVO> template) {
	this.answers = answers;
	this.template = template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

	try {
	    for (QuestionVO question : this.template.values()) {
		if (question.getResposta() == null) {
		    throw new NotFilled("Erro! Preencha todo o Gabarito.");
		}
	    }

	    for (QuestionVO question : this.answers.values()) {
		if (question.getResposta() == null) {
		    throw new NotFilled("Erro! Preencha todas as respostas.");
		}
	    }

	    int total = 0;
	    for (int i = 1; i <= 60; i++) {
		Integer key = new Integer(i);
		if (this.answers.get(key).equals(this.template.get(key))) {
		    total++;
		}
	    }
	    JOptionPane.showMessageDialog(null, "Acertos: " + total  + "\nPorcentagem: " + ((total*100)/60));
	} catch (NotFilled exception) {
	    JOptionPane.showMessageDialog(null, exception.getMessage());
	}

    }

}
