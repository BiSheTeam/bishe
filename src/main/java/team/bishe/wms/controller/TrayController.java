package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Tray;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.TrayMapper;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
@RequestMapping("/tray")
public class TrayController {
    @Autowired
    private TrayMapper trayMapper;

    @GetMapping("/query")
    public ApiResponse<List<Tray>> queryposition(){
        List<Tray> tray = trayMapper.queryTrayList();
        return new ApiResponse<List<Tray>>(1,"OK",tray);
    }

    @GetMapping("/queryById")
    public ApiResponse<Tray> queryWhById(@RequestParam(name = "id") String id){
        Tray tray = trayMapper.queryById(id);
        return new ApiResponse<Tray>(1,"OK",tray);
    }
}
