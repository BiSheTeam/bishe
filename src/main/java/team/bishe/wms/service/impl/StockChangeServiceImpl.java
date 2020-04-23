package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Goods;
import team.bishe.wms.bean.GoodsKey;
import team.bishe.wms.bean.StockChange;
import team.bishe.wms.mapper.GoodsMapper;
import team.bishe.wms.mapper.StockChangeMapper;
import team.bishe.wms.mapper.StockOutMapper;
import team.bishe.wms.service.StockChangeService;
@Service
public class StockChangeServiceImpl implements StockChangeService {
    @Autowired
    public StockChangeMapper stockChangeMapper;
    @Autowired
    public GoodsMapper goodsMapper;
    @Override
    public StockChange SelectStockchange(Integer rowid) {
        StockChange stockChange = stockChangeMapper.selectByPrimaryKey(rowid);
        return stockChange;
    }

    @Override
    public void SaveStockchangeAndUpdateGoods(StockChange stockChange) {
        GoodsKey goodsKey = new GoodsKey();
        goodsKey.setGoodUserId(stockChange.getOldCustomerId());
        goodsKey.setGoodId(stockChange.getGoodId());
        Goods goods1 = goodsMapper.selectByPrimaryKey(goodsKey);
        goods1.setGoodUser(stockChange.getNewCustomerName());
        goods1.setGoodUserId(stockChange.getNewCustomerId());
        if(stockChangeMapper.selectByPrimaryKey(stockChange.getRowid())!=null){
            stockChangeMapper.deleteByPrimaryKey(stockChange.getRowid());
            stockChangeMapper.insert(stockChange);
            goodsMapper.deleteByPrimaryKey(goodsKey);
                goodsMapper.insert(goods1);


        } else {
            stockChangeMapper.insert(stockChange);
            goodsMapper.deleteByPrimaryKey(goodsKey);
                goodsMapper.insert(goods1);


        }
    }
    }

