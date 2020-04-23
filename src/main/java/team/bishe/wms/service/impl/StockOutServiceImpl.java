package team.bishe.wms.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Goods;
import team.bishe.wms.bean.GoodsKey;
import team.bishe.wms.bean.StockOut;
import team.bishe.wms.mapper.GoodsMapper;
import team.bishe.wms.mapper.StockOutMapper;
import team.bishe.wms.service.StockOutService;



@Service
public class StockOutServiceImpl implements StockOutService {
    @Autowired
    public StockOutMapper stockoutMapper;
    @Autowired
    public GoodsMapper goodsMapper;
    @Override
    public StockOut SelectStockout(Integer rowid) {

        StockOut stockOut = stockoutMapper.selectByPrimaryKey(rowid);
        return stockOut;
    }

    @Override
    public void SaveStockoutAndUpdateGoods(StockOut stockOut) {
        GoodsKey goodsKey = new GoodsKey();
        goodsKey.setGoodUserId(stockOut.getCustomerId().toString());
        goodsKey.setGoodId(stockOut.getGoodId());
        Goods goods1 = goodsMapper.selectByPrimaryKey(goodsKey);
        Integer number = goods1.getNumber()-stockOut.getTotalPackageNum();
        goods1.setNumber(number);
        if(stockoutMapper.selectByPrimaryKey(stockOut.getRowid())!=null){
            stockoutMapper.deleteByPrimaryKey(stockOut.getRowid());
            stockoutMapper.insert(stockOut);
             goodsMapper.deleteByPrimaryKey(goodsKey);
             if(number>0){
                 goodsMapper.insert(goods1);
             }

        } else {
            stockoutMapper.insert(stockOut);
                goodsMapper.deleteByPrimaryKey(goodsKey);
            if(number>0){
                goodsMapper.insert(goods1);
            }

        }
    }
}
