package edu.java.swing09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain09 {
	
	
	// JComboBox의 아이템으로 사용하기 위한 문자열 배열을 정의
	private static final String[] ITEMS = {"Facebook","Youtube","Instagram"};
	

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup(); // default생성자
	private JRadioButton rdPrivate;
	private JRadioButton rdPackage;
	private JRadioButton rdProtected;
	private JRadioButton rdPublic;
	private JButton btnConfirm;
	private JCheckBox cbAbstract;
	private JCheckBox cbstatic;
	private JCheckBox cbFinal;
	private JComboBox<String> comboBox;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain09 window = new AppMain09();
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
	public AppMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rdPrivate = new JRadioButton("private");
		rdPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdPrivate);
		rdPrivate.setFont(new Font("돋움", Font.PLAIN, 16));
		rdPrivate.setBounds(7, 32, 82, 23);
		frame.getContentPane().add(rdPrivate);
		
		rdPackage = new JRadioButton("packege");		
		rdPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdPackage);
		rdPackage.setFont(new Font("돋움", Font.PLAIN, 16));
		rdPackage.setBounds(103, 33, 94, 23);
		frame.getContentPane().add(rdPackage);
		
		rdProtected = new JRadioButton("protected");
		rdProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdProtected);
		rdProtected.setFont(new Font("돋움", Font.PLAIN, 16));
		rdProtected.setBounds(215, 33, 107, 23);
		frame.getContentPane().add(rdProtected);
		
		rdPublic = new JRadioButton("public");
		rdPublic.setSelected(true);
		buttonGroup.add(rdPublic);
		rdPublic.setFont(new Font("돋움", Font.PLAIN, 16));
		rdPublic.setBounds(336, 32, 75, 23);
		frame.getContentPane().add(rdPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbAbstract.setFont(new Font("돋움", Font.PLAIN, 15));
		cbAbstract.setBounds(8, 70, 94, 45);
		frame.getContentPane().add(cbAbstract);
		
		cbstatic = new JCheckBox("static");
		cbstatic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbstatic.setFont(new Font("돋움", Font.PLAIN, 15));
		cbstatic.setBounds(104, 70, 77, 45);
		frame.getContentPane().add(cbstatic);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
				
			}
		});
		
		cbFinal.setFont(new Font("돋움", Font.PLAIN, 15));
		cbFinal.setBounds(195, 69, 94, 45);
		frame.getContentPane().add(cbFinal);
		
		comboBox = new JComboBox<>(); //JComboBox**<String>();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 익명 지역 내부 클래스 안에서는 바깥(외부) 클래스의 멤버들을 사용할 수 있음.
			Object selected	= (String) comboBox.getSelectedItem();
			textArea.setText(selected + " 선택됨.");
			}
		});
		
		// ComboBoxModel: 콤보 박스에서 보여질 아이템들을 가지고 있는 객체
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>(ITEMS);
		// 콤보박스 ComboBoxModel 객체를 설정 -> 선택할 수 있는 리스트(아이템)가 설정됨.
		comboBox.setModel(comboModel);
		comboBox.setFont(new Font("돋움", Font.PLAIN, 15));
		comboBox.setBounds(7, 121, 94, 33);
		frame.getContentPane().add(comboBox);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnConfirm.setFont(new Font("돋움", Font.PLAIN, 13));
		btnConfirm.setBounds(7, 164, 97, 33);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setBounds(7, 213, 415, 115);
		frame.getContentPane().add(textArea);
	}

	private void showInfo() {
		StringBuffer buffer = new StringBuffer();
		
		//버튼 그룹에서 선택된 버튼 찾기
		ButtonModel btnModel = buttonGroup.getSelection();
		buffer.append(btnModel).append("\n");
		

		
		//라디오버튼들 중에서 선택된 상태
		if(rdPrivate.isSelected()) {
			buffer.append(rdPrivate.getText());
		}else if(rdPackage.isSelected()) {
			buffer.append(rdPackage.getText());
		}else if(rdProtected.isSelected()) {
			buffer.append(rdProtected.getText());
		}else if(rdPublic.isSelected()) {
			buffer.append(rdPublic.getText());
		}
		buffer.append(" 라디오버튼 선택. \n" );
		
		
		// 체크박스 선택 상태
		if(cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" 체크박스 선택. \n");
		}
		if(cbstatic.isSelected()) {
			buffer.append(cbstatic.getText()).append(" 체크박스 선택. \n");
		}
		if(cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" 체크박스 선택. \n");
		}
		
		
		// 콤보 박스 선택 상태
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append(" 콤보 박스 아이템 선택.");

		textArea.setText(buffer.toString());
	}

	private void showCheckBoxStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
		// instanceof 연산자를 사용하면 더 안전하게 casting할 수 있음.
		JCheckBox chkBox = (JCheckBox) e.getSource();
		boolean selected = chkBox.isSelected(); // ->isSelected **boolean타입이라 getter메소드는 Is를 붙임!
		
		textArea.setText(cmd + "체크박스 선택 여부: " + selected);
	}

	private void showRadioButtonStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
//		Object source = e.getSource(); // 이벤트가 발생한 컴포넌트 객체
		textArea.setText(cmd + "라디오 버튼 선택됨");
	}
}
