package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.DetailedEntry;
import team.bishe.wms.bean.WarehousingEntry;

import java.util.List;

/**
 * 入库单(明细)查询
 */
@Service
public interface ReceiptDocQueryService {
    /**
     * 入库单查询
     * 仓储相关人员可以通过此模块进行入库单信息查询
     * 系统提供通过入库时间段，入库单号，货主进行入库单信息查询
     * 如查询条件不输入，系统默认查询所有入库单信息
     * 入库单查询信息包括：入库单单号、结算员、货主、业务办理时间、力资费、其他费用、应收款、实收款、入库单状态
     * 以及提供删除操作；
     *
     *
     * @param endDateStr   查询记录起始日期
     * @param startDateStr 查询记录结束日期
     * @param warehousingEntryID 入库单号
     * @param userId 客户ID
     * @return true
     */
    List<WarehousingEntry> selectwarehousingEntry(Integer warehousingEntryID, String endDateStr, String startDateStr, Integer userId)throws Exception;

    /**
     * 入库单明细查询
     * 仓储相关人员可以通过此模块查询入库单的明细信息
     * 系统提供通过入库单号，入库时间段，货主进行入库单明细信息的查询
     * 如查询条件不输入，系统默认查询所有入库单明细信息
     * 入库单查到的明细信息包括：明细号，货主，托盘，货物名称，验货员，仓管员，入库数量，规格，当前数量，最后操作时间
     * 提供删除操作
     *
     * @param warehousingEntryID 入库工作单号
     * @param endDateStr 查询记录结束日期
     * @param startDateStr 查询记录起始日期
     * @param userId 客户ID
     * @return true
     */
    List<DetailedEntry> selectWarehouseDetail(Integer warehousingEntryID, String endDateStr, String startDateStr, Integer userId)throws Exception;
}
