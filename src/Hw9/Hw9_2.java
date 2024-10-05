package Hw9;

// if (balance > 3000) 跟 while(balance > 3000) 差在哪? 
//"熊大被老媽告知帳戶已經有錢!" 會在一開始輸出

public class Hw9_2 {
	public static void main(String[] args) { // 測試方法
		Fami fami = new Fami();
		BearMom bearmom = new BearMom(fami);
		Bear bear = new Bear(fami);
		bearmom.start();
		bear.start();
	}
}

class Fami { 
	private int balance = 0;

	synchronized public void momgive(int money) {
		while  (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");	
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("熊大被老媽告知帳戶已經有錢!");
		}
		balance += money;
		System.out.println("媽媽存了：" + money + "；帳戶共有：" + balance);
		notify();
	}

	synchronized public void bearwaste(int money) {
		while  (balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("熊大領了：" + money + "；帳戶共有" + balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

//媽媽執行續
class BearMom extends Thread {
	Fami fami;

	public BearMom(Fami fami) {
		this.fami = fami;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			while(!(Bear.finish)) {
				fami.momgive(2000);	
			}
	}
}

//熊大執行續
class Bear extends Thread {
	Fami fami;
	public static boolean finish = false;

	public Bear(Fami fami) {
		this.fami = fami;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			fami.bearwaste(1000);
		finish = true;
	}
}
