package team.bishe.wms.bean;

import lombok.Data;

/**
 * 客户信息类
 */
@Data
public class Customer {
    private Integer id;     //客户id
    private String name;        //客户名
    private String telephone;       //联系电话
    private String email;       //客户邮箱
    private String address;     //地址

}
