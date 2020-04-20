package team.bishe.wms.bean;

import lombok.Data;

/**
 * 仓管员信息类
 */
@Data
public class RepositoryAdmin {
    private Integer id;     //仓管员id
    private String name;    //仓管员名字
    private String sex;     //仓管员性别
    private String tel;     //仓管员电话
    private String address;     //仓管员地址
    private Integer repositoryBelongId;     //仓管员负责仓库id
}
