package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.User;
import team.bishe.wms.bean.WarehousingEntry;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.UserMapper;
import team.bishe.wms.mapper.WarehousingEntryMapper;
import team.bishe.wms.service.impl.ReceiptDocQueryImpl;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/user")
public class MapperController {

    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;

    @RequestMapping("/sele")
    public ApiResponse<List<WarehousingEntry>> sele(){
        List<WarehousingEntry> list = null;
        try {
            list = new ReceiptDocQueryImpl().selectwarehousingEntry(null,
                    "2020-03-25","2020-03-30",null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponse<List<WarehousingEntry>>(111,"OOOOOOOOOK",list);
    }

}
