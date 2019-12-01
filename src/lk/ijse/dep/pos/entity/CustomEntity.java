package lk.ijse.dep.pos.entity;

import java.sql.Date;

public class CustomEntity implements SuperEntity {

    private int orderId;
    private String customerId;
    private String customerName;
    private Date orderDate;
    private double orderTotal;

    public CustomEntity() {
    }


    public CustomEntity(int orderId, String customerId, String customerName, Date orderDate, double orderTotal) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

}
