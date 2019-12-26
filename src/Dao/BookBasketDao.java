package Dao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Service.DisplayMenu;
import VO.BookVO;
import VO.BookbasketVO;
import VO.UserVO;

public class BookBasketDao {
	public static List<BookbasketVO> BookbasketList = new ArrayList<>();
	PaymentDao dao = new PaymentDao();
    
	
	public static void BookBasket() {
		System.out.println("----------------------장바구니---------------------------");
		Scanner s = new Scanner(System.in);
    	System.out.println("도서검색어를 입력해주세요 ex 도서이름, 저자, 출판사>");
    	String userSearch = s.nextLine();
    	boolean b1 = false;    
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        String yn;
        BookbasketVO bookbasketVO = new  BookbasketVO();
        PaymentDao dao = new PaymentDao();
        
        
        
        
        
    	for(int i = 0; i < BookDao.BookList.size(); i++){
            b1 = BookDao.BookList.get(i).getCategoryName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());  
            b2 = BookDao.BookList.get(i).getName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            b3 = BookDao.BookList.get(i).getAuthorName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            b4 = BookDao.BookList.get(i).getPublishCompanyName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            
            if(b1 == true || b2 == true || b3 == true || b4 == true){
            	
            	System.out.println("카테고리 : " +  BookDao.BookList.get(i).getCategoryName());
            	System.out.println("책이름 : " +  BookDao.BookList.get(i).getName());
            	System.out.println("작가 : " +  BookDao.BookList.get(i).getAuthorName());
            	System.out.println("출판일 : " +  BookDao.BookList.get(i).getRegDate());
            	System.out.println("출판사 : " +  BookDao.BookList.get(i).getPublishCompanyName());
            	System.out.println("재고 : " +  BookDao.BookList.get(i).getCountOfbook());
            	String getName = BookDao.BookList.get(i).getName();
            	System.out.println("==============================================");
            	System.out.println("장바구니에 추가 하시겠습니까.");
                yn = s.nextLine();            
            	if(yn.equals("Y")){
            		BookBasketDao.BookBasket(getName);
            		bookbasketVO.setName(getName);           	
            		BookbasketList.add(bookbasketVO);
            		
            		System.out.println("원하시는 내용을 입력해주세요");
        			System.out.println("1.장바구니 목록 확인");
        			System.out.println("2.결제하기");
        			System.out.println("3.장바구니 삭제하기");
        			System.out.println("4.검색화면으로 돌아가기");
        			s = new Scanner(System.in);
        			userSearch = s.nextLine();
        			if(userSearch.equals("1")){
        				BookBasketList();
        			}else if(userSearch.equals("2")){
        				dao.payment();
        			}else if(userSearch.equals("3")){
        				BookBasketout();
        			}else{
        				BookDao.searchBook();
        			}
            	
            	
               }else if(b1 != true && b2 != true && b3 != true){
            	System.out.println("검색하신 도서가 없습니다.");
               	System.out.println("==============================================");
            	BookDao.searchBook();
               }

            }
    	}
         
	}
	
	public static void BookBasket(String BookName) {
		System.out.println("----------------------장바구니---------------------------");
		BookbasketVO bookbasketVO=new  BookbasketVO();
		bookbasketVO.setName(BookName);
		System.out.println(BookbasketList.size());
		BookbasketList.add(bookbasketVO);
		System.out.println(BookbasketList.size());
		System.out.println("원하시는 내용을 입력해주세요");
		System.out.println("1.장바구니 목록 확인");
		System.out.println("2.결제하기");
		System.out.println("3.장바구니 삭제하기");
		System.out.println("4.검색화면으로 돌아가기");
		Scanner s = new Scanner(System.in);
		String userSearch = s.nextLine();
		
		PaymentDao dao = new PaymentDao();
        
		
		if(userSearch.equals("1")){
			BookBasketList();
		}else if(userSearch.equals("2")){
			dao.payment();
		}else if(userSearch.equals("3")){
			BookBasketout();
		}else{
			BookDao.searchBook();
		}
		
		
	}


	public static void BookBasketout() {
		System.out.println("---------------------장바구니 목록확인");
		for (BookbasketVO BookbasketVO : BookbasketList ) {
			System.out.println(BookbasketVO.getName()); 
		}
		System.out.println("삭제하고 싶은 책 이름을 입력해주세요");
		Scanner s = new Scanner(System.in);
		String userSearch = s.nextLine();
		for(int i = 0; i < BookbasketList.size(); i++){
			if(userSearch.equals(BookbasketList.get(i).getName())){				
				BookbasketList.remove(i);
			}
		}
		
		BookBasketList();
	}

	public static void BookBasketpay() {
		//결제
		
	}

	public static void BookBasketList() {
		
		PaymentDao dao = new PaymentDao();
    
		for (BookbasketVO BookbasketVO : BookbasketList ) {
			System.out.println("===================================================");
			System.out.println(BookbasketVO.getName());
			System.out.println("===================================================");
			
		}
		System.out.println("원하시는 내용을 입력해주세요");
		System.out.println("1.장바구니 목록 확인");
		System.out.println("2.결제하기");
		System.out.println("3.장바구니 삭제하기");
		System.out.println("4.검색화면으로 돌아가기");
		Scanner s = new Scanner(System.in);
		String userSearch = s.nextLine();
		
		
		
		if(userSearch.equals("1")){
			BookBasketList();
		}else if(userSearch.equals("2")){
			dao.payment();
		}else if(userSearch.equals("3")){
			BookBasketout();
		}else{
			BookDao.searchBook();
		}
	}

}
