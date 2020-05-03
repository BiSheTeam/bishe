package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import java.util.Locale;

@Service
public class ReceiptDocQueryImpl implements ReceiptDocQueryService {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.CHINA);

    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;
    @Autowired
    private DetailedEntryMapper detailedEntryMapper;

    @Override
    public List<WarehousingEntry> selectwarehousingEntry(String  warehousingEntryID, Integer cusId, String endDateStr, String startDateStr) {
        Date startdate = null;
        Date enddate = null;
        String startStr = null;
        String endStr = null;
        try {
            if (startDateStr != null)startdate = simpleDateFormat.parse(startDateStr);
            if (endDateStr != null)enddate = simpleDateFormat.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (startdate != null ) startStr = dateFormat.format(startdate);
        if (enddate != null) endStr = dateFormat.format(enddate);
        List<WarehousingEntry> list = warehousingEntryMapper.selectRandom(warehousingEntryID,cusId,startStr,endStr);
        return list;
    }



    @Override
    public List<DetailedEntry> selectWarehouseDetail(String DetailedEntryID, String endDateStr, String startDateStr, Integer cusId){
        Date startdate = null;
        Date enddate = null;
        String startStr = null;
        String endStr = null;
        try {
            if (startDateStr != null)startdate = simpleDateFormat.parse(startDateStr);
            if (endDateStr != null)enddate = simpleDateFormat.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (startdate != null ) startStr = dateFormat.format(startdate);
        if (enddate != null) endStr = dateFormat.format(enddate);

        List<DetailedEntry> list = detailedEntryMapper.selectRandom(DetailedEntryID,cusId,startStr,endStr);
        return list;
    }

    @Override
    public Boolean deleteEntry(String warehousingEntryId) {
        warehousingEntryMapper.deleteById(warehousingEntryId);
        return true;
    }

    @Override
    public Boolean deleteDetail(String warehousingDetailId) {
        detailedEntryMapper.deleteById(warehousingDetailId);
        return true;
    }
}
