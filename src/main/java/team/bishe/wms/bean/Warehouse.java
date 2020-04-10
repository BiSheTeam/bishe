package team.bishe.wms.bean;

import lombok.Data;

import java.util.List;

@Data
public class Warehouse {
    //主键，仓库编号
    private String id;
    //仓库名称
    private String name;
    //仓库属性:不良品区 良品区，进货暂存区'
    private String attribute;
    //仓库条码
    private String code;
    //仓库类型:冷藏 低温 恒温 高温
    private String type;
    //仓库状态
    private String status;
    //仓库面积
    private String area;
    //仓库管理员id
    private String admin_id;
    //仓库管理员名字
    private String admin_nm;
    //仓库地址
    private String address;
    //仓位
    private List<Position> positions;

}
