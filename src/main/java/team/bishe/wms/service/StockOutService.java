package team.bishe.wms.service;



import org.springframework.stereotype.Service;
import team.bishe.wms.bean.StockOut;

@Service
public interface StockOutService {
    /**
     *查询出库信息
     * @param
     * @return
     */
    public StockOut SelectStockout  (Integer rowid);
    /**
     *出库操作
     * @param
     * @return
     */
    public void SaveStockoutAndUpdateGoods(StockOut stockOut);
}
