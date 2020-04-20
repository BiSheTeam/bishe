package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import team.bishe.wms.mapper.DetailedEntryMapper;
import team.bishe.wms.mapper.WarehousingEntryMapper;
import team.bishe.wms.service.ChangeRepositoryService;

public class ChangeRepositoryServiceImpl implements ChangeRepositoryService {

    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;

    @Autowired
    private DetailedEntryMapper detailedEntryMapper;

    @Override
    public Boolean ChangeRep(Integer warehouseEntryId,Integer repositoryId) {

        warehousingEntryMapper.updateById(warehouseEntryId,repositoryId);




        detailedEntryMapper.updateById(warehouseEntryId,repositoryId);
        return null;
    }
}
