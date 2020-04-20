package team.bishe.wms.service;

/**
 * 越库转移service接口
 */
public interface ChangeRepositoryService {

    /**
     * 越库转移
     * 根据入库单号更改所属仓库
     */
    Boolean ChangeRep(Integer warehouseEntryId,Integer repositoryId);


}
