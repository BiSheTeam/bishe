package team.bishe.wms.service.impl;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import team.bishe.wms.Exception.WarehouseManageServiceException;
import team.bishe.wms.bean.*;
import team.bishe.wms.mapper.*;
import team.bishe.wms.service.WarehouseManageService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 */
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

    //定义日期转换格式
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     *入库申请
     * @param cusId     客户id
     * @param goodsName     货物名称
     * @param goodsType     货物类型
     * @param goodsNum      货物数量
     * @param applicationDateStr    申请日期
     * @param repositoryId      仓库id
     * @throws WarehouseManageServiceException 入库管理异常
     */
    @Override
    public Boolean WarehouseInApplication(Integer cusId, String goodsName, String goodsType,
                                          Long goodsNum, String applicationDateStr, Integer repositoryId) throws WarehouseManageServiceException {
        //判断客户id，仓库id是否有效
        if (!userValidate(cusId) ||!repositoryValidate(repositoryId)) return false;
        //判断货物数量是否有意义
        if (!(goodsNum >0))return false;

        /*Date date = null;
        if (!StringUtils.isEmpty(applicationDateStr)) {
            try {
                date = dateFormat.parse(applicationDateStr);
            } catch (ParseException e) {
                throw new WarehouseManageServiceException(e);
            }
        }*/

        Application application = new Application();
        application.setCusId(cusId);
        application.setGoodsName(goodsName);
        application.setGoodsType(goodsType);
        application.setNumber(goodsNum);
        application.setApplicationDate(applicationDateStr);
        application.setRepositoryId(repositoryId);
        applicationMapper.insert(application);


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
    public Boolean InspectionLoading(Integer ApplicationID, String goodsName, String goodsType, Long goodsNum) throws WarehouseManageServiceException {
        List<Application> list = applicationMapper.selectById(ApplicationID);
        for (Application application:list) {

            try {

                if (application.getGoodsName() != null && application.getGoodsType() != null && application.getNumber() != null
                        && application.getGoodsName().equals(goodsName) && application.getGoodsType().equals(goodsType)
                        && application.getNumber().equals(goodsNum) ){
                    return true;
                }else {
                    application.setGoodsName(goodsName);
                    application.setGoodsType(goodsType);
                    application.setNumber(goodsNum);
                    applicationMapper.update(application);
                    return true;
                }
            }catch (Exception e){
                throw new WarehouseManageServiceException(e);
            }

        }
        return false;
    }

    /**
     *结算
     *
     * @param applicationId 申请单单号
     * @param warehousingEntryID 入库单
     * @return
     */
    @Override
    public Boolean warehouseSettlement(Integer applicationId, Integer warehousingEntryID){
        List<Application> list = applicationMapper.selectById(applicationId);
        Double value = null;
        for (Application application:list) {
            double y = goodsMapper.selectValueByName(application.getGoodsName());
            long x = applicationMapper.selectNumByName(application.getGoodsName());
            value = value + x*y;
        }


        return true;
    }

    /**
     * 入库
     *
     * @param applicationId
     * @return
     * @throws Exception
     */
    @Override
    public Boolean inWarehouse(Integer applicationId) throws Exception {
        List<Application> list = applicationMapper.selectById(applicationId);
        WarehousingEntry warehousingEntry = new WarehousingEntry();
        warehousingEntryMapper.insertByApp(list);
        return null;
    }

    /**
     * 检查客户ID对应的记录是否存在
     *
     * @param cusId 客户ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean userValidate(Integer cusId)throws WarehouseManageServiceException {
        try {
            Customer customer = customerMapper.selectById(cusId);

            return customer != null;
        } catch (PersistenceException e) {
            throw new WarehouseManageServiceException(e);
        }
    }

    /**
     *检查仓库ID对应的记录是否存在
     *
     * @param repositoryId 仓库ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean repositoryValidate(Integer repositoryId)throws WarehouseManageServiceException{
        try{
            Repository repository = repositoryMapper.selectByID(repositoryId);
            return repository != null;
        }catch (PersistenceException e){
            throw new WarehouseManageServiceException(e);
        }
    }

    /**
     * 检查货物ID对应的记录是否存在
     *
     * @param goodsId 货物ID
     * @return 若存在则返回true，否则返回false
     */
    private boolean goodsValidate(Integer goodsId) throws WarehouseManageServiceException {
        try {
            Goods goods = goodsMapper.selectById(goodsId);
            return goods != null;
        } catch (PersistenceException e) {
            throw new WarehouseManageServiceException(e);
        }
    }
}
