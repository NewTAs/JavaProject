import java.util.Scanner;
public class Lab3_1 {
	public static void p (String str) {
		System.out.println(str); //�޼ҵ�
	}

	public static void main(String[] agrs) //�����Լ�
		{
			 p //������ֱ�����
			 		("================"
			 		+ "\n�й�: 201804014"
			 		+ "\n�̸�: �ڼҿ�"
			 		+ "\n================"); //�ѹ��� ������ֱ� ���� +�� ��� 
		
			 
			 Scanner sy=new Scanner(System.in);
			 int a = 0;
			 int i = 0;
			 int k = 0;
			 int yo = 0;		    	 // ������ �ʱ�ȭ
			
			 do{

			 p ("�л� ���� �Է����ּ���.");
			
		     a = sy.nextInt(); //���� �� �Է� ����
    	 	 int so [] = new int [a] ; //�л��� so�� ����, ���� �Է�	
    	 	 if (a>0) {
		     p (a+"���� ���α׷��� ������ �Է����ּ���.(0~100)"); //�л� �� ���� �Է¹��� �� �Է��ؾ���
		     for (i = 0; i <a ; i++){ //���� �Է�
    	  		    	 
			    	 System. out.print(i+1+":"); 
			    	 so [i] = sy.nextInt(); 
			    	 //System. out.println(so[i]);
		    	 
		    	 if (0 <= so[i] && so[i] <= 100) {
		    		 
		    	 }
		    	 else{
			    	 p("�߸� �Է��ϼ̽��ϴ�.\n"
			    	 		+ (i+1) +"��° �л��� ������ 0������ ó�� �˴ϴ�.");
			    	 so [i] = 0;
			    	 }

		     }		
		     
		     for (i = 0; i < a; i++){
			    //System.out.println(so[i]);
		    	 yo = so [i]/10;
		    	 if (yo<1) {
		    		yo = yo+1;
		    	 }
			    
			    System.out.print ((i+1)+"�� "+so[i]+"�� : ");
			    for (k = 0; k < yo; k++) {
			    	System.out.print("*");}
			    p("");}
		     }
			 }while (a!=0);
			p("�л����� �߸� �Է��ϼ̽��ϴ�. �ý����� ����˴ϴ�.");}//�л� �� 0  �Է��ϸ� �ý��� ����
 
	}