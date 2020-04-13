package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.mapper.WarehouseMapper;
import team.bishe.wms.service.WarehouseService;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseMapper WarehouseMapper;

    @Override
    public List<Warehouse> queryAll() {
        return WarehouseMapper.queryWarehouseList();
    }

    @Override
    public List<Warehouse> queryPage(int page, int num) {
        if (page < 1) page = 1;
        if (num <= 0) num = 10;
        int start = (page - 1) * num;
        return WarehouseMapper.queryPage(start, num);
    }

    @Override
    public Warehouse queryById(String whid) {
        return WarehouseMapper.queryById(whid);
    }
}
