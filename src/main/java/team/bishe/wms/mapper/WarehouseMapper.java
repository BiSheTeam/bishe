package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import team.bishe.wms.bean.Warehouse;

import java.util.List;

@Repository
public interface WarehouseMapper {

    List<Warehouse> queryWarehouseList();

    Warehouse queryById(String whid);

    List<Warehouse> queryPage(@Param("start") int start, @Param("num") int num);

    int queryCount();

    int updateWarehouse(Warehouse warehouse);

    int deleteById(String id);

    int insert(Warehouse warehouse);
}