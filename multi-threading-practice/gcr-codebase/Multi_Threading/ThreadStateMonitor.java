package Multi_Threading;

import java.time.*;

class TaskRunner extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {}
        for (int i = 0; i < 1000000; i++) ;
    }
}

class StateMonitor extends Thread {
    Thread[] tasks;

    StateMonitor(Thread[] tasks) {
        this.tasks = tasks;
    }

    public void run() {
        boolean done;
        do {
            done = true;
            for (Thread t : tasks) {
                System.out.println("[Monitor] " + t.getName() + " " + t.getState() + " " + LocalTime.now());
                if (t.getState() != Thread.State.TERMINATED) done = false;
            }
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
            }
        } while (!done);
    }
}

public class ThreadStateMonitor {
    public static void main(String[] args) {
        TaskRunner task1 = new TaskRunner();
        TaskRunner task2 = new TaskRunner();

        task1.setName("Task-1");
        task2.setName("Task-2");

        StateMonitor m = new StateMonitor(new Thread[]{task1, task2});

        m.start();
        task1.start();
        task2.start();
    }
}