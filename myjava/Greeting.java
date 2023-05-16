import java.util.ArrayList;

class Greeting {
  public static void main(String args[]){
  ArrayList<Integer> scores = new ArrayList<Integer>();

  scores.add(1);
  scores.add(5);
  scores.add(10);
  scores.add(15);

  System.out.println(scores.get(0));
  System.out.println(scores.get(1));
  System.out.println(scores.get(2));
  System.out.println(scores.get(3));
  }
}
