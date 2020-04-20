package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
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

    List<DetailedEntry> selectRandom(Integer id , Integer cusId, Date startTime, Date endTime);

    List<DetailedEntry> selectAll();

    List<DetailedEntry> selectById(Integer id);

    List<DetailedEntry> selectByCusId(Integer cusId);

    List<DetailedEntry> selectByTime(Date startTime,Date endTime);

    void insert(DetailedEntry detailedEntry);

    void update(DetailedEntry detailedEntry);

    void updateById(Integer detailedEntryId,Integer repositoryId);

    void deleteAll();

    void deleteById();

}
