package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_loss", schema = "crmdb", catalog = "")
public class Loss {
    private Integer lossId;
    private Integer lossStatus;
    private String lossLast;
    private String lossTime;
    private String lossMeasures;
    private String lossReason;
    private Integer lossClientId;
    private Integer lossUserId;

    @Id
    @Column(name = "loss_id", nullable = false)
    public Integer getLossId() {
        return lossId;
    }

    public void setLossId(Integer lossId) {
        this.lossId = lossId;
    }

    @Basic
    @Column(name = "loss_status", nullable = false)
    public Integer getLossStatus() {
        return lossStatus;
    }

    public void setLossStatus(Integer lossStatus) {
        this.lossStatus = lossStatus;
    }

    @Basic
    @Column(name = "loss_last", nullable = false)
    public String getLossLast() {
        return lossLast;
    }

    public void setLossLast(String lossLast) {
        this.lossLast = lossLast;
    }

    @Basic
    @Column(name = "loss_time", nullable = true)
    public String getLossTime() {
        return lossTime;
    }

    public void setLossTime(String lossTime) {
        this.lossTime = lossTime;
    }

    @Basic
    @Column(name = "loss_measures", nullable = true, length = 50)
    public String getLossMeasures() {
        return lossMeasures;
    }

    public void setLossMeasures(String lossMeasures) {
        this.lossMeasures = lossMeasures;
    }

    @Basic
    @Column(name = "loss_reason", nullable = true, length = 50)
    public String getLossReason() {
        return lossReason;
    }

    public void setLossReason(String lossReason) {
        this.lossReason = lossReason;
    }

    @Basic
    @Column(name = "loss_client_id", nullable = false)
    public Integer getLossClientId() {
        return lossClientId;
    }

    public void setLossClientId(Integer lossClientId) {
        this.lossClientId = lossClientId;
    }

    @Basic
    @Column(name = "loss_user_id", nullable = false)
    public Integer getLossUserId() {
        return lossUserId;
    }

    public void setLossUserId(Integer lossUserId) {
        this.lossUserId = lossUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Loss loss = (Loss) o;

        if (lossId != loss.lossId) return false;
        if (lossStatus != loss.lossStatus) return false;
        if (lossClientId != loss.lossClientId) return false;
        if (lossUserId != loss.lossUserId) return false;
        if (lossLast != null ? !lossLast.equals(loss.lossLast) : loss.lossLast != null) return false;
        if (lossTime != null ? !lossTime.equals(loss.lossTime) : loss.lossTime != null) return false;
        if (lossMeasures != null ? !lossMeasures.equals(loss.lossMeasures) : loss.lossMeasures != null) return false;
        if (lossReason != null ? !lossReason.equals(loss.lossReason) : loss.lossReason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lossId;
        result = 31 * result + lossStatus;
        result = 31 * result + (lossLast != null ? lossLast.hashCode() : 0);
        result = 31 * result + (lossTime != null ? lossTime.hashCode() : 0);
        result = 31 * result + (lossMeasures != null ? lossMeasures.hashCode() : 0);
        result = 31 * result + (lossReason != null ? lossReason.hashCode() : 0);
        result = 31 * result + lossClientId;
        result = 31 * result + lossUserId;
        return result;
    }
}
