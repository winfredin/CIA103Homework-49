//package Hw9;
//
//public class TestWaitNotify {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        Thread momThread = new Thread(new Mom(account));
//        Thread bearThread = new Thread(new Bear(account));
//
//        momThread.start();
//        bearThread.start();
//    }
//}
//
//class BankAccount {
//    private int balance = 0;
//
//    public synchronized void deposit(int amount) {
//        balance += amount;
//        System.out.println("媽媽存了 " + amount + "，帳戶共有：" + balance);
//        if (balance > 3000) {
//            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
//            notify();  // 通知熊大可以取錢
//        }
//    }
//
//    public synchronized void withdraw(int amount) {
//        while (balance < amount || balance <= 2000) {
//            if (balance == 0) {
//                System.out.println("熊大看到帳戶沒錢，暫停提款");
//            } else {
//                System.out.println("熊大看到餘額在2000以下，要求匯款");
//            }
//            try {
//                wait();  // 等待媽媽存錢
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        balance -= amount;
//        System.out.println("熊大領了 " + amount + "，帳戶共有：" + balance);
//        if (balance <= 2000) {
//            notify();  // 通知媽媽需要存錢
//        }
//    }
//}
//
//class Mom implements Runnable {
//    private BankAccount account;
//
//    public Mom(BankAccount account) {
//        this.account = account;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            account.deposit(2000);
//            try {
//                Thread.sleep((long) (Math.random() * 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Bear implements Runnable {
//    private BankAccount account;
//
//    public Bear(BankAccount account) {
//        this.account = account;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            account.withdraw(1000);
//            try {
//                Thread.sleep((long) (Math.random() * 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
