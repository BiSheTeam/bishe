package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Tray;
import team.bishe.wms.bean.Tray;
import team.bishe.wms.bean.Tray;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.TrayService;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
//@RequestMapping("/tray")
public class TrayController {
    @Autowired
    private TrayService trayService;

    @GetMapping("/tray")
    public ApiResponse<List<Tray>> querytray() {
        List<Tray> tray = trayService.queryTrayList();
        return new ApiResponse<List<Tray>>(1, "OK", tray);
    }

    @GetMapping("/tray/{id}")
    public ApiResponse<Tray> queryWhById(@PathVariable("id") String id) {
        Tray tray = trayService.queryById(id);
        return new ApiResponse<Tray>(1, "OK", tray);
    }

    @GetMapping("/tray/{page}/{num}")
    public ApiResponse<List<Tray>> queryPage(@PathVariable("page") int page,
                                             @PathVariable("num") int num) {
        List<Tray> trays = trayService.queryPage(page, num);
        return new ApiResponse<List<Tray>>(1, "OK", trays);
    }

    @PutMapping("/tray")
    @ResponseBody
    public ApiResponse<Tray> update(@RequestBody Tray tray) {
        int n = trayService.update(tray);
        if (n == 0) return new ApiResponse<Tray>(400, "修改失败", null);
        Tray tray1 = trayService.queryById(tray.getId());
        return new ApiResponse<Tray>(1, "OK", tray1);
    }

    @DeleteMapping("/tray/{id}")
    @ResponseBody
    public ApiResponse<String> deleteById(@PathVariable String id) {
        int n = trayService.deleteById(id);
        if (n == 0) return new ApiResponse<String>(400, "删除失败", null);
        Tray.setUPDATED(false);
        return new ApiResponse<String>(1, "OK", "成功删除" + n + "条");
    }

    @PostMapping("/tray/{posid}")
    public ApiResponse<Tray> insert(@RequestBody Tray tray, @PathVariable String posid) {
        int n = trayService.insert(tray, posid);
        if (n == 0) return new ApiResponse<Tray>(400, "添加失败", null);
        Tray.setUPDATED(false);
        Tray tray1 = trayService.queryById(tray.getId());
        return new ApiResponse<Tray>(1, "OK", tray1);
    }

    //修改托盘所在的仓位
    @PutMapping("/tray/{tid}/{posid}")
    public ApiResponse<String> updatePosTray(@PathVariable("id") String trayid, @PathVariable("posid") String posid) {
        int n = trayService.updatePosTray(trayid, posid);
        if(n == 0) return new ApiResponse<String>(400, "移仓失败", null);
        return new ApiResponse<String>(400, "移仓失败", null);
    }
}
