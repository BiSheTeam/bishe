package team.bishe.wms.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Tray {
    //主键，托盘ID
    private String id;
    //托盘编号
    private String num;
    //所属仓位名称
    private String posName;
    //所属仓位ID
    private String posId;
    //托盘状态
    private String status;
    //RFID编号
    private String rfid;

    @Setter
    @Getter
    private static int COUNT;
    @Setter
    @Getter
    private static boolean UPDATED = true;
}

