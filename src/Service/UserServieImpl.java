package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.UserDao;
import VO.UserVO;

public class UserServieImpl implements  UserService {

	UserDao ud = new UserDao();
	
	
    @Override
    public void addUser() {
    	//회원가입
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("아이디 : ");
    	String id = s.nextLine();
    	System.out.println("비밀번호 : ");
    	String password = s.nextLine();
    	System.out.println("이름 : ");
    	String name = s.nextLine();
    	System.out.println("주소 : ");
    	String address = s.nextLine();
    	System.out.println("전화번호 : ");
    	String phonNumber = s.nextLine();
    	
    	UserVO user = new UserVO(); //user 객체 생성해서 VO에 등록
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		user.setAddress(address);;
		user.setPhonNumber(phonNumber);
		user.setPoint(2000);
        user.setRoll("user");
		
		ud.insertUser(user);

    }

    @Override
    public void deleteUser() {
    	//회원삭제  remove()
    	Scanner s = new Scanner(System.in);
    	System.out.println("삭제할 아이디 : ");
    	String deleteId = s.nextLine();

		ud.userDelete(deleteId);


    }

	@Override
	public void ListUser() {
		ud.userList();
	}

	@Override
	public void myPage() {
		ud.myPage();
		
	}
}
