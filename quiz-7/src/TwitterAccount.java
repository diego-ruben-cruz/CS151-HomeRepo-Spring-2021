import java.util.ArrayList;
import java.util.Collections;

public class TwitterAccount implements Comparable<TwitterAccount> {
	private int numberOfFollowers;
	private String username;

	public TwitterAccount(int numberOfFollowers, String username) {
		this.numberOfFollowers = numberOfFollowers;
		this.username = username;
	}

	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return numberOfFollowers + ", " + username;
	}

	@Override
	public int compareTo(TwitterAccount other) {
		if (this.getNumberOfFollowers() < other.getNumberOfFollowers()) {
			return 1;
		} else if (this.getNumberOfFollowers() > other.getNumberOfFollowers()) {
			return -1;
		} else {
			return this.getUsername().compareTo(other.username);
		}
	}

	@Override
	public boolean equals(Object other) {
		return this.compareTo((TwitterAccount) other) == 0;
	}

	public static void main(String[] args) {
		ArrayList<TwitterAccount> accounts = new ArrayList<>();
		accounts.add(new TwitterAccount(22, "maria"));
		accounts.add(new TwitterAccount(550900, "lexfridman"));
		accounts.add(new TwitterAccount(340900, "foundmyfitness"));
		accounts.add(new TwitterAccount(22, "abcdxyz"));

		Collections.sort(accounts);
		for (TwitterAccount acc : accounts) {
			System.out.println(acc);
		}
	}

}