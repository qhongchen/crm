package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_data", schema = "crmdb", catalog = "")
public class Data {
    private Integer dataId;
    private String dataType;
    private String dataKey;
    private Integer dataValue;
    private Integer dataEdit;

    @Id
    @Column(name = "data_id", nullable = false)
    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    @Basic
    @Column(name = "data_type", nullable = false, length = 30)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "data_key", nullable = false, length = 30)
    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    @Basic
    @Column(name = "data_value", nullable = false)
    public Integer getDataValue() {
        return dataValue;
    }

    public void setDataValue(Integer dataValue) {
        this.dataValue = dataValue;
    }

    @Basic
    @Column(name = "data_edit", nullable = false)
    public Integer getDataEdit() {
        return dataEdit;
    }

    public void setDataEdit(Integer dataEdit) {
        this.dataEdit = dataEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (dataId != data.dataId) return false;
        if (dataValue != data.dataValue) return false;
        if (dataEdit != data.dataEdit) return false;
        if (dataType != null ? !dataType.equals(data.dataType) : data.dataType != null) return false;
        if (dataKey != null ? !dataKey.equals(data.dataKey) : data.dataKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataId;
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (dataKey != null ? dataKey.hashCode() : 0);
        result = 31 * result + dataValue;
        result = 31 * result + dataEdit;
        return result;
    }
}
