package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AppMain06 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JButton btn;
	private JTextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LabelName = new JLabel("이름");
		LabelName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		LabelName.setBounds(12, 10, 108, 47);
		frame.getContentPane().add(LabelName);
		
		JLabel LabelNumber = new JLabel("전화번호");
		LabelNumber.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		LabelNumber.setBounds(12, 84, 108, 47);
		frame.getContentPane().add(LabelNumber);
		
		JLabel LabelEmail = new JLabel("이메일");
		LabelEmail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		LabelEmail.setBounds(12, 161, 108, 47);
		frame.getContentPane().add(LabelEmail);
		
		textName = new JTextField();
		textName.setBounds(174, 10, 237, 55);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(174, 84, 237, 55);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(174, 153, 237, 55);
		frame.getContentPane().add(textEmail);
		
		btn = new JButton("입력 완료");
		btn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showInfo();
				
			}
		});
		btn.setBounds(12, 218, 130, 34);
		frame.getContentPane().add(btn);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		textArea.setBounds(12, 268, 410, 73);
		frame.getContentPane().add(textArea);		

	} //end initialize

	protected void showInfo() {
		// 3개의 TextFild에서 이름, 전화번호, 이메일을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		
//		String message = "이름: " + name  + "\n"
//				+ "전화번호: " + phone + "\n" 
//				+ "이메일: " + email;
		
		StringBuffer message = new StringBuffer(); // StringBuffer 객체 생성
		message.append("이름: ").append(name).append("\n")
		.append("전화번호: ").append(phone).append("\n")
		.append("이메일: ").append(email);
		
		textArea.setText(message.toString());
		
		//3개의 JTextField의 내용을 모두 지움
		clearAllTextField();
	}

	private void clearAllTextField() {
		textName.setText("");
		textPhone.setText("");
		textEmail.setText("");
		
	}
}
