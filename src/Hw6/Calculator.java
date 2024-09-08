package Hw6;

public class Calculator {

	private int x, y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		setx(x);
		sety(y);
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public void setx(int x) throws CalException{
		if (x > 0) {
			this.x = x;
		} else if (x == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else {
			throw new CalException("輸入格式不正確");
		}

	}

	public void sety(int y) throws CalException {
		if (y > 0) {
			this.y = y;
		} else if (y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		} else {
			throw new CalException("輸入格式不正確");
		}

	}
}
