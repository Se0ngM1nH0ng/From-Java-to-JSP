package class01;

public class Test04 {

	public static void main(String[] args) {
//			while (3��) �̰� �ִ� �����̾����� !
//				[1]���ڵ带 
//				if(�����̶��) -> ���� ����
//					break;
//			if(3�� �� �����̾� ?
//				�̸��Է�
//				�Է¹��� �̸��� ���
				
		

		// 369���� 1,2�� Ǯ��
		

		   // input: ����� ������� �Է°��� �˷��ָ�
		   // output: ������� Ʋ�ȴ����� ��ȯ
		   public static boolean check(int num,String user) {
		      final int NUM=num;
		      int cnt=0; // �ڼ��� ����

		      int x=1000;
		      while(x>0) {
		         int n=num/x;
		         if(n==3 || n==6 || n==9) {
		            cnt++;
		         }

		         num%=x; // 1234 -> 234
		         x/=10;
		      }

		      String ans="";
		      for(int i=0;i<cnt;i++) {
		         ans+="¦";
		      }
		      if(cnt==0) {
		         ans=Integer.toString(NUM);
		      }

		      System.out.println("ans: "+ans);
		      System.out.println("user: "+user);

		      if(ans.equals(user)) {
		         return true;
		      }
		      return false;
		   }

		  

		      // while(�ִ� 3��)
		      //     [1]
		      //     if(�����̶��) -> ��������
		      //         break;
		      // if(3�� �� �����̾�?)
		      //     �̸� �Է�
		      //     �Է¹��� �̸��� ���

		      Scanner sc=new Scanner(System.in);
		      Random rand=new Random();

		      final int LV=3;
		      int i=0;
		      while(i<LV) {
		         int num=rand.nextInt(1000)+1;
		         System.out.print("["+num+"] : ");
		         String user=sc.next();

		         if(!check(num,user)) { // �����Ȳ�̶��, -> ��������
		            System.out.println("�����Դϴ�.....");
		            break;
		         }
		         System.out.println("�����Դϴ�!");
		         i++;
		      }

		      if(i==LV) {
		         System.out.print("�̸��Է�) ");
		         String name=sc.next();
		         System.out.println(name+"��, �����մϴ�!~~");
		      }








		   }
		}
				
}
}