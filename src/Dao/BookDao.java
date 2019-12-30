package Dao;

import VO.BookVO;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookDao {
    public static List<BookVO> BookList = new ArrayList<>();
    private BusinessDao businessDao = new BusinessDao();

    static {
        BookVO[] bookVOscience = new BookVO[5];
        BookVO[] bookVOessey = new BookVO[5];
        BookVO[] bookVOHistory = new BookVO[5];
        BookVO[] bookVOstudy = new BookVO[5];
        //--------------------------------------------------------과학
        BookVO bookVO1 = new BookVO();
        bookVO1.setAuthorName("칼세이건");
        bookVO1.setCategoryName("과학");
        bookVO1.setName("코스모스");
        bookVO1.setRegDate("2019-12-25");
        bookVO1.setPublishCompanyName("사이언스북스");
        bookVO1.setStock(10);
        bookVO1.setSalePoint(16500);
        bookVO1.setPrice(10000);
        BookVO bookVO2 = new BookVO();
        bookVO2.setAuthorName("옥스토비");
        bookVO2.setCategoryName("과학");
        bookVO2.setName("옥스토비의 일반화학");
        bookVO2.setRegDate("2019-12-19");
        bookVO2.setStock(10);
        bookVO2.setSalePoint(7500);
        bookVO2.setPrice(10000);
        bookVO2.setPublishCompanyName("사이플러스");
        BookVO bookVO3 = new BookVO();
        bookVO3.setAuthorName("맨큐");
        bookVO3.setCategoryName("과학");
        bookVO3.setName("맨큐의 경제학");
        bookVO3.setRegDate("2019-12-19");
        bookVO3.setPublishCompanyName("Cengage Learning");
        bookVO3.setSalePoint(3000);
        bookVO3.setPrice(10000);
        bookVO3.setStock(10);
        BookVO bookVO4 = new BookVO();
        bookVO4.setAuthorName("Jearl Walker, David Halliday, Robert Resnick");
        bookVO4.setCategoryName("과학");
        bookVO4.setName("일반물리학 제 1권");
        bookVO4.setRegDate("2019-12-19");
        bookVO4.setPublishCompanyName("법한서적");
        bookVO4.setStock(10);
        bookVO4.setPrice(10000);
        bookVO4.setSalePoint(5000);
        BookVO bookVO5 = new BookVO();
        bookVO5.setAuthorName("Jearl Walker, David Halliday, Robert Resnick");
        bookVO5.setCategoryName("과학");
        bookVO5.setName("일반물리학 제 2권");
        bookVO5.setRegDate("2019-12-19");
        bookVO5.setPublishCompanyName("법한서적");
        bookVO5.setStock(10);
        bookVO5.setPrice(10000);
        bookVO5.setSalePoint(6000);
        bookVOscience[0] = bookVO1;
        bookVOscience[1] = bookVO2;
        bookVOscience[2] = bookVO3;
        bookVOscience[3] = bookVO4;
        bookVOscience[4] = bookVO5;
        BookList.add(bookVOscience[0]);
        BookList.add(bookVOscience[1]);
        BookList.add(bookVOscience[2]);
        BookList.add(bookVOscience[3]);
        BookList.add(bookVOscience[4]);
        //--------------------------------------------------에세이
        BookVO bookVO6 = new BookVO();
        bookVO6.setAuthorName("놀");
        bookVO6.setCategoryName("에세이");
        bookVO6.setName("오늘도펭수 내일도펭수");
        bookVO6.setRegDate("2019-12-25");
        bookVO6.setPublishCompanyName("EBS");
        bookVO6.setStock(10);
        bookVO6.setPrice(10000);
        bookVO6.setSalePoint(15300);

        BookVO bookVO7 = new BookVO();
        bookVO7.setAuthorName("글배우");
        bookVO7.setCategoryName("에세이");
        bookVO7.setName("지쳤거나 좋아하는 게 없거나");
        bookVO7.setRegDate("2019-12-25");
        bookVO7.setPublishCompanyName("강한별");
        bookVO7.setStock(10);
        bookVO7.setPrice(10000);
        bookVO7.setSalePoint(12150);


        BookVO bookVO8 = new BookVO();
        bookVO8.setAuthorName("태희");
        bookVO8.setCategoryName("에세이");
        bookVO8.setName("마음의 결");
        bookVO8.setRegDate("2019-12-25");
        bookVO8.setPublishCompanyName("피어오름");
        bookVO8.setStock(10);
        bookVO8.setPrice(10000);
        bookVO8.setSalePoint(13800);

        BookVO bookVO9 = new BookVO();
        bookVO9.setAuthorName("김지훈");
        bookVO9.setCategoryName("에세이");
        bookVO9.setName("참 소중한 너라서");
        bookVO9.setRegDate("2019-12-25");
        bookVO9.setPublishCompanyName("진심의꽃한송이");
        bookVO9.setStock(10);
        bookVO9.setPrice(10000);
        bookVO9.setSalePoint(12000);

        BookVO bookVO10 = new BookVO();
        bookVO10.setAuthorName("김지훈");
        bookVO10.setCategoryName("에세이");
        bookVO10.setName("너라는 계절");
        bookVO10.setRegDate("2019-12-25");
        bookVO10.setPublishCompanyName("진심의꽃한송이");
        bookVO10.setStock(10);
        bookVO10.setPrice(10000);
        bookVO10.setSalePoint(12000);

        bookVOessey[0] = bookVO6;
        bookVOessey[1] = bookVO7;
        bookVOessey[2] = bookVO8;
        bookVOessey[3] = bookVO9;
        bookVOessey[4] = bookVO10;
        BookList.add(bookVOessey[0]);
        BookList.add(bookVOessey[1]);
        BookList.add(bookVOessey[2]);
        BookList.add(bookVOessey[3]);
        BookList.add(bookVOessey[4]);

        //-------------------------------------------------- 역사

        BookVO bookVO11 = new BookVO();
        bookVO11.setAuthorName("제레드다이아몬드");
        bookVO11.setCategoryName("역사");
        bookVO11.setName("총,균,쇠");
        bookVO11.setRegDate("2019-12-25");
        bookVO11.setPublishCompanyName("문학사상");
        bookVO11.setStock(10);
        bookVO11.setPrice(10000);
        bookVO11.setSalePoint(25000);

        BookVO bookVO12 = new BookVO();
        bookVO12.setAuthorName("설민석");
        bookVO12.setCategoryName("역사");
        bookVO12.setName("조선왕조실록");
        bookVO12.setRegDate("2019-12-25");
        bookVO12.setPublishCompanyName("강한별");
        bookVO12.setStock(10);
        bookVO12.setPrice(10000);
        bookVO12.setSalePoint(19800);


        BookVO bookVO13 = new BookVO();
        bookVO13.setAuthorName("류성룡");
        bookVO13.setCategoryName("역사");
        bookVO13.setName("징비록");
        bookVO13.setRegDate("2019-12-25");
        bookVO13.setPublishCompanyName("홍익출판사");
        bookVO13.setStock(10);
        bookVO13.setPrice(10000);
        bookVO13.setSalePoint(15000);

        BookVO bookVO14 = new BookVO();
        bookVO14.setAuthorName("톰필립스");
        bookVO14.setCategoryName("역사");
        bookVO14.setName("인간의 흑역사");
        bookVO14.setRegDate("2019-12-25");
        bookVO14.setPublishCompanyName("월북");
        bookVO14.setStock(10);
        bookVO14.setPrice(10000);
        bookVO14.setSalePoint(15000);

        BookVO bookVO15 = new BookVO();
        bookVO15.setAuthorName("에른스트 H.곰브리치 ");
        bookVO15.setCategoryName("역사");
        bookVO15.setName("곰브리치 세계사");
        bookVO15.setRegDate("2019-12-25");
        bookVO15.setPublishCompanyName("비룡소");
        bookVO15.setStock(10);
        bookVO15.setPrice(10000);
        bookVO15.setSalePoint(21000);

        bookVOHistory[0] = bookVO11;
        bookVOHistory[1] = bookVO12;
        bookVOHistory[2] = bookVO13;
        bookVOHistory[3] = bookVO14;
        bookVOHistory[4] = bookVO15;
        BookList.add(bookVOHistory[0]);
        BookList.add(bookVOHistory[1]);
        BookList.add(bookVOHistory[2]);
        BookList.add(bookVOHistory[3]);
        BookList.add(bookVOHistory[4]);

        //-------------------------------------------------- 수험서

        BookVO bookVO16 = new BookVO();
        bookVO16.setAuthorName("에듀윌상식연구소");
        bookVO16.setCategoryName("수험서");
        bookVO16.setName("시사상식");
        bookVO16.setRegDate("2019-12-25");
        bookVO16.setPublishCompanyName("에듀윌");
        bookVO16.setStock(10);
        bookVO16.setPrice(10000);
        bookVO16.setSalePoint(7850);

        BookVO bookVO17 = new BookVO();
        bookVO17.setAuthorName("박문각");
        bookVO17.setCategoryName("수험서");
        bookVO17.setName("최신시사상식200집");
        bookVO17.setRegDate("2019-12-25");
        bookVO17.setPublishCompanyName("박문각");
        bookVO17.setStock(10);
        bookVO17.setPrice(10000);
        bookVO17.setSalePoint(6700);


        BookVO bookVO18 = new BookVO();
        bookVO18.setAuthorName("김찬준");
        bookVO18.setCategoryName("수험서");
        bookVO18.setName("유튜버가 말하는 유튜버");
        bookVO18.setRegDate("2019-12-25");
        bookVO18.setPublishCompanyName("부키");
        bookVO18.setStock(10);
        bookVO18.setPrice(10000);
        bookVO18.setSalePoint(12500);

        BookVO bookVO19 = new BookVO();
        bookVO19.setAuthorName("이형");
        bookVO19.setCategoryName("수험서");
        bookVO19.setName("자소서 바이블");
        bookVO19.setRegDate("2019-12-25");
        bookVO19.setPublishCompanyName("얼라이브북스");
        bookVO19.setStock(10);
        bookVO19.setPrice(10000);
        bookVO19.setSalePoint(1234);

        BookVO bookVO20 = new BookVO();
        bookVO20.setAuthorName("김지희");
        bookVO20.setCategoryName("수험서");
        bookVO20.setName("취업논술의 모든 것");
        bookVO20.setRegDate("2019-12-25");
        bookVO20.setPublishCompanyName("크라운출판사");
        bookVO20.setStock(10);
        bookVO20.setPrice(10000);
        bookVO20.setSalePoint(1567);

        bookVOstudy[0] = bookVO16;
        bookVOstudy[1] = bookVO17;
        bookVOstudy[2] = bookVO18;
        bookVOstudy[3] = bookVO19;
        bookVOstudy[4] = bookVO20;
        BookList.add(bookVOstudy[0]);
        BookList.add(bookVOstudy[1]);
        BookList.add(bookVOstudy[2]);
        BookList.add(bookVOstudy[3]);
        BookList.add(bookVOstudy[4]);
    }


    public void registBook() {
        String name;
        String categoryName;
        String publishCompanyName;
        String authorName;
        int stock;
        Scanner scanner = new Scanner(System.in);
        System.out.print("책이름 입력: ");
        name = scanner.nextLine();
        System.out.print("카테고리 입력: ");
        categoryName = scanner.nextLine();
        System.out.print("출판사 이름:");
        publishCompanyName = scanner.nextLine();
        System.out.print("저자 이름 :");
        authorName = scanner.nextLine();
        System.out.print("등록할 책의갯수");
        stock = Integer.parseInt(scanner.nextLine());
        BookVO bookVO = new BookVO();
        bookVO.setName(name);
        bookVO.setCategoryName(categoryName);
        bookVO.setPublishCompanyName(publishCompanyName);
        bookVO.setAuthorName(authorName);
        bookVO.setStock(stock);
      /*
      책을 등록할 경우 둥록했던 출판사 에외의 

      BusinessVO businessVO=new BusinessVO();
        businessVO.setBookName(name);
        businessVO.setQuantity(stock);
        businessVO.*/
        BookList.add(bookVO);

    }

    public void searchBook() {

        Scanner s = new Scanner(System.in);
        System.out.println("검색어를 입력해주세요>");
        String userSearch = s.nextLine();

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        int noSearch = 0;

        System.out.print("\"" + userSearch + "\"" + "으로 ");
        System.out.println("검색하신 결과입니다.");
        System.out.println("==============================================");

        for (int i = 0; i < BookList.size(); i++) {
            b1 = BookList.get(i).getCategoryName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            b2 = BookList.get(i).getName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            b3 = BookList.get(i).getAuthorName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            b4 = BookList.get(i).getPublishCompanyName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());

            if (b1 == true || b2 == true || b3 == true || b4 == true) {
                System.out.println("카테고리 : " + BookList.get(i).getCategoryName());
                System.out.println("책이름 : " + BookList.get(i).getName());
                System.out.println("작가 : " + BookList.get(i).getAuthorName());
                System.out.println("출판일 : " + BookList.get(i).getRegDate());
                System.out.println("출판사 : " + BookList.get(i).getPublishCompanyName());
                System.out.println("재고 : " + BookList.get(i).getStock());
                System.out.println("==============================================");
            } else if (b1 != true && b2 != true && b3 != true) {
                noSearch++;
            }
        }//for문 종료

        if (noSearch == BookList.size()) {
            System.out.println("검색하신 도서가 없습니다.");
            System.out.println("==============================================");
        }
    }

    public StringBuilder usingSearchForBookShoppingBasket() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner s = new Scanner(System.in);
        System.out.println("검색어를 입력해주세요>");
        String userSearch = s.nextLine();
        int count = 0;
        boolean b2 = false;
        int noSearch = 0;

        System.out.print("\"" + userSearch + "\"" + "으로 ");
        System.out.println("검색하신 결과입니다.");
        System.out.println("==============================================");

        for (int i = 0; i < BookList.size(); i++) {
            b2 = BookList.get(i).getName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
            if (b2 == true) {
                System.out.println("카테고리 : " + BookList.get(i).getCategoryName());
                System.out.println("책이름 : " + BookList.get(i).getName());
                System.out.println("작가 : " + BookList.get(i).getAuthorName());
                System.out.println("출판일 : " + BookList.get(i).getRegDate());
                System.out.println("출판사 : " + BookList.get(i).getPublishCompanyName());
                System.out.println("재고 : " + BookList.get(i).getStock());
                System.out.println("==============================================");
                stringBuilder.append(BookList.get(i).getName());
            } else if (b2 != true) {
                noSearch++;

            }
        }//for문 종료

        if (noSearch == BookList.size()) {
            System.out.println("검색하신 도서가 없습니다.");
            System.out.println("==============================================");
            return null;
        }
        return stringBuilder;
    }

    public void adminSearchBuyBook() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("재고 관리를 위한 검색을 시작합니다.");
        System.out.print("책이름을 입력해주세요");
        name = scanner.nextLine();
        if (LoginDao.loginSessionVO.getRoll().equals("admin")) {
            //System.out.println("관리자용 구매 페이지");
            int searchIdx = -1;
            for (int i = 0; i < BookDao.BookList.size(); i++) {
                if (BookDao.BookList.get(i).getName().equals(name)) {
                    searchIdx = i;
                }
                if (searchIdx == -1) {
                    System.out.println("해당도서는 우리 서점에 없습니다. 이 도서를 등록할까요");
                    registBook();
                }
                System.out.println(BookDao.BookList.get(searchIdx).getName());
                System.out.println(BookDao.BookList.get(searchIdx).getPublishCompanyName());
                if (BookDao.BookList.get(searchIdx).getStock() == 0) {
                    int bookInsert;
                    System.out.println("해당 출판사의 도서를 몇권을 더 주문할까요?");
                    bookInsert = Integer.parseInt(scanner.nextLine());
                    Date today = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String regDate = simpleDateFormat.format(today);
                    businessDao.addTrade(name, BookDao.BookList.get(searchIdx).getPublishCompanyName(), bookInsert, regDate);
                    System.out.println("알겠습니다. 도서를 주문하였습니다. 해당 출판사에 주문을 요청하였습니다.");
                }
            }
        }
    }

    public void showBestSeller() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookVO> bestSellerList = new ArrayList<>();

        
        
        String catergoryName;

    	System.out.println(BookList.get(0).getCategoryName()+"\t");
        for(int i = 0 ; i< BookList.size()-1;i++) {
        	if(BookList.get(i).getCategoryName() != BookList.get(i+1).getCategoryName()) {
        	System.out.println(BookList.get(i+1).getCategoryName()+"\t");
        	}
        }

        
        System.out.print("카테고리를 입력해주세요: ");

        catergoryName = scanner.nextLine();
        for (int i = 0; i < BookList.size(); i++) {
            if (BookList.get(i).getCategoryName().equals(catergoryName)) {
                 Collections.sort(BookList);
            }
        }

        for (int i = 0; i < BookList.size(); i++) {
            if (BookList.get(i).getCategoryName().equals(catergoryName)) {
            	System.out.println("==============================================");
                System.out.println("카테고리 : " + BookList.get(i).getCategoryName());
                System.out.println("책이름 : " + BookList.get(i).getName());
                System.out.println("작가 : " + BookList.get(i).getAuthorName());
                System.out.println("판매량 : " + BookList.get(i).getSalePoint());
            }
        }System.out.println("==============================================");
    }


}


