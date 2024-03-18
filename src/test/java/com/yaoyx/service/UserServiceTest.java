package com.yaoyx.service;
import java.time.LocalDateTime;

import com.yaoyx.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * @author yao
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;;

  @Test
  void testAddUser() {

        User user = new User();
        user.setUsername("catYao");
        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
        user.setUserAccount("123");
        user.setGender(1);
        user.setUserPassword("123456");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

  @Test
  void userRegister() {
      String userAccount = "yaoyx";
      String userPassword = "";
      String checkPassword = "123456";
      String planetCode = "21011";
      long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);

      userAccount = "yao";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);

      userAccount = "yaoyx";
      userPassword = "123456";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);

      userAccount = "yao yx";
      userPassword = "12345678";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);
      checkPassword = "123456789";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);

      userAccount = "catyao";
      checkPassword = "12345678";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
      Assertions.assertEquals(-1, result);

      userAccount = "yaoyx";
      result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//      Assertions.assertTrue(result > 0);
      Assertions.assertEquals(-1, result);


  }
}
