package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.Application;

import java.util.Date;
import java.util.List;

/**
 * 申请单信息Application映射器
 */
@Mapper
@Component
public interface ApplicationMapper {
    /**
     *查询指定时间段的订单记录
     * @return 返回指定时间段内的所有订单
     */
    List<Application> selectByDate(Date startDate , Date endDate);

    /**
     * 查询指定订单id的记录
     * @return 返回指定id对应的Application
     */
    List<Application> selectById(Integer id);

    /**
     * 查询指定用户id的订单
     * @return 返回该客户的所有订单
     */
    List<Application> selectByUserId(Integer cusid);

    /**
     * 查询所有订单记录
     */
    List<Application> selectAll();

    int selectNumByName(String goodsName);

    /**
     * 插入一条新的申请单记录
     */
    void insert(Application application);

    /**
     * 更新申请单数据（验货）
     * @param application
     */
    void update(Application application);

    void updateState(Integer applicationId);
    /**
     * 删除指定id的记录
     */
    void deleteById(Integer id);

    /**
     *
     */
}
