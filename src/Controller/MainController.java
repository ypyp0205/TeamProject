package Controller;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import Dao.BookDao;
import Dao.PaymentDao;
import Dao.UserDao;

import Service.DisplayMenu;
import VO.BookVO;
import VO.UserVO;

public class MainController {

    public static void main(String[] args) {
    	DisplayMenu disPlayMenu=new DisplayMenu();
        disPlayMenu.defaultMenu();
        for (BookVO temp :BookDao.BookList) {
            System.out.println(temp.getName()+" "+ temp.getCountOfbook());
        }
        for(UserVO temp: UserDao.userList){
            System.out.println(temp.getId());
        }


    
    	
    /*	UserDao ud = new UserDao();
    	
    	System.out.println(ud.userList.get(1).getCardNum());
    	
    	BookDao bookdao = new BookDao();
    	
    	System.out.println(bookdao.BookList.get(0).getPriceBook());
    	*/
    
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
