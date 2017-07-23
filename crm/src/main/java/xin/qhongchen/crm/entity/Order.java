package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_order", schema = "crmdb", catalog = "")
public class Order {
    private Integer orderId;
    private String orderTime;
    private String orderAddr;
    private Integer orderStatus;
    private Integer orderClientId;

    @Id
    @Column(name = "order_id", nullable = false)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_time", nullable = false)
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "order_addr", nullable = false, length = 30)
    public String getOrderAddr() {
        return orderAddr;
    }

    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr;
    }

    @Basic
    @Column(name = "order_status", nullable = false)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_client_id", nullable = false)
    public Integer getOrderClientId() {
        return orderClientId;
    }

    public void setOrderClientId(Integer orderClientId) {
        this.orderClientId = orderClientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (orderStatus != order.orderStatus) return false;
        if (orderClientId != order.orderClientId) return false;
        if (orderTime != null ? !orderTime.equals(order.orderTime) : order.orderTime != null) return false;
        if (orderAddr != null ? !orderAddr.equals(order.orderAddr) : order.orderAddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderTime != null ? orderTime.hashCode() : 0);
        result = 31 * result + (orderAddr != null ? orderAddr.hashCode() : 0);
        result = 31 * result + orderStatus;
        result = 31 * result + orderClientId;
        return result;
    }
}
