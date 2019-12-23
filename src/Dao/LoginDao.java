package Dao;

import VO.LoginSessionVO;
import VO.UserVO;

import java.util.Scanner;

public class LoginDao {
    public static LoginSessionVO loginSessionVO=new LoginSessionVO();
    public void login (){
        String id;
        String password;
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.print("아이디를 입력해주세요");
            id = scanner.nextLine();
            System.out.print("비밀번호를 입력해주세요");
            password = scanner.nextLine();
            UserVO vo = new UserVO();
            vo.setId(id);
            vo.setPassword(password);
            boolean isLogin = loginCheck(vo);
            if(isLogin)
                break;
        }
    }
    public boolean loginCheck(UserVO vo) {
        for(int i=0;i<UserDao.userList.size();i++){
            if(UserDao.userList.get(i).getId().equals(vo.getId())){
                if(UserDao.userList.get(i).getPassword().equals(vo.getPassword())) {
                    if (UserDao.userList.get(i).getRoll().equals("user")) {
                        LoginDao.loginSessionVO.setId(vo.getId());
                        LoginDao.loginSessionVO.setId(vo.getRoll());
                        return true;
                    } else if (UserDao.userList.get(i).getRoll().equals("admin")) {
                        loginSessionVO.setId((UserDao.userList.get(i).getId()));
                        return true;
                    }
                }
                else{
                    System.out.println("비밀번호 오류 입니다. 로그인을 다시 한번 시도 해주세요");
                    return false;
                }
            }
        }
        return false;
    }
}
