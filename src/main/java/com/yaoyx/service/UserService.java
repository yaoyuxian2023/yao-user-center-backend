package com.yaoyx.service;

import com.yaoyx.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户服务
 *
 * @author Augus
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-03-15 16:49:06
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser 未脱敏的用户信息
     * @return 脱敏后的用户信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request 用户登录态请求
     * @return 用户注销的状态码
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签查询用户
     *
     * @param tagsNameList 用户想要拥有的标签
     * @return
     */
    List<User> searchUsersByTags(List<String> tagsNameList);
}
