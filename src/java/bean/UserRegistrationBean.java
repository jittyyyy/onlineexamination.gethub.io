package bean;
public class UserRegistrationBean {
        private int userid; 
        private String  name;
        private String	dob;
	private String	gender;
	private String	qualification;
	private String	email;
	private String	password;	
	private String	address;
	private String	city;
	private String	state;
	private String	pincode;
	private String	verifyString;
	private String	usertype;
        private String	regDate;
        private String	status;

    public UserRegistrationBean() {
    }

    public UserRegistrationBean(int userid, String name, String dob, String gender, String qualification, String email, String password, String address, String city, String state, String pincode, String verifyString, String usertype, String regDate, String status) {
        this.userid = userid;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.qualification = qualification;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.verifyString = verifyString;
        this.usertype = usertype;
        this.regDate = regDate;
        this.status = status;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getVerifyString() {
        return verifyString;
    }

    public void setVerifyString(String verifyString) {
        this.verifyString = verifyString;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserRegistrationBean{" + "userid=" + userid + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", qualification=" + qualification + ", email=" + email + ", password=" + password + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", verifyString=" + verifyString + ", usertype=" + usertype + ", regDate=" + regDate + ", status=" + status + '}';
    }
        
        
}
