package Dao;

import VO.UserVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao {
public static List<UserVO> userList=new ArrayList<>();
    static {
        UserVO admin=new UserVO();
        admin.setId("admin");
        admin.setPassword("admin");
        admin.setRoll("admin");
        userList.add(admin);

    }

    public void insertUser(UserVO vo) {
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getId().equals(vo.getId())){
                System.out.println("이미 가입된 계정입니다.");
                break;
            }
            else{
            }
        }
    }

    public void login() {
    }

}
