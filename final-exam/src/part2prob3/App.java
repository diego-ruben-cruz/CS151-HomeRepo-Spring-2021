package part2prob3;


import part2prob3controller.Controller;
import part2prob3controller.Message;
import part2prob3model.NumModel;
import part2prob3view.View;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {

        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        NumModel model = new NumModel();
        View view = new View(queue, model.getCurrentNum());
        Controller controller = new Controller(queue, model, view);
        controller.mainLoop();
    }
}