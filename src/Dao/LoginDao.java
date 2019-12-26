package Dao;

import VO.LoginSessionVO;
import VO.UserVO;

import java.util.Scanner;

public class LoginDao {
    public static LoginSessionVO loginSessionVO;
    public void login (){
        String id;
        String password;
        Scanner scanner=new Scanner(System.in);


            System.out.print("아이디를 입력해주세요");
            id = scanner.nextLine();
            System.out.print("비밀번호를 입력해주세요");
            password = scanner.nextLine();
            UserVO vo = new UserVO();
            vo.setId(id);
            vo.setPassword(password);
            boolean isLogin = loginCheck(vo);

    }
    public boolean loginCheck(UserVO vo) {
        while (true) {
            for (int i = 0; i < UserDao.userList.size(); i++) {
                if (UserDao.userList.get(i).getId().equals(vo.getId())) {
                    if (UserDao.userList.get(i).getPassword().equals(vo.getPassword())) {
                        if (UserDao.userList.get(i).getRoll().equals("user")) {
                            loginSessionVO = new LoginSessionVO();
                            loginSessionVO.setId(vo.getId());
                            loginSessionVO.setRoll("user");
                            return true;
                        } else if (UserDao.userList.get(i).getRoll().equals("admin")) {
                            loginSessionVO = new LoginSessionVO();
                            loginSessionVO.setId(vo.getId());
                            loginSessionVO.setRoll("admin");
                            return true;
                        }
                    } else {
                        System.out.println("비밀번호 오류 입니다. 로그인을 다시 한번 시도 해주세요");
                        return false;
                    }
                }
            }
        }
    }
}
