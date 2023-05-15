// 'public'はどこからでもアクセス可能なクラスであることを示します。'class'はクラスを定義していることを示します。この行では、'Todo'という名前のクラスを公開して定義しています。
public class Todo {

  // 'private'はクラスの外部からはアクセスできないフィールドを示します。この行では、文字列型の'task'というフィールドを定義しています。
  private String task;

  // この行では、真偽値型の'isCompleted'というフィールドを定義しています。
  private boolean isCompleted;

  // 'public'はどこからでもアクセス可能なメソッドであることを示します。この行では、'Todo'という名前のコンストラクタを定義しています。コンストラクタはクラスのインスタンスが生成される際に呼び出される特殊なメソッドです。
  public Todo(String task) {
    // 'this'は現在のインスタンスを参照します。この行では、引数として渡された'task'をインスタンスの'task'フィールドに代入しています。
    this.task = task;
    

    // この行では、インスタンスの'isCompleted'フィールドをfalseに設定しています。
    this.isCompleted = false;
  }

  // この行では、'task'フィールドの値を取得する公開メソッド'getTask'を定義しています。
  public String getTask() {
    return task;
  }

  // この行では、'isCompleted'フィールドの値を取得する公開メソッド'isCompleted'を定義しています。
  public boolean isCompleted() {
    return isCompleted;
  }

  // この行では、'isCompleted'フィールドの値をtrueに設定する公開メソッド'complete'を定義しています。
  public void complete() {
    this.isCompleted = true;
  }

  // '@Override'は親クラスのメソッドを上書きすることを示します。この行では、'toString'メソッドを上書きしています。'toString'メソッドはオブジェクトを文字列形式で表現するためのメソッドです。
  @Override
  public String toString() {
    // この行では、タスクが完了している場合は"[x]"を、そうでない場合は"[ ]"を先頭に付けて、タスクの内容を文字列として返しています。
    return (isCompleted ? "[x] " : "[ ] ") + task;
  }
}
