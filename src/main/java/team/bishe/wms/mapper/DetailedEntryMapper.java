package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.Application;
import team.bishe.wms.bean.DetailedEntry;
import team.bishe.wms.bean.WarehousingEntry;

import java.util.Date;
import java.util.List;

/**
 * 详细入库单映射器
 */
@Mapper
@Component
public interface DetailedEntryMapper {

    List<DetailedEntry> selectRandom(String id , Integer cusId, String startTime, String endTime);


    List<DetailedEntry> selectById(Integer applicationId);



    void insertByApp(Application  application);


    void updateById(String detailedEntryId,Integer repositoryId);

    void updateState(String application);

    void deleteById(String detailedEntryId);

}
