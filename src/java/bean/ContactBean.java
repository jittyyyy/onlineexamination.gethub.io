
package bean;

public class ContactBean {
        private int contactId;
        private String name ;
	private String email ;
	private String phone ;
	private String subject ;
	private String message ;
        private String contactDate ;

    public ContactBean() {
    }

    public ContactBean(int contactId, String name, String email, String phone, String subject, String message, String contactDate) {
        this.contactId = contactId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.message = message;
        this.contactDate = contactDate;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    @Override
    public String toString() {
        return "ContactBean{" + "contactId=" + contactId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", subject=" + subject + ", message=" + message + ", contactDate=" + contactDate + '}';
    }
        
        
        
}
