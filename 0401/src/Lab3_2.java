import java.util.Scanner;

public class Lab3_2 {
	public static void p (String str) {
		System.out.println(str); //�޼ҵ�
	}

	public static void main(String[] agrs) //2���� ���� �� �ޱ�
		{
			 p //������ֱ�����
			 		("================"
			 		+ "\n�й�: 201804014"
			 		+ "\n�̸�: �ڼҿ�"
			 		+ "\n================"); //�ѹ��� ������ֱ� ���� +�� ���
			 

			 Scanner sy =new Scanner(System.in);
			 p("����� ũ�⸦ �Է��ϼ���.");
			 int rows = sy.nextInt();
			 int cois = sy.nextInt();
			 
			 
			 
			 int array1[][] = new int[rows][cois]; //2���� �迭 ����1
			
			 p("1��° matrix");
			 for(int i = 0; i<array1.length; i++) {
				 for(int j=0; j<array1[i].length; j++) {
					 System.out.print("("+i+", "+j+ ") : ");
					 array1[i][j]=sy.nextInt();

			 
				 }
			 } 
			 for (int i = 0 ; i< array1.length; i++){
				 for (int j = 0 ;j< array1[i].length; j++) {
					 System. out.print (array1[i][j]+"\t");
				 }
			 	 System. out.println ();
			 }

			 int array2[][] = new int[rows][cois]; //2���� �迭 ����2
			 p("2��° matrix");
			 for(int i = 0; i<array2.length; i++) {
				 for(int j = 0; j<array2[i].length; j++) {
					 System.out.print("("+i+", "+j+ ") : ");
					 array2[i][j]=sy.nextInt();					 
				 }
				 
			 }
			 
			 for (int i = 0 ; i< array2.length; i++){
				 for (int j = 0 ;j<array2[i].length; j++) {
					 System. out.print (array2[i][j]+"\t");
				 }
			 	 System. out.println ();
			 }
					 
			 int result[][] = new int[rows][cois]; //2���� �迭 (���)
			 p("���");
			 for (int i = 0 ; i< result.length; i++){
				 for (int j = 0 ;j < result[i].length; j++) {
					 result[i][j] = array1[i][j] + array2[i][j]; //�ΰ��� �迭�� ������
					 System.out.print (result[i][j]+"\t");
				 }
			 	 System. out.println ();
		
			 }
		}
	}