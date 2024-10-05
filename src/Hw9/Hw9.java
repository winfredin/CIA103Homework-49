package Hw9;

public class Hw9 extends Thread{
	private String name; 
	
	public Hw9(String name) {
		this.name = name;
	}

	public Hw9() {
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			try {
				Thread.sleep((int) (Math.random() * 2500 + 500)); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了！");
	}

	public static void main(String[] args) {
		System.out.println("----大胃王快食比賽開始！----");
		
		Hw9 jj = new Hw9("詹姆士");
		Hw9 mm = new Hw9("饅頭人");
		
		jj.start();
		mm.start();
		
		try {
			jj.join();
			mm.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----大胃王快食比賽結束！----");
	}
}
	
	
//	static class Thej extends Thread {
//		private String name; 
//
//		public Thej(String name) {
//			this.name = name; 
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
//
//	static class Them extends Thread {
//		private String name; 
//
//		public Them(String name) {
//			this.name = name; 
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

