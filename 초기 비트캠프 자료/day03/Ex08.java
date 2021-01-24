class Ex08{
 public static void main(String[] args){
	String table = "------------------------------------";
	int ea1 = 1 ;
	int ea2 = 2;
	int ea3 = 3;
	int ea4 = 1;

	System.out.println("비트편의점\n--------------");
	System.out.println(table);
	System.out.println(" ");
	System.out.println(table);
	System.out.println("제품명\tㅣ단가\tㅣ수량\tㅣ계");
	System.out.println("생수\t  900\t   "+ea1+"     "+(900*1));
	System.out.println("쌀과자\t  2300\t   "+ea2 +"    "+(2300*2));
	System.out.println("껌\t  500\t   "+ ea3 + "\t"+(500*3));
	System.out.println("커피\t  1200\t   "+ ea4 + "\t"+(1200*1));
	System.out.println(table);
	System.out.println("\t\t합계 : "+(900*ea1 + 2300*ea2 + 500*ea3 + 1200*ea4) +"원" );
	System.out.println(table);
 }	
}