package Hw7;

import java.io.*;

public class Hw7_4 {
	public static void main(String[] args) throws Exception{
//		File dir1 = new File("C:\\data\\Object.ser");     //建立目錄物件
		File f1 = new File("C:\\data"); // 目錄物件
		f1.mkdir();
		
		File file = new File("C:\\data\\Object.ser");
		
		Dog[] dd = new Dog[2];
		dd[0] = new Dog("張風");
		dd[1] = new Dog("黃紅");
		
		Cat[] cc = new Cat[2];
		cc[0] = new Cat("張搧");
		cc[1] = new Cat("黃會");
		//寫入
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < dd.length; i++) {
			oos.writeObject(cc[i]);
			oos.writeObject(dd[i]);
		}
		oos.close();
		fos.close();
		//讀取
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				Object obj = ois.readObject(); // 讀取物件
				
				// 利用instanceof判斷物件類型
				if (obj instanceof Dog) {
					((Dog) obj).speak(); // 轉型為Dog並呼叫speak()
				} else if (obj instanceof Cat) {
					((Cat) obj).speak(); // 轉型為Cat並呼叫speak()
				}
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}