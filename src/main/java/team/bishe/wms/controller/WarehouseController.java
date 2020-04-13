package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.WarehouseMapper;
import team.bishe.wms.service.impl.WarehouseServiceImpl;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
@RequestMapping("/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseServiceImpl warehouseServiceImpl;

    @GetMapping("/query")
    public ApiResponse<List<Warehouse>> queryWarehouse(){
        List<Warehouse> warehouses = warehouseServiceImpl.queryAll();
        return new ApiResponse<List<Warehouse>>(1,"OK",warehouses);
    }

    @GetMapping("/queryById")
    public ApiResponse<Warehouse> queryWhById(@RequestParam(name = "id") String id){
        Warehouse warehouses = warehouseServiceImpl.queryById(id);
        return new ApiResponse<Warehouse>(1,"OK",warehouses);
    }
}
