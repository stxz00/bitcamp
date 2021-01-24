
import java.util.Scanner;
import java.util.ArrayList;

class MyExercise{



String product;
int productPrice = -1;
int productQuantity = -1;	
int sum = 0;
int productSum = 0;







 public static void main(String[] args){	

	Scanner scanner = new Scanner(System.in);
	
	ArrayList<MyExercise> a = new ArrayList<>();

	
	
	boolean selectProduct = false;
	int totalSum = 0;
	while(true){
		System.out.println("1. 상품 선택, 2. 계산 및 영수증 출력, 3. 나가기");
		int selectNumber = scanner.nextInt();
		if(selectNumber  == 3){
				System.out.println("편의점에서 나갑니다");
				break;
		} else if(selectNumber == 2){
				if(selectProduct == false){
					System.out.println("상품을 고르지 않았습니다.");
					
				}else{

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
					for(MyExercise sd : a){
					System.out.println(sd.product + "       " + sd.productPrice + "  " + sd.productQuantity + "     " + sd.productSum);
					}
					System.out.println(seperated);
					System.out.println(seperated);
					System.out.print("         합계 : ");
					System.out.println(totalSum + "원");
				}
		}else if(selectNumber ==1){
			MyExercise m = new MyExercise();
			scanner.nextLine();
			System.out.print("상품명을 입력하세요 : ");
			m.product = scanner.nextLine();
			System.out.print("상품 단가를 입력하세요 : ");
			m.productPrice = scanner.nextInt();
			System.out.print("구입할 상품 갯수를 입력하세요 : ");
			m.productQuantity = scanner.nextInt();
			m.productSum = m.productPrice * m.productQuantity;
			totalSum += m.productSum; 
			a.add(m);
			selectProduct = true;
		}
				
				
		}
	
	

	scanner.close();
 }
}