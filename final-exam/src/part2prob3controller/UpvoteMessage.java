package part2prob3controller;

public class UpvoteMessage implements Message {
	private int addition = 1;

	public int sendValue() {
		return addition;
	}

}