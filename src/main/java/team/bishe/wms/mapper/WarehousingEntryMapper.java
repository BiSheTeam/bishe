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

    List<WarehousingEntry> selectRandom(Integer id ,Integer cusId, Date startTime, Date endTime);

    List<WarehousingEntry> selectAll();

    List<WarehousingEntry> selectById(Integer id);

    List<WarehousingEntry> selectByCusId(Integer cusId);

    List<WarehousingEntry> selectByTime(Date startTime,Date endTime);

    void insert(WarehousingEntry warehousingEntry);

    void insertByApp(List<Application>  list);

    void update(WarehousingEntry warehousingEntry);

    void updateById(Integer warehouseEntryId, Integer repositoryId);

    void deleteAll();

    void deleteById();
}
