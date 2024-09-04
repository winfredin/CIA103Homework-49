package HwExt;


public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 2, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		
		saber.info();
		saber.attack();
		saber.move();
		saber.defend();
		
		System.out.println("");

		archer.info();
		archer.attack();
		archer.move();
		archer.defend();
	}

}
