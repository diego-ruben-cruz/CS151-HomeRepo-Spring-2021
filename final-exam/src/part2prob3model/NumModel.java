package part2prob3model;

public class NumModel {
	private int currentNum = 7;

	public void setCurrentNum(int newNum) {
		if (newNum > 0 && newNum < 10) {
			currentNum = newNum;
		}
	}

	public int getCurrentNum() {
		return this.currentNum;
	}

	public void addOne(int inputNum) {
		if (currentNum < 10) {
			currentNum = currentNum + inputNum;
		}
	}

	public void removeOne(int inputNum) {
		if (currentNum > 0) {
			currentNum = currentNum + inputNum;
		}
	}
}