package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;

@Slf4j
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ApiResponse<String> helloWorld(){
        return new ApiResponse<String>(123,"OK","HelloWorld");
    }

    @RequestMapping(value = "/exception",method = RequestMethod.GET)
    public ApiResponse testExceptionHandle(){
        try {
            log.info("查询  ，/");
        } catch (Exception e) {
            log.error("处理信息一场，/api/exception  error:{}",e.getMessage());
        }
        return  new ApiResponse<String>(9999,"OK","suiyi");
    }
}
