package com.yaoyx.model.domain.request;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户注册请求体
 *
 * @author Augus
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;
}
