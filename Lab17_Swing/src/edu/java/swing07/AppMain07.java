package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

public class AppMain07 {

	private JFrame frame;
	private JTextField textId;
	private JPasswordField passwordField;
	private JButton btn;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LabelId = new JLabel("Id");
		LabelId.setOpaque(true);
		LabelId.setBackground(SystemColor.info);
		LabelId.setHorizontalAlignment(SwingConstants.CENTER);
		LabelId.setFont(new Font("Calibri", Font.PLAIN, 19));
		LabelId.setBounds(12, 36, 108, 36);
		frame.getContentPane().add(LabelId);
		
		JLabel LabelPwd = new JLabel("Password");
		LabelPwd.setOpaque(true);
		LabelPwd.setBackground(SystemColor.info);
		LabelPwd.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPwd.setFont(new Font("Calibri", Font.PLAIN, 19));
		LabelPwd.setBounds(12, 95, 108, 36);
		frame.getContentPane().add(LabelPwd);
		
		textId = new JTextField(); // 한줄만 작성가능
		textId.setBounds(154, 36, 246, 36);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 96, 246, 36);
		frame.getContentPane().add(passwordField);
		
		btn = new JButton("확인");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btn.setBounds(154, 154, 97, 23);
		frame.getContentPane().add(btn);
		
		textArea = new JTextArea(); //줄바꿈가능
		textArea.setBounds(12, 194, 389, 89);
		frame.getContentPane().add(textArea);
	}

	private void showInfo() {
		String id = textId.getText();
		if(id.equals("")) { //id=="" 주소값을 비교해서 equals 사용할것!
			System.out.println("ID 입력 안됨");
		}
		
		
		
		char[] pwd = passwordField.getPassword();
		// JPasswordField 클래스의 getText 메서드는 deprecated(더 이상 사용을 권장하지 않는) 메서드.
		// 더이상 오류 수정을 하지 않고, Java 버전이 업그레이드 될 때 사라질 수 있는 메서드.
		// getText 대신에 getPassword 메서드를 사용하기를 권장.
		
		StringBuffer msg =  new StringBuffer();
		msg.append("아이디: ").append(id).append("\n")
		.append("비밀번호: ").append(pwd);
		
		textArea.setText(msg.toString()); // StringBuffer를 toString을 써서 string으로 바꾸기
		
	}
	
	
}
