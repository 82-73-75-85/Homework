import java.util.Scanner;
public class Janken{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("ジャンケンをしよう！");
      System.out.println("グーは１、チョキは２、パーは３で数字を入力してね☆");
      System.out.println("１人目");
      int a = sc.nextInt();
      System.out.println("２人目");
      int b = sc.nextInt();
      if (a+1 == b || a==3 && b==1){
        System.out.println("一人目の勝ち！");
      }else if(a == b){
        System.out.println("あいこ！");
      }else{
        System.out.println("二人目の勝ち！");
      }
   }
}
