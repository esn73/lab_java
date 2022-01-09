package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain08 {
	private static final String FILE_NAME = "data/student_list.dat";

	public static void main(String[] args) {
		Random rand = new Random();
		// TODO 1: ArrayList<Student>를 생성
		// ArrayList에 Student 객체 5개를 추가
		// ArrayList를 파일에 write (Serialize, 직렬화)
		// ObjectOutputStream ==> BufferedOutStream==>FileOutputSteam ==> 파일
		ArrayList<Student> list = new ArrayList<Student>();
		Score score1 = new Score(50, 50, 100);
		Student stu1 = new Student(1, "AAA", score1);
		System.out.println(stu1);
		list.add(stu1);

		Student stu2 = new Student(2, "bbb", new Score(100, 100, 50)); // new Score(50, 50, 100); 위에꺼를 가져옴
		System.out.println(stu2);
		list.add(stu2);
		try (FileOutputStream out = new FileOutputStream(FILE_NAME);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) {

			for (int i = 0; i < 3; i++) {
				Score score = new Score(rand.nextInt(101), rand.nextInt(101), rand.nextInt(101));
				Student stu = new Student(rand.nextInt(100), "학생" + i, score);
				System.out.println(stu);
				list.add(stu);
			}
			oos.writeObject(list);
			System.out.println("파일 생성 성공!");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO 2: 1번에서 저장된 파일에서 객체를 read
		// 객체를 ArrayList로 타입 변환
		// ArrayList에 저장된 원소들을 모두 출력
		// ObjectInputStream <== BufferedInputStream <== FileInputStream <== 파일
		try (FileInputStream in = new FileInputStream(FILE_NAME);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {
			
			ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();
//			System.out.println(studentList);
			System.out.println();
			for (Student s : studentList) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
