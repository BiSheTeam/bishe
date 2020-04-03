package team.bishe.wms.bean;

import lombok.Data;

@Data
public class User {
//主键
    private Long id;
//用户名
    private String username;
//密码
    private String password;
//名字
    private String name;
}
