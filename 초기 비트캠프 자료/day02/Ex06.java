class Ex06{
 public static void main(String[] args){
	int su1;
	su1 = 100;
	System.out.println(su1);
	//su1 = su1 + 1;
	//su1 += 1;
	//++su1;
	System.out.println(++su1);
	System.out.println(su1);
	System.out.println("------------------------------------");
	// su = 1;
	// su = su+++su+++su+su++;
	byte su2;
	su2 = 126;
	//su2 = su2 + 1; 오류
	su2++; //비트 단위로 증가 -> ++시 해당 자료형으로 증가시켜줌
	System.out.println(su2);
	
	su2++; //-128
	System.out.println(su2);
	
	System.out.println("------------------------------------");
	int su3;
	su3 = 2;
	//su3++;
	//su3 = su3 * 3;
	//su3 *= 3;
	su3 *= 3;
	System.out.println(su3);
	System.out.println("------------------------------------");
	System.out.println(!(true));
	System.out.println(!(false));
 }
}