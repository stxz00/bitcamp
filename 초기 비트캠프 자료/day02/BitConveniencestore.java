class BitConveniencestore{
 public static void main(String[] args){
	String storeName = "비트편의점";
	System.out.println(storeName);
	String seperated = "-----------------------------";
	System.out.println(seperated);
	System.out.println(seperated);
	String productName = "제품명    ";
	System.out.print(productName);
	String unitPrice = "단가 ";
	System.out.print(unitPrice);
	String quantity =  "수량   ";
	System.out.print(quantity);
	String sum = "계";
	System.out.println(sum);
	System.out.println(seperated);

	String product = "초코바    "   ;
	System.out.print(product);
	int productUnitPrice = 1500;
	System.out.print(productUnitPrice);
	System.out.print("  ");
	int productQuantity = 2;
	System.out.print(productQuantity);
	System.out.print("     ");
	int productSum = productUnitPrice * productQuantity;
	System.out.println(productSum);
	
	int totalSum=0;
	totalSum += productSum;
	
	product = "감귤      "   ;
	System.out.print(product);
	productUnitPrice = 3000;
	System.out.print(productUnitPrice);
	System.out.print("  ");
	productQuantity = 1;
	System.out.print(productQuantity);
	System.out.print("     ");
	productSum = productUnitPrice * productQuantity;
	System.out.println(productSum);

	totalSum += productSum;

	product = "사이다    "   ;
	System.out.print(product);
	productUnitPrice = 2000;
	System.out.print(productUnitPrice);
	System.out.print("  ");
	productQuantity = 4;
	System.out.print(productQuantity);
	System.out.print("     ");
	productSum = productUnitPrice * productQuantity;
	System.out.println(productSum);

	totalSum += productSum;

	product = "돌체라떼  "   ;
	System.out.print(product);
	productUnitPrice = 4000;
	System.out.print(productUnitPrice);
	System.out.print("  ");
	productQuantity = 1;
	System.out.print(productQuantity);
	System.out.print("     ");
	productSum = productUnitPrice * productQuantity;
	System.out.println(productSum);
	System.out.println(seperated);
	System.out.println(seperated);
	System.out.print("         합계 : ");

	totalSum += productSum;
	
	
	System.out.print(totalSum + "원");
	
 }
}