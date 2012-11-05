package MVCGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener  {

	Model model;
	View view;
	
	public Controller (Model model, View view)
	{
		this.model = model;
		this.view=view;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.incrementCounter();
		view.getCustomPanel().repaint();
	}

	
	
}
