
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhonebookGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhonebookGUI window = new PhonebookGUI();
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
	public PhonebookGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Phonebook Application");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		//Display JList and Populate it
		DefaultListModel listModel = new DefaultListModel();
		for (int i = 0; i < 1; i++){
		String fname = "FirstName";
		String lname = "LastName";
		String number = "1112223333";
		Phonebook pbook = new Phonebook(fname, lname, number);
		listModel.addElement(pbook);
				}
				
		JList list = new JList(listModel);
		frame.getContentPane().add(list, BorderLayout.CENTER);
		
		JRadioButton rdbtnFirstname = new JRadioButton("Firstname");
		panel_1.add(rdbtnFirstname);
		
		JRadioButton rdbtnLastname = new JRadioButton("Lastname");
		panel_1.add(rdbtnLastname);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnFirstname);
		bgroup.add(rdbtnLastname);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		/*
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton);
		*/
		
		JButton btnNewButton_1 = new JButton("Sort");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		//Adds new values to the JList insert firstname, lastname and number in the three textfields and hit the button and they should appear in the JList
		JButton btnNewButton_2 = new JButton("Add");
		panel_3.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				JPanel panel1 = new JPanel();
				JTextField textbox = new JTextField(10);
				JTextField textbox1 = new JTextField(10);
				JTextField textbox2 = new JTextField(10);
				JLabel label = new JLabel("First Name");
				JLabel label1 = new JLabel("Last Name");
				JLabel label2 = new JLabel("Phone Number");
				
				panel1.add(label);
				panel1.add(textbox);
				panel1.add(label1);
				panel1.add(textbox1);
				panel1.add(label2);
				panel1.add(textbox2);
				
				JDialog dialog = new JDialog();
				dialog.getContentPane().add(panel1);
				dialog.pack();
				dialog.setSize(new Dimension(150,200));
				dialog.setResizable(false);
				dialog.setVisible(true);
				
				JButton button = new JButton();
				button.setText("Enter");
				panel1.add(button, BorderLayout.NORTH);
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent a){
						String fname = textbox.getText();
						String lname = textbox1.getText();
						String number = textbox2.getText();
						Phonebook pbook = new Phonebook (fname, lname, number);
						listModel.addElement(pbook);
						dialog.setVisible(false);
					}
				});
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("Remove");
		panel_3.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				DefaultListModel listModel = (DefaultListModel) list.getModel();
				int selectedIndex = list.getSelectedIndex();
				if (selectedIndex != -1){
					listModel.remove(selectedIndex);
				}
			}
		});
		
		JButton btnNewButton_4 = new JButton("Change");
		btnNewButton_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				JPanel panel1 = new JPanel();
				JTextField textbox = new JTextField(10);
				JTextField textbox1 = new JTextField(10);
				JTextField textbox2 = new JTextField(10);
				JLabel label = new JLabel("First Name");
				JLabel label1 = new JLabel("Last Name");
				JLabel label2 = new JLabel("Phone Number");
				
				panel1.add(label);
				panel1.add(textbox);
				panel1.add(label1);
				panel1.add(textbox1);
				panel1.add(label2);
				panel1.add(textbox2);
				
				JDialog dialog = new JDialog();
				dialog.getContentPane().add(panel1);
				dialog.pack();
				dialog.setSize(new Dimension(150,200));
				dialog.setResizable(false);
				dialog.setVisible(true);
				
				JButton button = new JButton();
				button.setText("Enter");
				panel1.add(button, BorderLayout.NORTH);
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent a){
						dialog.setVisible(false);
					}
				});
			}
		});
		panel_3.add(btnNewButton_4);
		
		JScrollBar scrollBar = new JScrollBar();
		frame.getContentPane().add(scrollBar, BorderLayout.EAST);
		
	}
	
}