package team.bishe.wms.controller;

import io.swagger.annotations.ApiImplicitParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.WarehouseMapper;
import team.bishe.wms.service.WarehouseService;
import team.bishe.wms.service.impl.WarehouseServiceImpl;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
//@RequestMapping("/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    //查询所有仓库
    @GetMapping("/warehouse")
    public ApiResponse<List<Warehouse>> queryWarehouse() {
        List<Warehouse> warehouses = warehouseService.queryAll();
        return new ApiResponse<List<Warehouse>>(1, "OK", warehouses);
    }

    //根据id查询仓库
    @GetMapping("/warehouse/{id}")
    public ApiResponse<Warehouse> queryWhById(@PathVariable("id") String id) {
        Warehouse warehouses = warehouseService.queryById(id);
        return new ApiResponse<Warehouse>(1, "OK", warehouses);
    }

    //分页查询仓库
    @GetMapping("/warehouse/{page}/{num}")
    public ApiResponse<List<Warehouse>> queryPage(@PathVariable("page") int page,
                                                  @PathVariable("num") int num) {
        List<Warehouse> warehouses = warehouseService.queryPage(page, num);
        return new ApiResponse<List<Warehouse>>(1, "OK", warehouses);
    }

    //修改仓库，由参数warehouse的id查询仓库并修改，除id所有字段都可修改，需由前端限制修改字段
    @PutMapping("/warehouse")
    @ResponseBody
    public ApiResponse<Warehouse> update(@RequestBody Warehouse warehouse) {
        int n = warehouseService.update(warehouse);
        if (n == 0) return new ApiResponse<Warehouse>(400, "修改失败", null);
        Warehouse warehouse1 = warehouseService.queryById(warehouse.getId());
        return new ApiResponse<Warehouse>(1, "OK", warehouse1);
    }

    //根据id删除仓库，
    @DeleteMapping("/warehouse/{id}")
    @ResponseBody
    public ApiResponse<String> deleteById(@PathVariable String id) {
        int n = warehouseService.deleteById(id);
        if (n == -1) return new ApiResponse<String>(400, "此仓库存在仓位，无法删除", null);
        if (n == 0) return new ApiResponse<String>(400, "删除失败", null);
        Warehouse.setUPDATED(false);
        return new ApiResponse<String>(1, "OK", "成功删除" + n + "条");
    }

    //添加仓库
    @PostMapping("/warehouse/")
    public ApiResponse<Warehouse> insert(@RequestBody Warehouse warehouse) {
        int n = warehouseService.insetrt(warehouse);
        if (n == 0) return new ApiResponse<Warehouse>(400, "添加失败", null);
        Warehouse.setUPDATED(false);
        Warehouse warehouse1 = warehouseService.queryById(warehouse.getId());
        return new ApiResponse<Warehouse>(1, "OK", warehouse1);
    }
}
