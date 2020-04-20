package team.bishe.wms.bean;

import lombok.Data;

/**
 * 仓库信息类
 */
@Data
public class Repository {
    private Integer id;         //仓库id
    private String address;     //仓库地址
    private String status;      //仓库状态
    private String area;        //仓库面积
    private String desc;        //仓库描述
    private Integer adminId;    //仓库管理员id
    private String adminName;   //仓管员名字
}
