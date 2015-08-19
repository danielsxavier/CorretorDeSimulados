package danielsxavier.com.github.events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class CleanActionListener implements ActionListener {

	private Collection<JTextField> textFields;
	private Collection<ButtonGroup> buttonGroup;

	public CleanActionListener(Collection<JTextField> textFields, Collection<ButtonGroup> buttonGroup) {
		this.textFields = textFields;
		this.buttonGroup = buttonGroup;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (JTextField field : this.textFields) {
			field.setBackground(Color.WHITE);
		}

		for (ButtonGroup group : this.buttonGroup) {
			group.clearSelection();
		}

	}

}
