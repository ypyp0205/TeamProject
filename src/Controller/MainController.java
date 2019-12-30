package Controller;

import Dao.BookDao;
import Dao.BookShoppingBasketDao;
import Service.DisplayMenu;
import VO.BookVO;

import java.util.Arrays;
import java.util.List;

public class MainController {

    public static void main(String[] args) {
       DisplayMenu disPlayMenu = new DisplayMenu();
        disPlayMenu.defaultMenu();

//        BookShoppingBasketDao bookShoppingBasketDao=new BookShoppingBasketDao();
  //      bookShoppingBasketDao.bookShoppingBasketMenu();
    //
        //      bookShoppingBasketDao.bookBasketList();
       /* List<BookVO> list= BookDao.BookList;
        BookVO vo =new BookVO();
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getSalePoint()<list.get(j).getSalePoint()){
                    int temp =list.get(j).getSalePoint();
                    list.get(j).setSalePoint(list.get(i).getSalePoint());
                    list.get(i).setSalePoint(temp);
                }
            }
        }
        for (BookVO temp:list) {
            System.out.println(temp.getSalePoint());
        }
*/

    }
}
