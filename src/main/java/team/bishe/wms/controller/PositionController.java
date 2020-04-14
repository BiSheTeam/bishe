package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Position;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.PositionService;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
//@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/position")
    public ApiResponse<List<Position>> queryposition() {
        List<Position> positions = positionService.queryPositionList();
        return new ApiResponse<List<Position>>(1, "OK", positions);
    }

    @GetMapping("/position/{id}")
    public ApiResponse<Position> queryWhById(@PathVariable("id") String id) {
        Position position = positionService.queryById(id);
        return new ApiResponse<Position>(1, "OK", position);
    }

    @GetMapping("/position/{page}/{num}")
    public ApiResponse<List<Position>> queryPage(@PathVariable("page") int page,
                                                 @PathVariable("num") int num) {
        List<Position> positions = positionService.queryPage(page, num);
        return new ApiResponse<List<Position>>(1, "OK", positions);
    }

    @PutMapping("/position")
    @ResponseBody
    public ApiResponse<Position> update(@RequestBody Position position) {
        int n = positionService.update(position);
        if (n == 0) return new ApiResponse<Position>(400, "修改失败", null);
        Position position1 = positionService.queryById(position.getId());
        return new ApiResponse<Position>(1, "OK", position1);
    }

    @DeleteMapping("/position/{id}")
    @ResponseBody
    public ApiResponse<String> deleteById(@PathVariable String id) {
        int n = positionService.deleteById(id);
        if (n == -1) return new ApiResponse<String>(400, "此仓位存在托盘，无法删除", null);
        if (n == 0) return new ApiResponse<String>(400, "删除失败", null);
        Position.setUPDATED(false);
        return new ApiResponse<String>(1, "OK", "成功删除" + n + "条");
    }

    @PostMapping("/position/{whid}")
    public ApiResponse<Position> insert(@RequestBody Position position, @PathVariable("whid") String whid) {
        int n = positionService.insert(position, whid);
        if (n == 0) return new ApiResponse<Position>(400, "添加失败", null);
        Position.setUPDATED(false);
        Position position1 = positionService.queryById(position.getId());
        return new ApiResponse<Position>(1, "OK", position1);
    }
}
