package lk.ijse.dep.pos.dao.custom;

import lk.ijse.dep.pos.dao.SuperDAO;
import lk.ijse.dep.pos.entity.CustomEntity;

import java.util.List;
/**
 * @Author Rivindu Wijayarathna
 */
public interface QueryDAO extends SuperDAO {
    List<CustomEntity> getOrdersInfo(String query) throws Exception;

}
