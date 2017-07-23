package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_goods", schema = "crmdb", catalog = "")
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String goodsUnit;
    private Double goodsPrice;
    private String goodsVersion;
    private String goodsGrade;
    private String goodsDesc;
    private String goodsWarehouse;
    private String goodsPosition;
    private Integer goodsCount;

    @Id
    @Column(name = "goods_id", nullable = false)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = false, length = 30)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_unit", nullable = false, length = 10)
    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    @Basic
    @Column(name = "goods_price", nullable = false, precision = 2)
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "goods_version", nullable = false, length = 10)
    public String getGoodsVersion() {
        return goodsVersion;
    }

    public void setGoodsVersion(String goodsVersion) {
        this.goodsVersion = goodsVersion;
    }

    @Basic
    @Column(name = "goods_grade", nullable = false, length = 10)
    public String getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(String goodsGrade) {
        this.goodsGrade = goodsGrade;
    }

    @Basic
    @Column(name = "goods_desc", nullable = true, length = 30)
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Basic
    @Column(name = "goods_warehouse", nullable = false, length = 30)
    public String getGoodsWarehouse() {
        return goodsWarehouse;
    }

    public void setGoodsWarehouse(String goodsWarehouse) {
        this.goodsWarehouse = goodsWarehouse;
    }

    @Basic
    @Column(name = "goods_position", nullable = false, length = 30)
    public String getGoodsPosition() {
        return goodsPosition;
    }

    public void setGoodsPosition(String goodsPosition) {
        this.goodsPosition = goodsPosition;
    }

    @Basic
    @Column(name = "goods_count", nullable = false)
    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (goodsId != goods.goodsId) return false;
        if (Double.compare(goods.goodsPrice, goodsPrice) != 0) return false;
        if (goodsCount != goods.goodsCount) return false;
        if (goodsName != null ? !goodsName.equals(goods.goodsName) : goods.goodsName != null) return false;
        if (goodsUnit != null ? !goodsUnit.equals(goods.goodsUnit) : goods.goodsUnit != null) return false;
        if (goodsVersion != null ? !goodsVersion.equals(goods.goodsVersion) : goods.goodsVersion != null) return false;
        if (goodsGrade != null ? !goodsGrade.equals(goods.goodsGrade) : goods.goodsGrade != null) return false;
        if (goodsDesc != null ? !goodsDesc.equals(goods.goodsDesc) : goods.goodsDesc != null) return false;
        if (goodsWarehouse != null ? !goodsWarehouse.equals(goods.goodsWarehouse) : goods.goodsWarehouse != null)
            return false;
        if (goodsPosition != null ? !goodsPosition.equals(goods.goodsPosition) : goods.goodsPosition != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = goodsId;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsUnit != null ? goodsUnit.hashCode() : 0);
        temp = Double.doubleToLongBits(goodsPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (goodsVersion != null ? goodsVersion.hashCode() : 0);
        result = 31 * result + (goodsGrade != null ? goodsGrade.hashCode() : 0);
        result = 31 * result + (goodsDesc != null ? goodsDesc.hashCode() : 0);
        result = 31 * result + (goodsWarehouse != null ? goodsWarehouse.hashCode() : 0);
        result = 31 * result + (goodsPosition != null ? goodsPosition.hashCode() : 0);
        result = 31 * result + goodsCount;
        return result;
    }
}
