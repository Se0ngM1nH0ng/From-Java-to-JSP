package class01;

import java.util.HashSet;
import java.util.Random;

// ����� Ǯ�� 
public class Test05 {
   public static void main(String[] args) {
      
      // 1���� 10�� VS 10���� 1��
      // -> � �ڷ����� �����ϴ���?
      // �迭 < �÷���(�迭����Ʈ,����)
      // �迭����Ʈ < ����
      
      HashSet<Integer> data=new HashSet<Integer>();
      Random rand=new Random();
      
      for(int i=0;i<10;i++) {
         int num=rand.nextInt(15)+1;
         System.out.println("������: "+num);
         data.add(num);
      }
      
      System.out.println(data.size());
      System.out.println(data);
      
      // +) ����, ������ �ϰ�ʹٸ�?
      // ���� xxx -> �迭����Ʈ�� �̵��ؼ� ����
      
      
      
      
      
   }
}