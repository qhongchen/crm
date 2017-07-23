package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_item", schema = "crmdb", catalog = "")
public class Item {
    private Integer itemId;
    private String itemName;
    private Integer itemCount;
    private String itemUnit;
    private Double itemPrice;
    private Integer itemOrderId;

    @Id
    @Column(name = "item_id", nullable = false)
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name", nullable = false, length = 30)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_count", nullable = false)
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    @Basic
    @Column(name = "item_unit", nullable = false, length = 10)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "item_price", nullable = false, precision = 2)
    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Basic
    @Column(name = "item_order_id", nullable = false)
    public Integer getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(Integer itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (itemId != item.itemId) return false;
        if (itemCount != item.itemCount) return false;
        if (Double.compare(item.itemPrice, itemPrice) != 0) return false;
        if (itemOrderId != item.itemOrderId) return false;
        if (itemName != null ? !itemName.equals(item.itemName) : item.itemName != null) return false;
        if (itemUnit != null ? !itemUnit.equals(item.itemUnit) : item.itemUnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = itemId;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + itemCount;
        result = 31 * result + (itemUnit != null ? itemUnit.hashCode() : 0);
        temp = Double.doubleToLongBits(itemPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + itemOrderId;
        return result;
    }
}
