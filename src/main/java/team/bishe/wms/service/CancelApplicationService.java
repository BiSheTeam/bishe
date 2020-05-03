package team.bishe.wms.service;

import org.springframework.stereotype.Service;

/**
 * 取消订单Service接口
 */
@Service
public interface CancelApplicationService {

    /**
     * 根据申请单单号取消订单
     * @param applicationId
     */
    void cancelOrder(String applicationId);
}
