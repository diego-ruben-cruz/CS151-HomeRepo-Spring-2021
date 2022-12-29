package part2prob3view;

import part2prob3controller.Message;

import part2prob3controller.UpvoteMessage;
import part2prob3controller.DownvoteMessage;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class View extends JFrame {
	BlockingQueue<Message> queue;
	JButton UpvoteButton;
	JButton DownvoteButton;

	JLabel totalVoteNum;

	public View(BlockingQueue<Message> queue, int currentNum) {
		this.queue = queue;

		this.totalVoteNum = new JLabel(Integer.toString(currentNum));

		this.UpvoteButton = new JButton("Upvote");
		this.DownvoteButton = new JButton("Downvote");

		this.add(totalVoteNum);
		this.add(UpvoteButton);
		this.add(DownvoteButton);

		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		UpvoteButton.addActionListener(e -> {
			try {
				queue.put(new UpvoteMessage());
			} catch (InterruptedException exception) {// do nothing}

			}
		});

		DownvoteButton.addActionListener(e -> {
			try {
				queue.put(new DownvoteMessage());
			} catch (InterruptedException exception) {// do nothing}

			}
		});
	}

	public void updateTotalVotes(int inputNum) {
		this.totalVoteNum.setText(Integer.toString(inputNum));
	}
}