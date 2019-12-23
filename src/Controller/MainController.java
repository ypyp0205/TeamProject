package Controller;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import Dao.BookDao;
import Dao.UserDao;
import Service.DisPlayMenu;
import VO.BookVO;
import VO.UserVO;

public class MainController {

    public static void main(String[] args) {
    	
    	BookDao dao = new BookDao();
    	BookVO vo = new BookVO();
    
    	
    	for (int i = 0; i < dao.BookList.size();  i++) {
    		
    		
    		if(vo.getName().equals("자바의 정석")){
			System.out.println("123");
    		}
		}
    	
    	
    	
    	
    	
        DisPlayMenu disPlayMenu=new DisPlayMenu();
        disPlayMenu.defaultMenu();
        for (BookVO temp :BookDao.BookList) {
            System.out.println(temp.getName()+" "+ temp.getCountOfbook());
        }
        for(UserVO temp: UserDao.userList){
            System.out.println(temp.getId());
        }


    }
}
