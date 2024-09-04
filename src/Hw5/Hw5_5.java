package Hw5;

public class Hw5_5 {
//	6身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，當呼叫此方法時，
//	會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫	與數字的亂數組合，

	public static String genAuthCode() {
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        char[] authCode = new char[8]; 
//        int length = characters.length();
//
//        for (int i = 0; i < 8; i++) {
//            int index = (int) (Math.random() * length);
//            authCode[i] = characters.charAt(index); 
//        }
//
//        return new String(authCode);

		char[] authCode = new char[8];

		for (int i = 0; i < 8; i++) {
			int indexroot = (int) (Math.random() * 3) + 1;
			int indexup = (int) (Math.random() * (90 - 65 +1)) + 65;
			int indexnum = (int) (Math.random() * (57 -48 + 1)) + 48;
			int indexlow = (int) (Math.random() * (122 -97 +1)) + 97;

			if (indexroot == 1) {
				authCode[i] = (char) indexup;
			} else if (indexroot == 2) {
				authCode[i] = (char) indexnum;
			} else if (indexroot == 3) {
				authCode[i] = (char) indexlow;
			} else {
			}
		}
		return new String(authCode);

	}

	public static void main(String[] args) {
		String authCode = genAuthCode();
		System.out.println("本次隨機產生驗證碼為: " + authCode);

//		char xxx = 65;
//		char xxx1 = 90;
//		char xxx2 = 48;
//		char xxx3 = 57;
//		char xxx4 = 97;
//		char xxx5 = 122;
//		System.out.println("本為: " + xxx);
//		System.out.println("本為: " + xxx1);
//		System.out.println("本為: " + xxx2);
//		System.out.println("本為: " + xxx3);
//		System.out.println("本為: " + xxx4);
//		System.out.println("本為: " + xxx5);
	}

}
