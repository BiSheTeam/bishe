package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Tray;
import team.bishe.wms.mapper.TrayMapper;
import team.bishe.wms.service.TrayService;
import team.bishe.wms.util.MyPageUtil;

import java.util.List;

@Service("trayservice")
public class TrayServiceImpl implements TrayService {
    @Autowired
    TrayMapper trayMapper;
    @Override
    public List<Tray> queryTrayList() {
        return trayMapper.queryTrayList();
    }

    @Override
    public Tray queryById(String id) {
        return trayMapper.queryById(id);
    }

    @Override
    public List<Tray> queryPage(int page, int num) {
        if (Tray.isUPDATED()) {
            Tray.setCOUNT(trayMapper.queryCount());
            Tray.setUPDATED(true);
        }
        int start = MyPageUtil.convert(page, num, Tray.getCOUNT());
        return trayMapper.queryPage(start, num);
    }

    @Override
    public int update(Tray tray) {
        return trayMapper.update(tray);
    }

    @Override
    public int deleteById(String id) {
        //删除中间表中此托盘的记录
        trayMapper.deletePosWh(id);
        return trayMapper.deleteById(id);
    }

    @Override
    public int insert(Tray tray, String posid) {
        int n = trayMapper.insert(tray);
        trayMapper.setNewPosWh(tray.getId(), posid);
        return n;
    }

    @Override
    public int updatePosTray(String trayid, String posid) {
        if(trayMapper.updatePosTray(trayid,posid) == 0) return 0;
        return trayMapper.updateTpid(trayid,posid);
    }
}
