package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_sales_opportunity", schema = "crmdb", catalog = "")
public class SalesOpportunity {
    private Integer salesId;
    private String salesOppoSource;
    private String salesClientName;
    private Integer salesProbability;
    private String salesDesc;
    private String salesPerson;
    private String salesPhone;
    private String salesOppoDesc;
    private Integer salesCreateUserId;
    private String salesCreateTime;
    private Integer salesAllocationStatus;
    private Integer salesAllocationUserId;
    private String salesAllocationTime;
    private Integer salesDevelopStatus;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "sales_id", nullable = false)
    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    @Basic
    @Column(name = "sales_oppo_source", nullable = true, length = 30)
    public String getSalesOppoSource() {
        return salesOppoSource;
    }

    public void setSalesOppoSource(String salesOppoSource) {
        this.salesOppoSource = salesOppoSource;
    }

    @Basic
    @Column(name = "sales_client_name", nullable = false, length = 10)
    public String getSalesClientName() {
        return salesClientName;
    }

    public void setSalesClientName(String salesClientName) {
        this.salesClientName = salesClientName;
    }

    @Basic
    @Column(name = "sales_probability", nullable = false)
    public Integer getSalesProbability() {
        return salesProbability;
    }

    public void setSalesProbability(Integer salesProbability) {
        this.salesProbability = salesProbability;
    }

    @Basic
    @Column(name = "sales_desc", nullable = false, length = 30)
    public String getSalesDesc() {
        return salesDesc;
    }

    public void setSalesDesc(String salesDesc) {
        this.salesDesc = salesDesc;
    }

    @Basic
    @Column(name = "sales_person", nullable = true, length = 10)
    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    @Basic
    @Column(name = "sales_phone", nullable = true, length = 11)
    public String getSalesPhone() {
        return salesPhone;
    }

    public void setSalesPhone(String salesPhone) {
        this.salesPhone = salesPhone;
    }

    @Basic
    @Column(name = "sales_oppo_desc", nullable = false, length = 30)
    public String getSalesOppoDesc() {
        return salesOppoDesc;
    }

    public void setSalesOppoDesc(String salesOppoDesc) {
        this.salesOppoDesc = salesOppoDesc;
    }

    @Basic
    @Column(name = "sales_create_user_id", nullable = false)
    public Integer getSalesCreateUserId() {
        return salesCreateUserId;
    }

    public void setSalesCreateUserId(Integer salesCreateUserId) {
        this.salesCreateUserId = salesCreateUserId;
    }

    @Basic
    @Column(name = "sales_create_time", nullable = false)
    public String getSalesCreateTime() {
        return salesCreateTime;
    }

    public void setSalesCreateTime(String salesCreateTime) {
        this.salesCreateTime = salesCreateTime;
    }

    @Basic
    @Column(name = "sales_allocation_status", nullable = false)
    public Integer getSalesAllocationStatus() {
        return salesAllocationStatus;
    }

    public void setSalesAllocationStatus(Integer salesAllocationStatus) {
        this.salesAllocationStatus = salesAllocationStatus;
    }

    @Basic
    @Column(name = "sales_allocation_user_id", nullable = true)
    public Integer getSalesAllocationUserId() {
        return salesAllocationUserId;
    }

    public void setSalesAllocationUserId(Integer salesAllocationUserId) {
        this.salesAllocationUserId = salesAllocationUserId;
    }

    @Basic
    @Column(name = "sales_allocation_time", nullable = true)
    public String getSalesAllocationTime() {
        return salesAllocationTime;
    }

    public void setSalesAllocationTime(String salesAllocationTime) {
        this.salesAllocationTime = salesAllocationTime;
    }

    @Basic
    @Column(name = "sales_develop_status", nullable = false)
    public Integer getSalesDevelopStatus() {
        return salesDevelopStatus;
    }

    public void setSalesDevelopStatus(Integer salesDevelopStatus) {
        this.salesDevelopStatus = salesDevelopStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesOpportunity that = (SalesOpportunity) o;

        if (salesId != that.salesId) return false;
        if (salesProbability != that.salesProbability) return false;
        if (salesCreateUserId != that.salesCreateUserId) return false;
        if (salesAllocationStatus != that.salesAllocationStatus) return false;
        if (salesDevelopStatus != that.salesDevelopStatus) return false;
        if (salesOppoSource != null ? !salesOppoSource.equals(that.salesOppoSource) : that.salesOppoSource != null)
            return false;
        if (salesClientName != null ? !salesClientName.equals(that.salesClientName) : that.salesClientName != null)
            return false;
        if (salesDesc != null ? !salesDesc.equals(that.salesDesc) : that.salesDesc != null) return false;
        if (salesPerson != null ? !salesPerson.equals(that.salesPerson) : that.salesPerson != null) return false;
        if (salesPhone != null ? !salesPhone.equals(that.salesPhone) : that.salesPhone != null) return false;
        if (salesOppoDesc != null ? !salesOppoDesc.equals(that.salesOppoDesc) : that.salesOppoDesc != null)
            return false;
        if (salesCreateTime != null ? !salesCreateTime.equals(that.salesCreateTime) : that.salesCreateTime != null)
            return false;
        if (salesAllocationUserId != null ? !salesAllocationUserId.equals(that.salesAllocationUserId) : that.salesAllocationUserId != null)
            return false;
        if (salesAllocationTime != null ? !salesAllocationTime.equals(that.salesAllocationTime) : that.salesAllocationTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salesId;
        result = 31 * result + (salesOppoSource != null ? salesOppoSource.hashCode() : 0);
        result = 31 * result + (salesClientName != null ? salesClientName.hashCode() : 0);
        result = 31 * result + salesProbability;
        result = 31 * result + (salesDesc != null ? salesDesc.hashCode() : 0);
        result = 31 * result + (salesPerson != null ? salesPerson.hashCode() : 0);
        result = 31 * result + (salesPhone != null ? salesPhone.hashCode() : 0);
        result = 31 * result + (salesOppoDesc != null ? salesOppoDesc.hashCode() : 0);
        result = 31 * result + salesCreateUserId;
        result = 31 * result + (salesCreateTime != null ? salesCreateTime.hashCode() : 0);
        result = 31 * result + salesAllocationStatus;
        result = 31 * result + (salesAllocationUserId != null ? salesAllocationUserId.hashCode() : 0);
        result = 31 * result + (salesAllocationTime != null ? salesAllocationTime.hashCode() : 0);
        result = 31 * result + salesDevelopStatus;
        return result;
    }

    @Override
    public String toString() {
        return "SalesOpportunity{" +
                "salesId=" + salesId +
                ", salesOppoSource='" + salesOppoSource + '\'' +
                ", salesClientName='" + salesClientName + '\'' +
                ", salesProbability=" + salesProbability +
                ", salesDesc='" + salesDesc + '\'' +
                ", salesPerson='" + salesPerson + '\'' +
                ", salesPhone='" + salesPhone + '\'' +
                ", salesOppoDesc='" + salesOppoDesc + '\'' +
                ", salesCreateUserId=" + salesCreateUserId +
                ", salesCreateTime='" + salesCreateTime + '\'' +
                ", salesAllocationStatus=" + salesAllocationStatus +
                ", salesAllocationUserId=" + salesAllocationUserId +
                ", salesAllocationTime='" + salesAllocationTime + '\'' +
                ", salesDevelopStatus=" + salesDevelopStatus +
                '}';
    }
}
