package pizzasystems;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class mainframe extends JFrame {

	private JPanel contentPane;
	public JTextArea textArea = new JTextArea();
	private ArrayList<Topping> list = new ArrayList(); 
	String[] pizzaNames = {"Margarita", "Pepperoni", "Hawaiian", "Three Cheese"};
	JComboBox<String> comboBox = new JComboBox(pizzaNames);
	JCheckBox chckbxNewCheckBox;
	JCheckBox chckbxNewCheckBox_1;
	JCheckBox chckbxNewCheckBox_2;
	JCheckBox chckbxNewCheckBox_3;
	JRadioButton rdbtnNewRadioButton_2;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton;	
	public mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 203, 210, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 47, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Please select pizza type");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Choose Additional Toppings");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose the size");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		rdbtnNewRadioButton_2 = new JRadioButton("small");
		panel_1.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_1 = new JRadioButton("medium");
		panel_1.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("large");
		panel_1.add(rdbtnNewRadioButton);
		
		chckbxNewCheckBox = new JCheckBox("Olive");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox.gridx = 2;
		gbc_chckbxNewCheckBox.gridy = 1;
		panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Corn");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_1.gridx = 2;
		gbc_chckbxNewCheckBox_1.gridy = 2;
		panel.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		
		textArea.setRows(1);
		textArea.setColumns(2);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 2;
		panel.add(textArea, gbc_textArea);
		
		chckbxNewCheckBox_2 = new JCheckBox("Chicken");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_2.gridx = 2;
		gbc_chckbxNewCheckBox_2.gridy = 3;
		panel.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("Tomato");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_3.gridx = 2;
		gbc_chckbxNewCheckBox_3.gridy = 4;
		panel.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.addActionListener(e -> addHandler(e));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 5;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(e->orderHandler(e));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		ButtonGroup group1 = new ButtonGroup(); 
		group1.add(rdbtnNewRadioButton);
		group1.add(rdbtnNewRadioButton_2);
		group1.add(rdbtnNewRadioButton_1);
	}
	
	private void addHandler(ActionEvent e) {
		String added = "";
		if(chckbxNewCheckBox.isSelected()) {
			list.add(new Topping("Olive"));
		}
		if(chckbxNewCheckBox_1.isSelected()) {
			list.add(new Topping("Corn"));
		}
		if(chckbxNewCheckBox_2.isSelected()) {
			list.add(new Topping("Chicken"));
		}
		if(chckbxNewCheckBox_3.isSelected()) {
			list.add(new Topping("Tomato"));
		}
		JOptionPane.showMessageDialog(null, "Toppings added!", "Added Successfully!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void orderHandler(ActionEvent e) {
		Order o = new Order(); 
		if(!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected() && !rdbtnNewRadioButton_2.isSelected()) {
			JOptionPane.showMessageDialog(null, "You didn't select a size! Please select a size!", "Select a size!", JOptionPane.ERROR_MESSAGE);
			return; 
		}
		var size = "large";
		if(rdbtnNewRadioButton.isSelected()) {
			size = "small";
		}
		if(rdbtnNewRadioButton_1.isSelected()) {
			size = "small";
		}
		o.Display(o.calculatePrice(size, comboBox.getSelectedItem().toString(), list), textArea);
	}}
