package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.StockChange;
import team.bishe.wms.bean.StockOut;
@Service
public interface StockChangeService {
    /**
     *查询过户信息
     * @param
     * @return
     */
    public StockChange SelectStockchange  (Integer rowid);
    /**
     *过户操作
     * @param
     * @return
     */
    public void SaveStockchangeAndUpdateGoods(StockChange stockChange);
}
