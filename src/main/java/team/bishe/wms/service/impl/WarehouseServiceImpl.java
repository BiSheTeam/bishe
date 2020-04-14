package team.bishe.wms.service.impl;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.mapper.WarehouseMapper;
import team.bishe.wms.service.WarehouseService;
import team.bishe.wms.util.MyPageUtil;

import java.util.List;

@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> queryAll() {
        return warehouseMapper.queryWarehouseList();
    }

    /**
     * 分页擦查询
     *
     * @param page 第几页
     * @param num  每页多少数据
     * @return 仓库结果集
     */
    @Override
    public List<Warehouse> queryPage(int page, int num) {
        if (Warehouse.isUPDATED()) {
            Warehouse.setCOUNT(warehouseMapper.queryCount());
            Warehouse.setUPDATED(true);
        }
        int start = MyPageUtil.convert(page, num, Warehouse.getCOUNT());
        return warehouseMapper.queryPage(start, num);
    }

    @Override
    public Warehouse queryById(String whid) {
        return warehouseMapper.queryById(whid);
    }

    @Override
    public int update(Warehouse warehouse) {
        return warehouseMapper.updateWarehouse(warehouse);
    }

    @Override
    public int deleteById(String id) {
        //查询仓库是否有仓位
        //有则返回-1
        if (warehouseMapper.queryPosCount(id) != 0) return -1;
        //无则删除并返回
        return warehouseMapper.deleteById(id);
    }

    @Override
    public int insetrt(Warehouse warehouse) {
        return warehouseMapper.insert(warehouse);
    }


}
