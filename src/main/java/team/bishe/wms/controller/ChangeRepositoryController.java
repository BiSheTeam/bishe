package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.ChangeRepositoryService;

/**
 * 转移仓库操作
 */
@Slf4j
@ResponseBody
@RestController
@RequestMapping(value = "/ChangeRepository")
public class ChangeRepositoryController {

    @Autowired
    private ChangeRepositoryService changeRepositoryService;

    @RequestMapping(value = "1", method = RequestMethod.POST)
    public ApiResponse<Boolean> selectWarehouseEntry(Integer warehousingEntryId, Integer repositoryId) {
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("开始转移");
            Boolean state = changeRepositoryService.ChangeRep(warehousingEntryId, repositoryId);
            apiResponse.setCode(100);
            apiResponse.setMsg("成功");
            apiResponse.setData(state);
        } catch (Exception e) {
            log.error("失败", e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

}