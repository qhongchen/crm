package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_record", schema = "crmdb", catalog = "")
public class Record {
    private Integer recordId;
    private String recordTime;
    private String recordAddr;
    private String recordOutline;
    private String recordDesc;
    private String recordDetail;
    private Integer recordClientId;

    @Id
    @Column(name = "record_id", nullable = false)
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "record_time", nullable = false)
    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "record_addr", nullable = false, length = 30)
    public String getRecordAddr() {
        return recordAddr;
    }

    public void setRecordAddr(String recordAddr) {
        this.recordAddr = recordAddr;
    }

    @Basic
    @Column(name = "record_outline", nullable = false, length = 30)
    public String getRecordOutline() {
        return recordOutline;
    }

    public void setRecordOutline(String recordOutline) {
        this.recordOutline = recordOutline;
    }

    @Basic
    @Column(name = "record_desc", nullable = true, length = 30)
    public String getRecordDesc() {
        return recordDesc;
    }

    public void setRecordDesc(String recordDesc) {
        this.recordDesc = recordDesc;
    }

    @Basic
    @Column(name = "record_detail", nullable = true, length = 30)
    public String getRecordDetail() {
        return recordDetail;
    }

    public void setRecordDetail(String recordDetail) {
        this.recordDetail = recordDetail;
    }

    @Basic
    @Column(name = "record_client_id", nullable = false)
    public Integer getRecordClientId() {
        return recordClientId;
    }

    public void setRecordClientId(Integer recordClientId) {
        this.recordClientId = recordClientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (recordId != record.recordId) return false;
        if (recordClientId != record.recordClientId) return false;
        if (recordTime != null ? !recordTime.equals(record.recordTime) : record.recordTime != null) return false;
        if (recordAddr != null ? !recordAddr.equals(record.recordAddr) : record.recordAddr != null) return false;
        if (recordOutline != null ? !recordOutline.equals(record.recordOutline) : record.recordOutline != null)
            return false;
        if (recordDesc != null ? !recordDesc.equals(record.recordDesc) : record.recordDesc != null) return false;
        if (recordDetail != null ? !recordDetail.equals(record.recordDetail) : record.recordDetail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId;
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        result = 31 * result + (recordAddr != null ? recordAddr.hashCode() : 0);
        result = 31 * result + (recordOutline != null ? recordOutline.hashCode() : 0);
        result = 31 * result + (recordDesc != null ? recordDesc.hashCode() : 0);
        result = 31 * result + (recordDetail != null ? recordDetail.hashCode() : 0);
        result = 31 * result + recordClientId;
        return result;
    }
}
