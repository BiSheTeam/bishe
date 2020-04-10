package team.bishe.wms.bean;

import lombok.Data;

import java.util.List;

@Data
public class Position {
    //主键，仓位编号
    private String id;
    //仓位代码
    private String num;
    //仓位名称
    private String name;
    //仓位状态
    private String status;
    //托盘
    private List<Tray> trays;
}

