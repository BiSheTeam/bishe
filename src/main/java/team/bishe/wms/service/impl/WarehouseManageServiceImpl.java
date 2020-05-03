package team.bishe.wms.service.impl;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import team.bishe.wms.bean.*;
import team.bishe.wms.mapper.*;
import team.bishe.wms.service.WarehouseManageService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 */
@Service
public class WarehouseManageServiceImpl implements WarehouseManageService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private RepositoryMapper repositoryMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private ApplicationMapper applicationMapper;
    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;
    @Autowired
    private DetailedEntryMapper detailedEntryMapper;

    /**
     *入库申请
     * @param cusId     客户id
     * @param goodsName     货物名称
     * @param goodsType     货物类型
     * @param goodsNum      货物数量
     * @param applicationDateStr    申请日期
     * @param repositoryId      仓库id
     */
    @Override
    public Boolean WarehouseInApplication(Integer cusId, String goodsName, String goodsType,
                                          String goodsNum, String applicationDateStr, String repositoryId) {
        //判断客户id，仓库id是否有效
        if (!userValidate(cusId) &&!repositoryValidate(repositoryId)) return false;
        //判断货物数量是否有意义
        if (!(Integer.parseInt(goodsNum)>0))return false;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(applicationDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateStr = dateFormat.format(date);

        Application application = new Application();
        application.setCusId(cusId);
        application.setGoodsName(goodsName);
        application.setGoodsType(goodsType);
        application.setNumber(Integer.parseInt(goodsNum));
        application.setApplicationDate(dateStr);
        application.setRepositoryId(repositoryId);
        applicationMapper.insert(application);
        applicationMapper.updateName(cusId);

        return true;
    }

    /**
     * 验货装盘
     * @param ApplicationID 申请单id
     * @param goodsName     货物名
     * @param goodsType     货物类型
     * @param goodsNum      货物数量
     * @return
     * @throws Exception
     */
    @Override
    public Boolean InspectionLoading(Integer ApplicationID, String goodsName, String goodsType, Integer goodsNum) {
        Application application = applicationMapper.selectById(ApplicationID);
        Boolean b=false;

            try {

                if (application.getGoodsName() != null && application.getGoodsType() != null && application.getNumber() != null
                        && application.getGoodsName().equals(goodsName) && application.getGoodsType().equals(goodsType)
                        && application.getNumber().equals(goodsNum) ){
                    b=true;

                }else {
                    application.setGoodsName(goodsName);
                    application.setGoodsType(goodsType);
                    application.setNumber(goodsNum);
                    application.setId(ApplicationID);
                    applicationMapper.update(application);
                    b=true;
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            return b;

    }

    /**
     *结算
     *
     * @param applicationId 申请单单号
     * @return
     */
    @Override
    public Double warehouseSettlement(Integer applicationId){
        Double v = 0.0;
        int number = 0;
        double value=0.0;
        try {
            String s = applicationMapper.selectGoodsName(applicationId);
            number = applicationMapper.selectNumByName(s,applicationId);
             value = goodsMapper.selectValueByName(s);
            if (number != 0 && value != 0){
                v = value * number;
            }
        }catch (Exception e){

            e.printStackTrace();
        }
        return v;
    }

    /**
     * 入库
     *
     * @param applicationId
     * @return
     * @throws Exception
     */
    @Override
    public Boolean inWarehouse(Integer applicationId) {
        Application application = applicationMapper.selectById(applicationId);
        //判断该申请单是否在入库表里
        if (!entryValidate(applicationId)) warehousingEntryMapper.insertByApp(application);

        //是否在明细表里
        if (!detailValidate(applicationId)) detailedEntryMapper.insertByApp(application);

        applicationMapper.updateInwhouse(applicationId);
        return true;
    }

    private boolean detailValidate(Integer applicationId){
        List<DetailedEntry> list = null;

        list =  detailedEntryMapper.selectById(applicationId);
        return  list.size()>0;
    }

    private boolean entryValidate(Integer applicationId){
        List<WarehousingEntry> list = null;

        list =  warehousingEntryMapper.selectById(applicationId);

        return list.size()>0;
    }


    /**
     * 检查客户ID对应的记录是否存在
     *
     * @param cusId 客户ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean userValidate(Integer cusId) {
        List<Customer> customers =null;
        try {
            customers = customerMapper.selectById(cusId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers != null;

    }


    /**
     *检查仓库ID对应的记录是否存在
     *
     * @param repositoryId 仓库ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean repositoryValidate(String repositoryId){
        List<Repository> repositories =null;
        try{
            repositories = repositoryMapper.selectByID(repositoryId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return repositories != null;
    }

    /**
     * 检查货物ID对应的记录是否存在
     *
     * @param goodsId 货物ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean goodsValidate(Integer goodsId)  {
        Goods goods =null;
        try {
            goods = goodsMapper.selectById(goodsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goods != null;
    }
}
