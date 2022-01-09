package edu.java.swing01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class AppMain01 {

	private JFrame frame; // 멤버 변수-static이 없는 인스턴스 변수

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Thread를 EventQueue에 등록하고, Java Runtime에 의해서 (스케쥴링되서) thread가 실행
		EventQueue.invokeLater(new Runnable() { //public static이 붙어서 바로 사용가능. Queue-FIFO방식 thread 등록
			@Override
			public void run() {
				try {
					AppMain01 window = new AppMain01();
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
	public AppMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 340, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 창 종료
		
		JLabel lblHello = new JLabel("Hello, Swing!");
		lblHello.setFont(new Font("Calibri", Font.BOLD, 17));
		frame.getContentPane().add(lblHello, BorderLayout.CENTER);
	}

}
