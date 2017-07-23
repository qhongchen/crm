package xin.qhongchen.crm.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/19
 * Time:   23:19
 */
@Entity
@Table(name = "tbl_contacts", schema = "crmdb", catalog = "")
public class Contacts {
    private Integer contactsId;
    private String contactsName;
    private String contactsSex;
    private String contactsPosition;
    private String contactsOfficePhone;
    private String contactsPhone;
    private String contactsDesc;
    private Integer contactsClientId;

    @Id
    @Column(name = "contacts_id", nullable = false)
    public Integer getContactsId() {
        return contactsId;
    }

    public void setContactsId(Integer contactsId) {
        this.contactsId = contactsId;
    }

    @Basic
    @Column(name = "contacts_name", nullable = false, length = 10)
    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    @Basic
    @Column(name = "contacts_sex", nullable = false, length = 2)
    public String getContactsSex() {
        return contactsSex;
    }

    public void setContactsSex(String contactsSex) {
        this.contactsSex = contactsSex;
    }

    @Basic
    @Column(name = "contacts_position", nullable = false, length = 11)
    public String getContactsPosition() {
        return contactsPosition;
    }

    public void setContactsPosition(String contactsPosition) {
        this.contactsPosition = contactsPosition;
    }

    @Basic
    @Column(name = "contacts_office_phone", nullable = false, length = 11)
    public String getContactsOfficePhone() {
        return contactsOfficePhone;
    }

    public void setContactsOfficePhone(String contactsOfficePhone) {
        this.contactsOfficePhone = contactsOfficePhone;
    }

    @Basic
    @Column(name = "contacts_phone", nullable = true, length = 11)
    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    @Basic
    @Column(name = "contacts_desc", nullable = true, length = 30)
    public String getContactsDesc() {
        return contactsDesc;
    }

    public void setContactsDesc(String contactsDesc) {
        this.contactsDesc = contactsDesc;
    }

    @Basic
    @Column(name = "contacts_client_id", nullable = true)
    public Integer getContactsClientId() {
        return contactsClientId;
    }

    public void setContactsClientId(Integer contactsClientId) {
        this.contactsClientId = contactsClientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (contactsId != contacts.contactsId) return false;
        if (contactsName != null ? !contactsName.equals(contacts.contactsName) : contacts.contactsName != null)
            return false;
        if (contactsSex != null ? !contactsSex.equals(contacts.contactsSex) : contacts.contactsSex != null)
            return false;
        if (contactsPosition != null ? !contactsPosition.equals(contacts.contactsPosition) : contacts.contactsPosition != null)
            return false;
        if (contactsOfficePhone != null ? !contactsOfficePhone.equals(contacts.contactsOfficePhone) : contacts.contactsOfficePhone != null)
            return false;
        if (contactsPhone != null ? !contactsPhone.equals(contacts.contactsPhone) : contacts.contactsPhone != null)
            return false;
        if (contactsDesc != null ? !contactsDesc.equals(contacts.contactsDesc) : contacts.contactsDesc != null)
            return false;
        if (contactsClientId != null ? !contactsClientId.equals(contacts.contactsClientId) : contacts.contactsClientId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactsId;
        result = 31 * result + (contactsName != null ? contactsName.hashCode() : 0);
        result = 31 * result + (contactsSex != null ? contactsSex.hashCode() : 0);
        result = 31 * result + (contactsPosition != null ? contactsPosition.hashCode() : 0);
        result = 31 * result + (contactsOfficePhone != null ? contactsOfficePhone.hashCode() : 0);
        result = 31 * result + (contactsPhone != null ? contactsPhone.hashCode() : 0);
        result = 31 * result + (contactsDesc != null ? contactsDesc.hashCode() : 0);
        result = 31 * result + (contactsClientId != null ? contactsClientId.hashCode() : 0);
        return result;
    }
}
