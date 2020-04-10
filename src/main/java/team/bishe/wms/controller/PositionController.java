package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Position;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.PositionMapper;
import team.bishe.wms.mapper.WarehouseMapper;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionMapper positionMapper;

    @GetMapping("/query")
    public ApiResponse<List<Position>> queryposition(){
        List<Position> positions = positionMapper.queryPositionList();
        return new ApiResponse<List<Position>>(1,"OK",positions);
    }

    @GetMapping("/queryById")
    public ApiResponse<Position> queryWhById(@RequestParam(name = "id") String id){
        Position position = positionMapper.queryById(id);
        return new ApiResponse<Position>(1,"OK",position);
    }
}
