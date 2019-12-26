package Dao;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Controller.MainController;
import Service.DisplayMenu;
import VO.BookVO;
import VO.BookbasketVO;
import VO.UserVO;

public class PaymentDao {

public void payment(){
	

	String[] str = new String[10];
	int[] cash = new int[10];
	int sum= 0;
	int count = 0;
	BookDao bookdao = new BookDao();
	BookVO bookvo = new BookVO();
	UserDao ud = new UserDao();
	UserVO uv = new UserVO();
	DisplayMenu dpm = new DisplayMenu();
	int searchIdx = 0;
	BookBasketDao basket = new BookBasketDao();
	
	
	System.out.println(">> 장바구니에 있는 물품을 결제 하시겠습니까? \n결제하기(Y) 홈으로 돌아가기(N) ");
	
	Scanner s = new Scanner(System.in);
	String InPut = s.nextLine();
	
	
		
	
		if (InPut.equals("y")) {
			int i;
			for (i = 0; i < bookdao.BookList.size(); i++) {
				for (int j = 0; j < basket.BookbasketList.size(); j++) {
					if (bookdao.BookList.get(i).getName().equals(basket.BookbasketList.get(j).getName())) {
						str[j] = basket.BookbasketList.get(j).getName();
						cash[j] = bookdao.BookList.get(i).getPriceBook();
						
						sum += cash[j];
						
						count = bookdao.BookList.get(i).getCountOfbook();
						
						
					} else if (InPut.equals("n")) {
						dpm.defaultMenu();

					}

				}

			}
			System.out.println("고객님의 장바구니에  있는 도서는");
			System.out.print(Arrays.toString(str));
			System.out.println("\t" + "입니다.");
			System.out.println("총 금액은" + sum + "입니다");
			System.out.println("결제하기(Y) 홈으로 돌아가기(N)");

		}
   		
		
	
		
		
		InPut = s.nextLine();

		if (InPut.equals("y")) {
			while (true) {

				System.out
						.println("결제창입니다. \n카드번호 '-'를 포함하여 (xxxx-xxxx-xxxx-xxxx)형식으로 총 '19자리'를 입력해주세요.");

				String CardNum = s.nextLine();

				for (int i = 0; i < ud.userList.size(); i++) {
					if (CardNum.equals(ud.userList.get(i).getCardNum())) {
						searchIdx = i;

					}
				}

				if (CardNum.equals(ud.userList.get(searchIdx).getCardNum())) {
					System.out.println("결제가 정상 처리 되었습니다.");
					System.out.println("홈으로 이동합니다.");
					count--;

					dpm.defaultMenu();
					break;
				} else if (!CardNum.equals(ud.userList.get(searchIdx)
						.getCardNum())) {
					System.out.println("잘 못 입력하셨습니다. \n다시입력해주세요.");

				}

			}

		} else if (InPut.equals("n")) {
			dpm.defaultMenu();

		}
		
		
		
		
			
						
						
						
					
					
				
   			
   		 
	   			
   		 
		
   			
   		 
   		
		
		
		
		
	
	
	
}	
		
	}
	
	
	
	


