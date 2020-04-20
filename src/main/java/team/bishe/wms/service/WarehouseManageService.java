package team.bishe.wms.service;

/**
 * 入库管理Service接口
 */
public interface WarehouseManageService {
    /**
     *  入库申请
     *  "尊敬的***用户，入库申请办理成功，进入验货装盘阶段！请确认，如有任何疑问请及时联系我们。【物联网中心】"
     *  通过物联网发送一条socket信息给验货员
     * @param cusId     客户id
     * @param goodsName     货物名称
     * @param goodsType     货物类型
     * @param goodsNum      货物数量
     * @param applicationDateStr    申请日期
     * @param repositoryId      仓库id
     * @return  返回true表示操作成功，false表示失败
     * @throws Exception
     */
    Boolean WarehouseInApplication(Integer cusId, String goodsName,String goodsType,
                                   Long goodsNum, String applicationDateStr, Integer repositoryId)throws Exception;

    /**
     * 验货装盘
     * "尊敬的***用户，你的货物已经分批装盘，货物为如下：苹果，100件，30公斤/件，
     *      装盘成功！请确认，如有任何疑问请及时联系我们。【物联网中心】"
     *
     * @param ApplicationID 申请单id
     * @param goodsName     货物名
     * @param goodsType     货物类型
     * @param goodsNum      货物数量
     * @return 返回true表示操作成功，false表示失败
     * @throws Exception
     */
    Boolean InspectionLoading(Integer ApplicationID, String goodsName, String goodsType,
                              Long goodsNum)throws Exception;

    /**
     * 入库结算
     *  "尊敬的***客户，你的货物已经结算成功！请确认，如有任何疑问请及时联系我们。【物联网中心】"
     *
     * @param applicationId 申请单单号
     * @param warehousingEntryID 入库单
     * @return
     * @throws Exception
     */
    Boolean warehouseSettlement(Integer applicationId,Integer warehousingEntryID)throws Exception;

    /**
     * 货物入库
     * "尊敬的***客户，你的货物已经入库，本次入库货物信息如下：苹果，30件 ；15公斤/件，货物入库成功！
     *                  请确认，如有任何疑问请及时联系我们。【互联网中心】"
     *
     * @param userId
     * @return
     * @throws Exception
     */
    Boolean inWarehouse(Integer userId)throws Exception;
}
