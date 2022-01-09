package edu.java.swing13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain13 {

	
	
	private JFrame frame;
	private JTable table;
	private JLabel LabelName;
	private JLabel LabelNumber;
	private JLabel LabelEmail;
	private JTextField textName;
	private JTextField textNumber;
	private JTextField textEmail;
	private JButton btnInput;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain13 window = new AppMain13();
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
	public AppMain13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 439, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		LabelName = new JLabel("이름");
		LabelName.setFont(new Font("돋움", Font.PLAIN, 16));
		LabelName.setBounds(12, 38, 57, 15);
		frame.getContentPane().add(LabelName);
		
		LabelNumber = new JLabel("연락처");
		LabelNumber.setFont(new Font("돋움", Font.PLAIN, 16));
		LabelNumber.setBounds(12, 74, 57, 15);
		frame.getContentPane().add(LabelNumber);
		
		LabelEmail = new JLabel("이메일");
		LabelEmail.setFont(new Font("돋움", Font.PLAIN, 16));
		LabelEmail.setBounds(12, 109, 57, 15);
		frame.getContentPane().add(LabelEmail);
		
		textName = new JTextField();
		textName.setBounds(100, 36, 200, 21);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textNumber = new JTextField();
		textNumber.setColumns(10);
		textNumber.setBounds(100, 67, 200, 21);
		frame.getContentPane().add(textNumber);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(100, 102, 200, 21);
		frame.getContentPane().add(textEmail);
		
		panel = new JPanel();
		panel.setBounds(12, 154, 399, 106);
		frame.getContentPane().add(panel);
		
		table = new JTable();
		panel.add(table);
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInput.setBounds(312, 35, 97, 23);
		frame.getContentPane().add(btnInput);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setBounds(312, 66, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setBounds(312, 101, 97, 23);
		frame.getContentPane().add(btnDelete);
	}
}
