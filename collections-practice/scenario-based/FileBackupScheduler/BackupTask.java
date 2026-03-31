package FileBackupScheduler;

class BackupTask implements Comparable<BackupTask> {
    int taskId;
    String folderPath;
    int priority;   // higher number = higher priority

    public BackupTask(int taskId, String folderPath, int priority) {
        this.taskId = taskId;
        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask o) {
        return Integer.compare(o.priority, this.priority);  
        // descending order → higher priority first
    }

    @Override
    public String toString() {
        return "TaskID: " + taskId +
                " | Path: " + folderPath +
                " | Priority: " + priority;
    }
}

