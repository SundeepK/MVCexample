package MVCGame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View extends JFrame  implements Observer {

	JButton incrementButton = new JButton("Increment");
	Model model;
	Label valueLabel = new Label();
	PanelCustom cus;
	public View(Model model)
	{
		super("MVC simple Example");
		this.model = model;
		
		
		Frame frame = new Frame();
		Panel panel = new Panel();
		Panel panelCanvas = new Panel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(incrementButton);
	     cus = new PanelCustom();
		frame.add(cus);
		panelCanvas.add(valueLabel);
		frame.add("North",panelCanvas);
		frame.add("South",panel);		
		valueLabel.setText("");
		frame.addWindowListener(new OnWindowClose());	
		frame.setSize(400,400);
		frame.setLocation(0,0);
		frame.setVisible(true);
			
		this.pack();
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(420,420));
	}
	
	public void addController(ActionListener actionLis)
	{
		incrementButton.addActionListener(actionLis);

	}
	
	
	public PanelCustom getCustomPanel()
	{
		return cus;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		valueLabel.setText("" + ((Integer)arg1).intValue());
	
	}
	
	public static class OnWindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			e.getWindow().dispose();
			System.exit(0);
		}
		
	}
	
	
	public class PanelCustom extends JPanel
	{
		
		PanelCustom() {
	            // set a preferred size for the custom panel.
	            setPreferredSize(new Dimension(420,420));
	        }

		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Random random = new Random();
			g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
			g.fillRect(random.nextInt(200), random.nextInt(200), random.nextInt(300), random.nextInt(300));
			
		}
		
	}
	

}
