package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Repository;
import team.bishe.wms.mapper.RepositoryMapper;
import team.bishe.wms.service.StockInquiryService;

import java.util.List;

@Service
public class StockInquiryServiceImpl implements StockInquiryService {

    @Autowired
    private RepositoryMapper repositoryMapper;

    @Override
    public List<Repository> select() {
        List<Repository> resp = repositoryMapper.selectByStatus();
        return resp;

    }
}
