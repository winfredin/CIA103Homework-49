package Hw9;

public class Hw9 {

	static class Thec extends Thread {
		private String characterName; // 用來存放角色名稱

		public Thec(String name) {
			this.characterName = name; // 傳入角色名稱
		}

		public void run() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(characterName + "吃第" + i + "碗飯");
				try {
					Thread.sleep((int) (Math.random() * 2500 + 500)); // 隨機暫停500到3000毫秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(characterName + "吃完了！");
		}
	}

	// Them 類別 (饅頭人)
	static class Them extends Thread {
		private String characterName; // 用來存放角色名稱

		public Them(String name) {
			this.characterName = name; // 傳入角色名稱
		}

		public void run() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(characterName + "吃第" + i + "碗飯");
				try {
					Thread.sleep((int) (Math.random() * 2500 + 500)); // 隨機暫停500到3000毫秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(characterName + "吃完了！");
		}
	}

//	class Them extends Thread {
//		Hw9 hw9 = new Hw9("饅頭人");
//
//		public Them(Hw9 hw9) {
//			this.hw9 = hw9;
//		}
//
//		public void run() {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(name + "吃第" + i + "碗飯");
//				try {
//					Thread.sleep((int) (Math.random() * 2500 + 500));
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println(name + "吃完了！");
//		}
//	}
//	public void run() {
//		while (bowl <= 10) {
//			System.out.println(name + "吃第" + bowl + "碗飯");
//			bowl++;
//			try {
//				Thread.sleep((int) (Math.random() * 2500 + 500));
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(name + "吃完了！");

//		if (bowl == 10) {
//			System.out.println("----大胃王快食比賽結束！----");
//		}
//	}

	public static void main(String[] args) {
		System.out.println("----大胃王快食比賽開始！----");

		// 創建詹姆士和饅頭人的執行緒
		Thec james = new Thec("詹姆士");
		Them mantou = new Them("饅頭人");

		// 開始比賽（啟動執行緒）
		james.start();
		mantou.start();

		// 確保主執行緒等待兩個比賽執行緒結束
		try {
			james.join();
			mantou.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("----大胃王快食比賽結束！----");
	}
}
