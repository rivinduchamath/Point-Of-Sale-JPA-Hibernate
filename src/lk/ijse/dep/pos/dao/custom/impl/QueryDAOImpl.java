package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.custom.QueryDAO;
import lk.ijse.dep.pos.entity.CustomEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author Rivindu Wijayarathna
 */
@Component
public class QueryDAOImpl  implements QueryDAO {

    private EntityManager entityManager;
    @Override
    public void setEntityManager(EntityManager entitymanager) {
        this.entityManager=entitymanager;
    }

    @Override
    public List<CustomEntity> getOrdersInfo(String query) throws Exception {

        List<Object[]> resultList = entityManager.createNativeQuery("" +
                "SELECT o.id, c.cus_Id,c.name, o.date, OD.qty * OD.unit_price  " +
                "FROM customer c" +
                " JOIN `order` o ON c.cus_Id=o.customer_id " +
                "JOIN OrderDetail OD on o.id = OD.order_id" +
                " WHERE o.id LIKE ?1 OR c.cus_Id LIKE ?1 OR c.name " +
                "LIKE ?1 OR o.date LIKE ?1 GROUP BY o.id").setParameter(1, query).getResultList();
        ArrayList<CustomEntity> list = new ArrayList<>();
        for (Object[] clo : resultList) {
            list.add(new CustomEntity((int)clo[0],(String) clo[1],(String) clo[2],(Date) clo[3],(Double) clo[4]));
        }
        return list;
    }
}
