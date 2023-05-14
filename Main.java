public class Main {
  public static void main(String[] args) {
    TodoList todoList = new TodoList();

    Todo todo1 = new Todo("Buy milk");
    Todo todo2 = new Todo("Study Java");

    todoList.add(todo1);
    todoList.add(todo2);

    todoList.display();

    todoList.complete(0);

    todoList.display();
  }
}
