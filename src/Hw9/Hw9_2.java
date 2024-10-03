package Hw9;
//沒執行到10次正常?   
//死結問題發生在哪?
// if (balance > 3000) 跟 while(balance > 3000) 差在哪? 
//"熊大被老媽告知帳戶已經有錢!" 會在一開始輸出

public class Hw9_2 {
	public static void main(String[] args) {
		Fami fami = new Fami();
		Mom mom = new Mom(fami);
		Bear bear = new Bear(fami);
		mom.start();
		bear.start();
	}
}

class Fami{
	private int balance = 0; 

	synchronized public void momgive(int money) {
		if (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
//				notifyAll();
				System.out.println("熊大被老媽告知帳戶已經有錢!");
				wait();
//				System.out.println("熊大被老媽告知帳戶已經有錢!");   //加在 wait 後會亂顯示?
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了：" + money + "；帳戶共有：" + balance);
		notify();
//		if(balance >= 3000) {
//		}
	}

	synchronized public void bearwaste(int money) {
		if (balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			if(balance == 0) {
				System.out.println("媽媽被熊大要求匯款");
			}
			
			try {
//				notifyAll();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("熊大領了：" + money + "；帳戶共有" + balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
		}
		notify();

	}
}


class Mom extends Thread {
	Fami fami;

	public Mom(Fami fami) {
		this.fami = fami;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
//			try {
//				Thread.sleep(1000);  
//			} catch (InterruptedException e) {   //為甚麼加sleep 沒辦法跑完
//				e.printStackTrace();
//			}
			fami.momgive(2000); 
		}
	
}

class Bear extends Thread {
	Fami fami;

	public Bear(Fami fami) {
		this.fami = fami;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
//			try {
//				Thread.sleep(1000);  
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			fami.bearwaste(1000); 
	}
}
