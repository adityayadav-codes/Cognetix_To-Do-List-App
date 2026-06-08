public class Task {

    private String description;
    private String status;

    public Task(String description) {

        this.description = description;
        this.status = "Pending";
    }

    public String getDescription() {

        return description;
    }

    public String  getStatus() {

        return status;
    }

    public void setDescription(String description) {

        this.description = description;
    }
    public void setStatus(String status) {

        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", status=" + status + "]";
    }
}
