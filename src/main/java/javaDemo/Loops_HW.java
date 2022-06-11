package javaDemo;

public class Loops_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<15; i++) {
			System.out.println("I am learning Selenium using Java language");
		}
		
		System.out.println("_____________________________");
		String[] emp = {"Harun","Reza", "Daizy", "Touhid","Shipan","Sumaiya","xyz","abc","Mamun","ijk"};
		for(int j=0; j<10; j++) {
			
			System.out.println(emp[j]);
		}
	
		System.out.println("_____________________________");
		
		/*String[] emp1= new String[3];
		
		emp1[0]="Harun";
		emp1[1]="Reza";
		emp1[2]="Daizy";
		
		for(int k=0; k<3; k++) {
			
			System.out.println(emp1[k]);
		}*/
		
		int i=2;
		
		while(i<=40){
			
			System.out.println(i);
			i=i+2;
		}
		
		System.out.println("_____________________________");
		
		int j=3;
		
		do {
			System.out.println(j);
			j=j+2;
		}while(j<=35);
		
		System.out.println("_____________________________");
		
		String[] SqaClass = {"Harun","Reza", "Daizy", "Touhid","Shipan","Sumaiya","xyz","abc","Mamun","ijk"};
		
		for(String eachSqaClass : SqaClass) {
			
			System.out.println(eachSqaClass);
			
		}
		
		System.out.println("_____________________________");
		
		int[] empId = new int[20];
		
		empId[0]=100;
		empId[1]=101;
		empId[2]=102;
		empId[3]=103;
		empId[4]=104;
		empId[5]=105;
		empId[6]=106;
		empId[7]=107;
		empId[8]=108;
		empId[9]=109;
		empId[10]=110;
		empId[11]=111;
		empId[12]=112;
		empId[13]=113;
		empId[14]=114;
		empId[15]=115;
		empId[16]=116;
		empId[17]=117;
		empId[18]=118;
		empId[19]=119;
		
		for(int eachEmpId : empId) {
			
			System.out.println(eachEmpId);
		}

		
		
		
		
	}
}