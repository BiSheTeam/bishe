package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.Application;
import team.bishe.wms.bean.WarehousingEntry;

import java.util.Date;
import java.util.List;

/**
 * 入库单映射
 */
@Mapper
@Component
public interface WarehousingEntryMapper {

    List<WarehousingEntry> selectRandom(String  id ,Integer cusId, String startTime, String endTime);

    List<WarehousingEntry> selectById(Integer applicationId);

    void insertByApp(Application application);

    void updateById(String warehouseEntryId, Integer repositoryId);

    void updateState(String applicationId);

    void deleteById(String warehousingEntryId);
}
