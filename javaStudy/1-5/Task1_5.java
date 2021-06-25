public class Task1_5 {
  public static void main(String[] args) {
    String[] fruits = {"みかん","りんご","ぶどう","メロン"};
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }
    // 変数iが100より小さい時、変数iの値を出力。ループ毎に変数iに1加算される
    int i = 1;
    while(i <= 100) {
      System.out.print(i);
      i++;
    }
    System.out.println();
    for (int t = 1; t <= 9; t++) {
      System.out.print(t + " || ");
      for (int j = 1; j <= 9; j++) {
        System.out.print(t * j + " | ");
      }
      System.out.println();
    }
  }
}
