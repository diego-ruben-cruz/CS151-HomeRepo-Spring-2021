package part2prob3controller;

import part2prob3model.NumModel;
import part2prob3view.View;

import java.util.concurrent.BlockingQueue;

public class Controller {
	BlockingQueue<Message> queue;
	NumModel numModel;
	View view;

	public Controller(BlockingQueue<Message> queue, NumModel givenNumModel, View view) {
		this.queue = queue;
		this.numModel = givenNumModel;
		this.view = view;
	}

	public void mainLoop() {
		while (view.isDisplayable()) {
			Message message = null;
			try {
				message = queue.take();
			} catch (InterruptedException exception) {
				// do nothing
			}

			if (message.getClass() == UpvoteMessage.class) {
				// button Upvote was clicked
				UpvoteMessage upvoteMessage = (UpvoteMessage) message;
				numModel.addOne(upvoteMessage.sendValue()); // update model
				view.updateTotalVotes(numModel.getCurrentNum());
			} else if (message.getClass() == DownvoteMessage.class) {
				// button Downvote was clicked
				// update model and view
				DownvoteMessage downvoteMessage = (DownvoteMessage) message;
				numModel.removeOne(downvoteMessage.sendValue());
				view.updateTotalVotes(numModel.getCurrentNum());
			}

		}
	}
}