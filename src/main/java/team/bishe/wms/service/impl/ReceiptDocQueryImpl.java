package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import team.bishe.wms.bean.DetailedEntry;
import team.bishe.wms.bean.WarehousingEntry;
import team.bishe.wms.mapper.DetailedEntryMapper;
import team.bishe.wms.mapper.WarehousingEntryMapper;
import team.bishe.wms.service.ReceiptDocQueryService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReceiptDocQueryImpl implements ReceiptDocQueryService {

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;
    @Autowired
    private DetailedEntryMapper detailedEntryMapper;

    @Override
    public List<WarehousingEntry> selectwarehousingEntry(Integer warehousingEntryID, String endDateStr, String startDateStr, Integer cusId) {
        List<WarehousingEntry> list = null;

        Date startDate = null;
        Date endDate = null;
        try {
            startDate = dateFormat.parse(startDateStr);
            endDate = dateFormat.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        list = warehousingEntryMapper.selectRandom(warehousingEntryID,cusId,startDate,endDate);
        return list;
    }



    @Override
    public List<DetailedEntry> selectWarehouseDetail(Integer DetailedEntryID, String endDateStr, String startDateStr, Integer cusId){
        List<DetailedEntry> list = null;
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = dateFormat.parse(startDateStr);
            endDate = dateFormat.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        list = detailedEntryMapper.selectRandom(DetailedEntryID,cusId,startDate,endDate);
        return list;
    }
}
