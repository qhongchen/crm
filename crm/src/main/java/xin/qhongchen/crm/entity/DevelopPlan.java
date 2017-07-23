package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_develop_plan", schema = "crmdb", catalog = "")
public class DevelopPlan {
    private Integer planId;
    private String planTime;
    private String planContent;
    private Integer planSalesId;
    private String planDevelop;

    @Id
    @Column(name = "plan_id", nullable = false)
    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "plan_time", nullable = false)
    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    @Basic
    @Column(name = "plan_content", nullable = false, length = 30)
    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    @Basic
    @Column(name = "plan_sales_id", nullable = false)
    public Integer getPlanSalesId() {
        return planSalesId;
    }

    public void setPlanSalesId(Integer planSalesId) {
        this.planSalesId = planSalesId;
    }

    @Basic
    @Column(name = "plan_develop", nullable = true, length = 30)
    public String getPlanDevelop() {
        return planDevelop;
    }

    public void setPlanDevelop(String planDevelop) {
        this.planDevelop = planDevelop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DevelopPlan that = (DevelopPlan) o;

        if (planId != that.planId) return false;
        if (planSalesId != that.planSalesId) return false;
        if (planTime != null ? !planTime.equals(that.planTime) : that.planTime != null) return false;
        if (planContent != null ? !planContent.equals(that.planContent) : that.planContent != null) return false;
        if (planDevelop != null ? !planDevelop.equals(that.planDevelop) : that.planDevelop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = planId;
        result = 31 * result + (planTime != null ? planTime.hashCode() : 0);
        result = 31 * result + (planContent != null ? planContent.hashCode() : 0);
        result = 31 * result + planSalesId;
        result = 31 * result + (planDevelop != null ? planDevelop.hashCode() : 0);
        return result;
    }
}
