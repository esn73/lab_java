package edu.java.file06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 프로그램 ==> ObjectOutputStream ==> FileOutputStream ==> 파일 
 * 	- ObjextOutputStream: 객체를 파일에 write할 수 있는 형태로 변환(Serialize, 직렬화)
 * 
 * 
 * 프로그램 <== ObjectInputStream <== FileInputStream <== 파일
 * 	- ObjectInputStream: 파일의 내용을 Java 객체 타입으로 변환(Deserialize, 역직렬화)
 * 
 * 
 */

public class FileMain06 {

	public static void main(String[] args) {
		// 파일에 객체 타입을 write -> 객체 타입이 저장된 파일에서 read

		// 1.write object

		try (FileOutputStream out = new FileOutputStream("data/product.dat");
				ObjectOutputStream oos = new ObjectOutputStream(out);) {
			Product p1 = new Product(1, "프로젝터", 10000);
			oos.writeObject(p1); // 직렬화(serialization): Product 타입의 객체를 파일에 write. 다형성

			System.out.println("파일 생성 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. read object

		try (FileInputStream in = new FileInputStream("data/product.dat");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			Object obj = ois.readObject(); //** 상속 부모타입으로 리턴 
			if (obj instanceof Product) { // 그 객체가 원하는 product타입인지 확인
				Product p = (Product) obj;//casting 
				System.out.println(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end main()

}
