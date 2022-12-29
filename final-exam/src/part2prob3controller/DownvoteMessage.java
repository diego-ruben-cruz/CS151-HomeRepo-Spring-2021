package part2prob3controller;

public class DownvoteMessage implements Message {
	private int subtraction = -1;

	public int sendValue() {
		return subtraction;
	}

}