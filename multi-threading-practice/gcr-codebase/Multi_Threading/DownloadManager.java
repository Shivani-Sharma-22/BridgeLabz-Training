package Multi_Threading;

import java.util.*;

class FileDownloader extends Thread {
    private String file;

    FileDownloader(String file) {
        this.file = file;
    }

    public void run() {
        Random r = new Random();
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + getName() + "] Downloading " + file + ": " + i + "%");
            try {
                Thread.sleep(200 + r.nextInt(300));
            }
            catch (Exception e) {}
        }
    }
}

public class DownloadManager {
    public static void main(String[] args) throws Exception {
        FileDownloader file1 = new FileDownloader("Document.pdf");
        FileDownloader file2 = new FileDownloader("Image.jpg");
        FileDownloader file3 = new FileDownloader("Video.mp4");

        file1.start();
        file2.start();
        file3.start();

        file1.join();
        file2.join();
        file3.join();

        System.out.println("All downloads complete");
    }
}
