package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_service", schema = "crmdb", catalog = "")
public class Service {
    private Integer serviceId;
    private Integer serviceType;
    private String serviceOutline;
    private Integer serviceStatus;
    private String serviceRequest;
    private Integer serviceClientId;
    private Integer serviceCreateUserId;
    private String serviceCreateTime;
    private Integer serviceAllocationUserId;
    private String serviceAllocationTime;
    private Integer serviceDealUserId;
    private String serviceDealTime;
    private String serviceDeal;
    private String serviceResult;
    private Integer serviceSatisfaction;

    @Id
    @Column(name = "service_id", nullable = false)
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "service_type", nullable = false)
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "service_outline", nullable = false, length = 50)
    public String getServiceOutline() {
        return serviceOutline;
    }

    public void setServiceOutline(String serviceOutline) {
        this.serviceOutline = serviceOutline;
    }

    @Basic
    @Column(name = "service_status", nullable = false)
    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    @Basic
    @Column(name = "service_request", nullable = false, length = 50)
    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    @Basic
    @Column(name = "service_client_id", nullable = false)
    public Integer getServiceClientId() {
        return serviceClientId;
    }

    public void setServiceClientId(Integer serviceClientId) {
        this.serviceClientId = serviceClientId;
    }

    @Basic
    @Column(name = "service_create_user_id", nullable = false)
    public Integer getServiceCreateUserId() {
        return serviceCreateUserId;
    }

    public void setServiceCreateUserId(Integer serviceCreateUserId) {
        this.serviceCreateUserId = serviceCreateUserId;
    }

    @Basic
    @Column(name = "service_create_time", nullable = false)
    public String getServiceCreateTime() {
        return serviceCreateTime;
    }

    public void setServiceCreateTime(String serviceCreateTime) {
        this.serviceCreateTime = serviceCreateTime;
    }

    @Basic
    @Column(name = "service_allocation_user_id", nullable = true)
    public Integer getServiceAllocationUserId() {
        return serviceAllocationUserId;
    }

    public void setServiceAllocationUserId(Integer serviceAllocationUserId) {
        this.serviceAllocationUserId = serviceAllocationUserId;
    }

    @Basic
    @Column(name = "service_allocation_time", nullable = true)
    public String getServiceAllocationTime() {
        return serviceAllocationTime;
    }

    public void setServiceAllocationTime(String serviceAllocationTime) {
        this.serviceAllocationTime = serviceAllocationTime;
    }

    @Basic
    @Column(name = "service_deal_user_id", nullable = true)
    public Integer getServiceDealUserId() {
        return serviceDealUserId;
    }

    public void setServiceDealUserId(Integer serviceDealUserId) {
        this.serviceDealUserId = serviceDealUserId;
    }

    @Basic
    @Column(name = "service_deal_time", nullable = true)
    public String getServiceDealTime() {
        return serviceDealTime;
    }

    public void setServiceDealTime(String serviceDealTime) {
        this.serviceDealTime = serviceDealTime;
    }

    @Basic
    @Column(name = "service_deal", nullable = true, length = 50)
    public String getServiceDeal() {
        return serviceDeal;
    }

    public void setServiceDeal(String serviceDeal) {
        this.serviceDeal = serviceDeal;
    }

    @Basic
    @Column(name = "service_result", nullable = true, length = 50)
    public String getServiceResult() {
        return serviceResult;
    }

    public void setServiceResult(String serviceResult) {
        this.serviceResult = serviceResult;
    }

    @Basic
    @Column(name = "service_satisfaction", nullable = true)
    public Integer getServiceSatisfaction() {
        return serviceSatisfaction;
    }

    public void setServiceSatisfaction(Integer serviceSatisfaction) {
        this.serviceSatisfaction = serviceSatisfaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (serviceId != service.serviceId) return false;
        if (serviceType != service.serviceType) return false;
        if (serviceStatus != service.serviceStatus) return false;
        if (serviceClientId != service.serviceClientId) return false;
        if (serviceCreateUserId != service.serviceCreateUserId) return false;
        if (serviceOutline != null ? !serviceOutline.equals(service.serviceOutline) : service.serviceOutline != null)
            return false;
        if (serviceRequest != null ? !serviceRequest.equals(service.serviceRequest) : service.serviceRequest != null)
            return false;
        if (serviceCreateTime != null ? !serviceCreateTime.equals(service.serviceCreateTime) : service.serviceCreateTime != null)
            return false;
        if (serviceAllocationUserId != null ? !serviceAllocationUserId.equals(service.serviceAllocationUserId) : service.serviceAllocationUserId != null)
            return false;
        if (serviceAllocationTime != null ? !serviceAllocationTime.equals(service.serviceAllocationTime) : service.serviceAllocationTime != null)
            return false;
        if (serviceDealUserId != null ? !serviceDealUserId.equals(service.serviceDealUserId) : service.serviceDealUserId != null)
            return false;
        if (serviceDealTime != null ? !serviceDealTime.equals(service.serviceDealTime) : service.serviceDealTime != null)
            return false;
        if (serviceDeal != null ? !serviceDeal.equals(service.serviceDeal) : service.serviceDeal != null) return false;
        if (serviceResult != null ? !serviceResult.equals(service.serviceResult) : service.serviceResult != null)
            return false;
        if (serviceSatisfaction != null ? !serviceSatisfaction.equals(service.serviceSatisfaction) : service.serviceSatisfaction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceId;
        result = 31 * result + serviceType;
        result = 31 * result + (serviceOutline != null ? serviceOutline.hashCode() : 0);
        result = 31 * result + serviceStatus;
        result = 31 * result + (serviceRequest != null ? serviceRequest.hashCode() : 0);
        result = 31 * result + serviceClientId;
        result = 31 * result + serviceCreateUserId;
        result = 31 * result + (serviceCreateTime != null ? serviceCreateTime.hashCode() : 0);
        result = 31 * result + (serviceAllocationUserId != null ? serviceAllocationUserId.hashCode() : 0);
        result = 31 * result + (serviceAllocationTime != null ? serviceAllocationTime.hashCode() : 0);
        result = 31 * result + (serviceDealUserId != null ? serviceDealUserId.hashCode() : 0);
        result = 31 * result + (serviceDealTime != null ? serviceDealTime.hashCode() : 0);
        result = 31 * result + (serviceDeal != null ? serviceDeal.hashCode() : 0);
        result = 31 * result + (serviceResult != null ? serviceResult.hashCode() : 0);
        result = 31 * result + (serviceSatisfaction != null ? serviceSatisfaction.hashCode() : 0);
        return result;
    }
}
