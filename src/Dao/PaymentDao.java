package Dao;


import Service.BookShoppingBasketServiceImpl;
import VO.PayVO;
import VO.PaymentVO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class PaymentDao {
    UserDao userDao = new UserDao();
    public static List<PayVO> payList = new ArrayList<>();


    public void pay() {

        BookDao bookDao = new BookDao();
        Scanner s = new Scanner(System.in);

        int point = 0;
        int price = 0;
        String bnm = "";


        if(BookShoppingBasketDao.bookShoppingBasket.size() == 0) {
            System.out.println("장바구니가 비었습니다.");
        }


        if(BookShoppingBasketDao.bookShoppingBasket.size() != 0) {  //장바구니에 들어있을때 결제 진행


            for(int j = 0; j < BookShoppingBasketDao.bookShoppingBasket.size();j++) {
                PayVO pay = new PayVO();
                pay.setPayBookName(BookShoppingBasketDao.bookShoppingBasket.get(j).getBookName()); //책이름등록
                bnm = BookShoppingBasketDao.bookShoppingBasket.get(j).getBookName();
                pay.setPayBookQuantity(BookShoppingBasketDao.bookShoppingBasket.get(j).getAmount());  //수량등록

                //결제 날짜
                Date today = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                pay.setRegDate(sdf.format(today));
                
                //결제금액 등록
                for(int i = 0; i <= BookDao.BookList.size();i++) {
                    if(BookDao.BookList.get(i).getName().equals(bnm)) {
                        pay.setPayPrice(BookDao.BookList.get(i).getPrice()*BookShoppingBasketDao.bookShoppingBasket.get(j).getAmount()-point);
                        price += BookDao.BookList.get(i).getPrice()*BookShoppingBasketDao.bookShoppingBasket.get(j).getAmount();
                        BookDao.BookList.get(i).setStock(BookDao.BookList.get(i).getStock()-BookShoppingBasketDao.bookShoppingBasket.get(j).getAmount()); //재고 빼기
                        BookDao.BookList.get(i).setSalePoint(BookDao.BookList.get(i).getSalePoint()+BookShoppingBasketDao.bookShoppingBasket.get(j).getAmount());
                        break;

                    }
                }

                //로그인한 유저 정보 등록
                pay.setPayUserId(LoginDao.loginSessionVO.getId());
                for (int k = 0; k < userDao.userList.size(); k++) {
                    if(LoginDao.loginSessionVO.getId().equals(userDao.userList.get(k).getId())) {
                        if(userDao.userList.get(k).getPoint() != 0) {

                            do {
                                System.out.println("보유중인 포인트 : " + userDao.userList.get(k).getPoint());
                                System.out.println("포인트를 얼마 사용하시겠습니까?");
                                point = Integer.parseInt(s.nextLine());

                                if(point > userDao.userList.get(k).getPoint()) {
                                    System.out.println("보유하신 포인트가 부족합니다");
                                }else if(point > price) {
                                	System.out.println("사용하신 포인트보다 결제금액이 작습니다.");
                                }
                            }while(point > userDao.userList.get(k).getPoint() || point > price);


                            userDao.userList.get(k).setPoint(userDao.userList.get(k).getPoint()-point);
                        }
                        pay.setPayUserAdd(userDao.userList.get(k).getAddress());
                        pay.setPayUserPhonNum(userDao.userList.get(k).getPhonNumber());
                    }
                }


                System.out.print("배송시 요청 사항 : ");
                String comments = "";
                comments = s.nextLine();
                pay.setPayComments(comments);

                payList.add(pay);

            }


            int addPoint = 0;
            for (int k = 0; k < userDao.userList.size(); k++) {
                if(LoginDao.loginSessionVO.getId().equals(userDao.userList.get(k).getId())) {
                    addPoint = (int)((price-point)*0.01);
                    userDao.userList.get(k).setPoint(userDao.userList.get(k).getPoint()+addPoint);
                }
            }

            System.out.println("==============================================================================");
            System.out.println("주문 금액 :  " + price + "원");
            System.out.println("사용포인트 : -" + point + "포인트 ");
            System.out.println("총 결제 금액은 " + (price-point) + "원 입니다.");

            System.out.println("결제 하시겠습니까?(y/n)");
            String payInput="";
            payInput = s.nextLine();

            if(payInput.equals("n")) {
                BookShoppingBasketServiceImpl bsbs = new BookShoppingBasketServiceImpl();
                bsbs.bookShoppingBasketMenu();
            }


            System.out.println("==============================================================================");
            System.out.println("구매 완료되었습니다.");
            System.out.println(addPoint + "포인트 적립되었습니다.");



            for(int i = 0; i <= BookShoppingBasketDao.bookShoppingBasket.size();i++) {
                BookShoppingBasketDao.bookShoppingBasket.remove(0);  //결제 들어가면 장바구니 비우기
            }



        }

    }


    public void payList() {  //결제 내역

        int price = 0;

        for (int i = 0; i < payList.size(); i++) {
            if (LoginDao.loginSessionVO.getId().equals(payList.get(i).getPayUserId())) {
                System.out.println("==========================================");
                System.out.println("결제일 : " + payList.get(i).getRegDate());
                System.out.println("아이디 : " + payList.get(i).getPayUserId());
                System.out.println("배송지 : " + payList.get(i).getPayUserAdd());
                System.out.println("연락처 : " + payList.get(i).getPayUserPhonNum());
                System.out.println("책 제목 : " + payList.get(i).getPayBookName());
                System.out.println("수량 : " + payList.get(i).getPayBookQuantity());
                System.out.println("결제금액 : " + payList.get(i).getPayPrice());
                System.out.println("배송시 요청사항 : "+ payList.get(i).getPayComments());

                price += payList.get(i).getPayPrice();

            }
        }System.out.println("==========================================");
        System.out.println("총 결제 금액 : "+price);
    }

}
