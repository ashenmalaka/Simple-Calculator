package basicCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class BasicCalculator {

	private JFrame frame;
	private JTextField addValue1;
	private JTextField addValue2;
	private JButton btnNewButton;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JLabel lblNewLabel_2;
	private JTextField answerDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalculator window = new BasicCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BasicCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Basic Calculator");
		lblNewLabel.setBounds(0, 0, 497, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Number 01");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(67, 48, 86, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEnterNumber = new JLabel("Enter Number 02");
		lblEnterNumber.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblEnterNumber.setBounds(294, 48, 86, 37);
		frame.getContentPane().add(lblEnterNumber);
		
		addValue1 = new JTextField();
		addValue1.setFont(new Font("Tahoma", Font.BOLD, 20));
		addValue1.setBounds(67, 79, 160, 37);
		frame.getContentPane().add(addValue1);
		addValue1.setColumns(10);
		
		addValue2 = new JTextField();
		addValue2.setFont(new Font("Tahoma", Font.BOLD, 20));
		addValue2.setColumns(10);
		addValue2.setBounds(293, 79, 160, 37);
		frame.getContentPane().add(addValue2);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1,number2,answer;
				try 
				{
					number1 = Integer.parseInt(addValue1.getText());
					number2 = Integer.parseInt(addValue2.getText());
					answer = number1 + number2;
					answerDisplay.setText(Integer.toString(answer));
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid INTEGER number...!!!");
				}
			}
		});
		btnNewButton.setBounds(67, 152, 89, 49);
		frame.getContentPane().add(btnNewButton);
		
		btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,answer;
				try
				{
					number1 = Integer.parseInt(addValue1.getText());
					number2 = Integer.parseInt(addValue2.getText());
					answer = number1 - number2;
					answerDisplay.setText(Integer.toString(answer));
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid INTEGER number...!!!");
				}
			}
		});
		btnSub.setBounds(166, 152, 89, 49);
		frame.getContentPane().add(btnSub);
		
		btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,answer;
				try
				{
					number1 = Integer.parseInt(addValue1.getText());
					number2 = Integer.parseInt(addValue2.getText());
					answer = number1 * number2;
					answerDisplay.setText(Integer.toString(answer));
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid INTEGER number...!!!");
				}
			}
		});
		btnMul.setBounds(265, 152, 89, 49);
		frame.getContentPane().add(btnMul);
		
		btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,answer;
				try
				{
					number1 = Integer.parseInt(addValue1.getText());
					number2 = Integer.parseInt(addValue2.getText());
					answer = number1 / number2;
					answerDisplay.setText(Integer.toString(answer));
				}
				catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid INTEGER number...!!!");
				}
			}
		});
		btnDiv.setBounds(364, 152, 89, 49);
		frame.getContentPane().add(btnDiv);
		
		lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(67, 224, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		answerDisplay = new JTextField();
		answerDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		answerDisplay.setBounds(67, 251, 382, 44);
		frame.getContentPane().add(answerDisplay);
		answerDisplay.setColumns(10);
	}

}
