package team.bishe.wms.bean;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {
    //主键id
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;

}
