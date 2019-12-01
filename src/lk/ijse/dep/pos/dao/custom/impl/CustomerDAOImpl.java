package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
@Component
public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

    @Override
    public String getLastCustomerId() throws Exception {
        Query nativeQuery = entityManager.createNativeQuery("SELECT cus_Id FROM Customer ORDER BY cus_Id DESC LIMIT 1");
        return nativeQuery.getResultList().size()>0? (String) nativeQuery.getSingleResult() :null;
    }

}
