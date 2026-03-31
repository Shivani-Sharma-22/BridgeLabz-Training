package FileBackupScheduler;

import java.util.PriorityQueue;

class BackupScheduler {

    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException {

        if(task.folderPath == null || task.folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }

        queue.add(task);
        System.out.println("Backup task added successfully.");
    }

    public void executeTasks() {
        if(queue.isEmpty()) {
            System.out.println("No backup tasks pending.");
            return;
        }

        System.out.println("\nExecuting Backup Tasks (Priority Order):");

        while(!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Executing -> " + task);
        }
    }
}

