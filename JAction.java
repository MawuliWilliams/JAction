//9/30/21

import javax.swing.*;
import java.awt.*;

public class JComponents extends JFrame
{
	final int WIDTH = 300;
	final int HEIGHT = 150;

	// default constructor for this class
	public JComponents()
	{
		super("Frame with Components");
		setSize(WIDTH, HEIGHT);
		setDetfaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel heading = new JLabel("This frame has many components!");
		heading.setFont(new Font("Arial", Font.BOLD, 16));

		Jlabel namePrompt = new Jlabel("Enter your name");

		JtextField nameField = new JTextField(12);

		JButton button = new JButton("Click to continue");
		button.setTipText("Click here");

		add(heading);
		add(namePrompt);
		add(nameField);
		add(button);


	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		namePrompt.setText("Thank you so much!");
		nameField.setText("");

		// create an object variable to extract some some event data 
		Object source = e.getSource();
		// see which component is the source of the event
		if(source == button)
		{
			heading.setText("Tou clicked the button")

        }
        else
        {
        	heading.setText("You pressed enter");
        }
	}

	public static void main(String[] args)
	{
		JAction aFrame = new JAction();
		aFrame.setVisible(true);
	}
}
