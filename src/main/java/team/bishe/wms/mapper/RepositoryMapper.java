package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.Repository;

import java.util.List;

/**
 * 仓库信息Repository映射器
 */
@Mapper
@Component
public interface RepositoryMapper {

    /**
     * 选择指定 Repository ID 的 Repository 记录
     * @param repositoryID 仓库ID
     * @return 返回指定的Repository
     */
    List<Repository> selectByID(String repositoryID);



    List<Repository> selectByStatus();



}
