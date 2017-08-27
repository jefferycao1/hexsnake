import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
public class ControlPanel extends JPanel implements ActionListener{

	public JLabel diffField, scoreField, speedField, diff, score, lengthField, length, display, panel;
	private JPanel control;
	private Game game;
	long startTime;

	public ControlPanel(Game gm)
	{
	   // setup GUI:
	   diff = new JLabel("Difficulty:");
	   display = new JLabel("HexSnake");
	   panel = new JLabel("Panel");
	   score = new JLabel("Score:");
	   diffField = new JLabel("Easy");
	   length = new JLabel("Length:");
	   lengthField = new JLabel("1");
	   scoreField = new JLabel("0");
	   control = new JPanel();
	   
	   display.setFont(new Font("Verdana", Font.BOLD, 14));
	   panel.setFont(new Font("Verdana", Font.BOLD, 14));
	   
	   control.setLayout(new GridLayout(8,2,5,5));
	   control.add(new JLabel(""));
	   control.add(new JLabel(""));
	   control.add(display);
	   control.add(panel);
	   control.add(new JLabel(""));
	   control.add(new JLabel(""));
	   control.add(diff);
	   control.add(diffField);
	   control.add(new JLabel(""));
	   control.add(new JLabel(""));
	   control.add(score);
	   control.add(scoreField);
	   control.add(new JLabel(""));
	   control.add(new JLabel(""));
	   control.add(length);
	   control.add(lengthField);
	   
	   //write it here
	   add(control);
	   this.setPreferredSize(new Dimension(150,500));

	   game = gm;
	}

	public ArrayList<JLabel> getAllLabels()
	{
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		labels.add(display);
		labels.add(panel);
		labels.add(diff);
		labels.add(diffField);
		labels.add(score);
		labels.add(scoreField);
		labels.add(length);
		labels.add(lengthField);
		return labels;
	}
	
	
	public void update(int score)
	{
		scoreField.setText(String.format("%03d", score));
	}

	public JPanel getControl()
	{
		return control;
	}
	public JLabel getDiffField()
	{
		return diffField;
	}
	public JLabel getLengthField()
	{
		return lengthField;
	}



	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		
		
	}
	
	
}
