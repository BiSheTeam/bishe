package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.ChangeRepositoryService;

/**
 * 转移仓库操作
 */
@Slf4j
@ResponseBody
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "/changeRepository")
public class ChangeRepositoryController {

    @Autowired
    private ChangeRepositoryService changeRepositoryService;

    @RequestMapping(value = "/choose", method = RequestMethod.GET)
    public ApiResponse<Boolean> selectWarehouseEntry(String warehousingEntryId, Integer repositoryId) {
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("开始转移");
            Boolean state = changeRepositoryService.ChangeRep(warehousingEntryId, repositoryId);
            apiResponse.setCode(20000);
            apiResponse.setMsg("移库成功");
            apiResponse.setData(state);
        } catch (Exception e) {
            log.error("失败", e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

}
