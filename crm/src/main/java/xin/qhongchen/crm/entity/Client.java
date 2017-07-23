package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_client", schema = "crmdb", catalog = "")
public class Client {
    private Integer clientId;
    private Integer clientStatus;
    private String clientName;
    private String clientArea;
    private Integer clientUserId;
    private Integer clientGrade;
    private Integer clientCradit;
    private Integer clientSatisfaction;
    private String clientAddr;
    private String clientCode;
    private String clientPhone;
    private String clientFax;
    private String clientWeb;
    private String clientLicense;
    private String clientLegal;
    private Integer clientRegisterMoney;
    private Integer clientAnnualSales;
    private String clientBank;
    private String clientBankNumber;
    private String clientLocalTax;
    private String clientStateTax;

    @Id
    @Column(name = "client_id", nullable = false)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "client_status", nullable = false)
    public Integer getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    @Basic
    @Column(name = "client_name", nullable = false, length = 10)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "client_area", nullable = false, length = 30)
    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea;
    }

    @Basic
    @Column(name = "client_user_id", nullable = false)
    public Integer getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(Integer clientUserId) {
        this.clientUserId = clientUserId;
    }

    @Basic
    @Column(name = "client_grade", nullable = false)
    public Integer getClientGrade() {
        return clientGrade;
    }

    public void setClientGrade(Integer clientGrade) {
        this.clientGrade = clientGrade;
    }

    @Basic
    @Column(name = "client_cradit", nullable = false)
    public Integer getClientCradit() {
        return clientCradit;
    }

    public void setClientCradit(Integer clientCradit) {
        this.clientCradit = clientCradit;
    }

    @Basic
    @Column(name = "client_satisfaction", nullable = false)
    public Integer getClientSatisfaction() {
        return clientSatisfaction;
    }

    public void setClientSatisfaction(Integer clientSatisfaction) {
        this.clientSatisfaction = clientSatisfaction;
    }

    @Basic
    @Column(name = "client_addr", nullable = false, length = 30)
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    @Basic
    @Column(name = "client_code", nullable = false, length = 6)
    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @Basic
    @Column(name = "client_phone", nullable = false, length = 11)
    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Basic
    @Column(name = "client_fax", nullable = false, length = 11)
    public String getClientFax() {
        return clientFax;
    }

    public void setClientFax(String clientFax) {
        this.clientFax = clientFax;
    }

    @Basic
    @Column(name = "client_web", nullable = false, length = 30)
    public String getClientWeb() {
        return clientWeb;
    }

    public void setClientWeb(String clientWeb) {
        this.clientWeb = clientWeb;
    }

    @Basic
    @Column(name = "client_license", nullable = true, length = 10)
    public String getClientLicense() {
        return clientLicense;
    }

    public void setClientLicense(String clientLicense) {
        this.clientLicense = clientLicense;
    }

    @Basic
    @Column(name = "client_legal", nullable = false, length = 10)
    public String getClientLegal() {
        return clientLegal;
    }

    public void setClientLegal(String clientLegal) {
        this.clientLegal = clientLegal;
    }

    @Basic
    @Column(name = "client_register_money", nullable = true, precision = 2)
    public Integer getClientRegisterMoney() {
        return clientRegisterMoney;
    }

    public void setClientRegisterMoney(Integer clientRegisterMoney) {
        this.clientRegisterMoney = clientRegisterMoney;
    }

    @Basic
    @Column(name = "client_annual_sales", nullable = true, precision = 2)
    public Integer getClientAnnualSales() {
        return clientAnnualSales;
    }

    public void setClientAnnualSales(Integer clientAnnualSales) {
        this.clientAnnualSales = clientAnnualSales;
    }

    @Basic
    @Column(name = "client_bank", nullable = false, length = 30)
    public String getClientBank() {
        return clientBank;
    }

    public void setClientBank(String clientBank) {
        this.clientBank = clientBank;
    }

    @Basic
    @Column(name = "client_bank_number", nullable = false, length = 19)
    public String getClientBankNumber() {
        return clientBankNumber;
    }

    public void setClientBankNumber(String clientBankNumber) {
        this.clientBankNumber = clientBankNumber;
    }

    @Basic
    @Column(name = "client_local_tax", nullable = true, length = 10)
    public String getClientLocalTax() {
        return clientLocalTax;
    }

    public void setClientLocalTax(String clientLocalTax) {
        this.clientLocalTax = clientLocalTax;
    }

    @Basic
    @Column(name = "client_state_tax", nullable = true, length = 10)
    public String getClientStateTax() {
        return clientStateTax;
    }

    public void setClientStateTax(String clientStateTax) {
        this.clientStateTax = clientStateTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != client.clientId) return false;
        if (clientStatus != client.clientStatus) return false;
        if (clientUserId != client.clientUserId) return false;
        if (clientGrade != client.clientGrade) return false;
        if (clientCradit != client.clientCradit) return false;
        if (clientSatisfaction != client.clientSatisfaction) return false;
        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        if (clientArea != null ? !clientArea.equals(client.clientArea) : client.clientArea != null) return false;
        if (clientAddr != null ? !clientAddr.equals(client.clientAddr) : client.clientAddr != null) return false;
        if (clientCode != null ? !clientCode.equals(client.clientCode) : client.clientCode != null) return false;
        if (clientPhone != null ? !clientPhone.equals(client.clientPhone) : client.clientPhone != null) return false;
        if (clientFax != null ? !clientFax.equals(client.clientFax) : client.clientFax != null) return false;
        if (clientWeb != null ? !clientWeb.equals(client.clientWeb) : client.clientWeb != null) return false;
        if (clientLicense != null ? !clientLicense.equals(client.clientLicense) : client.clientLicense != null)
            return false;
        if (clientLegal != null ? !clientLegal.equals(client.clientLegal) : client.clientLegal != null) return false;
        if (clientRegisterMoney != null ? !clientRegisterMoney.equals(client.clientRegisterMoney) : client.clientRegisterMoney != null)
            return false;
        if (clientAnnualSales != null ? !clientAnnualSales.equals(client.clientAnnualSales) : client.clientAnnualSales != null)
            return false;
        if (clientBank != null ? !clientBank.equals(client.clientBank) : client.clientBank != null) return false;
        if (clientBankNumber != null ? !clientBankNumber.equals(client.clientBankNumber) : client.clientBankNumber != null)
            return false;
        if (clientLocalTax != null ? !clientLocalTax.equals(client.clientLocalTax) : client.clientLocalTax != null)
            return false;
        if (clientStateTax != null ? !clientStateTax.equals(client.clientStateTax) : client.clientStateTax != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientId;
        result = 31 * result + clientStatus;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (clientArea != null ? clientArea.hashCode() : 0);
        result = 31 * result + clientUserId;
        result = 31 * result + clientGrade;
        result = 31 * result + clientCradit;
        result = 31 * result + clientSatisfaction;
        result = 31 * result + (clientAddr != null ? clientAddr.hashCode() : 0);
        result = 31 * result + (clientCode != null ? clientCode.hashCode() : 0);
        result = 31 * result + (clientPhone != null ? clientPhone.hashCode() : 0);
        result = 31 * result + (clientFax != null ? clientFax.hashCode() : 0);
        result = 31 * result + (clientWeb != null ? clientWeb.hashCode() : 0);
        result = 31 * result + (clientLicense != null ? clientLicense.hashCode() : 0);
        result = 31 * result + (clientLegal != null ? clientLegal.hashCode() : 0);
        result = 31 * result + (clientRegisterMoney != null ? clientRegisterMoney.hashCode() : 0);
        result = 31 * result + (clientAnnualSales != null ? clientAnnualSales.hashCode() : 0);
        result = 31 * result + (clientBank != null ? clientBank.hashCode() : 0);
        result = 31 * result + (clientBankNumber != null ? clientBankNumber.hashCode() : 0);
        result = 31 * result + (clientLocalTax != null ? clientLocalTax.hashCode() : 0);
        result = 31 * result + (clientStateTax != null ? clientStateTax.hashCode() : 0);
        return result;
    }
}
