package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.Customer;

import java.util.List;

/**
 * 客户信息Customer映射器
 */
@Component
@Mapper
public interface CustomerMapper {


    /**
     * 选择指定 id 的 Supplier
     * @param id Customer的ID
     * @return 返回指定ID对应的Customer
     */
    List<Customer> selectById(Integer id);

    /**
     * 选择指定 Customer name 的 customer
     * @param customerName 客户的名称
     * @return 返回指定CustomerName对应的Customer
     */
    Customer selectByName(String customerName);



    /**
     * 插入 Customer 到数据库中
     * 不需要指定 Customer 的主键，采用的数据库 AI 方式
     * @param customer Customer 实例
     */
    void insert(Customer customer);



    /**
     * 更新 Customer 到数据库
     * 该 Customer 必须已经存在于数据库中，即已经分配主键，否则将更新失败
     * @param customer customer 实例
     */
    void update(Customer customer);




}
