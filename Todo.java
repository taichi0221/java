public class Todo {
  private String task;
  private boolean isCompleted;

  public Todo(String task) {
    this.task = task;
    this.isCompleted = false;
  }

  public String getTask() {
    return task;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public void complete() {
    this.isCompleted = true;
  }

  @Override
  public String toString() {
    return (isCompleted ? "[x] " : "[ ] ") + task;
  }
}
