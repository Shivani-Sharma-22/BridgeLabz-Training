public class BackgroundJob {
    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Job interrupted");
            }
            System.out.println("Background job finished!");
        };

        Thread t = new Thread(job);
        t.start();
    }
}
