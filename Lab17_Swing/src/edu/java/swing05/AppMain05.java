package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AppMain05 {

	// 이미지 파일들이 저장된 폴더와 파일 이름을 문자열 상수(배열)로 정의
	
	private static final String[] IMAGES = {
			"images/flower1.jpg",
			"images/flower2.jpg",
			"images/flower3.jpg",
			"images/flower4.jpg",
			"images/flower5.jpg",
	};
	
	// 현재 application window에서 보여지는 이미지의 인덱스를 저장하는 변수
	private int index;
	
	private JFrame frame;
	private JLabel labelImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// JLable(Icon image) 생성자
		// 다형성을 이용해서, Icon 타입 객체를 전달하는 곳에 ImageICon 객체를 전달할 수 있음.
		// AppMain05 객체가 생성될 때, 멤버 변수 index는 기본값인 0으로 초기화됨.
		labelImage = new JLabel(new ImageIcon(IMAGES[index]));
		labelImage.setBounds(26, 35, 433, 245);
		frame.getContentPane().add(labelImage);
		
		JButton btnPrev = new JButton("<< 이전");
		btnPrev.setFont(new Font("돋움", Font.PLAIN, 16));
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPrevImgae();
			}
		});
		btnPrev.setBounds(23, 311, 176, 41);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음 >>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showNextImage();
			}
		});
		btnNext.setFont(new Font("돋움", Font.PLAIN, 16));
		btnNext.setBounds(280, 311, 176, 41);
		frame.getContentPane().add(btnNext);
	}

	protected void showPrevImgae() {
		if(index > 0) {
			index--; //인덱스 감소
			labelImage.setIcon(new ImageIcon(IMAGES[index]));
		}else {
			JOptionPane.showMessageDialog(frame, "첫번째 이미지입니다.");
		}
		
	}

	protected void showNextImage() {
		// 현재 인덱스(index)가 배열에 마지막의 인덱스보다 작으면 
		if(index < IMAGES.length - 1) {
			index++; // 인덱스 증가
			// 배열에서 증가된 인덱스로 파일 이름을 찾아서 이미지 아이콘을 설정.
			labelImage.setIcon(new ImageIcon(IMAGES[index]));
		}else {
			JOptionPane.showMessageDialog(frame, "마지막 이미지입니다.");
		}
		
	} //end initialize()
	
	
}
