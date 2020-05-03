package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Repository;

import java.util.List;

/**
 * cangku查询
 */
@Service
public interface StockInquiryService {
    List<Repository> select();
}
