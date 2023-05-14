import java.util.ArrayList;

public class TodoList {
  private ArrayList<Todo> todos;

  public TodoList() {
    todos = new ArrayList<>();
  }

  public void add(Todo todo) {
    todos.add(todo);
  }

  public void complete(int index) {
    if (index < 0 || index >= todos.size()) {
      System.out.println("Invalid index");
      return;
    }

    Todo todo = todos.get(index);
    todo.complete();
  }

  public void display() {
    for (int i = 0; i < todos.size(); i++) {
      System.out.println((i + 1) + ". " + todos.get(i));
    }
  }
}
