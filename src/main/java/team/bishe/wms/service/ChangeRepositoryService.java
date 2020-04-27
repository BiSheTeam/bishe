package team.bishe.wms.service;

import org.springframework.stereotype.Service;

/**
 * 越库转移service接口
 */
@Service
public interface ChangeRepositoryService {

    /**
     * 越库转移
     * 根据入库单号更改所属仓库
     */
    Boolean ChangeRep(Integer warehouseEntryId,Integer repositoryId);


}
