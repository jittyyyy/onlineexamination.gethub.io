 
package bean;
 
public class ReportBean {
 private int reportid;
 private int testid;
 private int catid;
 private int totalq;
 private int correctans;
 private int wrongans;
 private String email;

    public ReportBean() {
    }

    public ReportBean(int reportid, int testid, int catid, int totalq, int correctans, int wrongans, String email) {
        this.reportid = reportid;
        this.testid = testid;
        this.catid = catid;
        this.totalq = totalq;
        this.correctans = correctans;
        this.wrongans = wrongans;
        this.email = email;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public int getTestid() {
        return testid;
    }

    public void setTestid(int testid) {
        this.testid = testid;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getTotalq() {
        return totalq;
    }

    public void setTotalq(int totalq) {
        this.totalq = totalq;
    }

    public int getCorrectans() {
        return correctans;
    }

    public void setCorrectans(int correctans) {
        this.correctans = correctans;
    }

    public int getWrongans() {
        return wrongans;
    }

    public void setWrongans(int wrongans) {
        this.wrongans = wrongans;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ReportBean{" + "reportid=" + reportid + ", testid=" + testid + ", catid=" + catid + ", totalq=" + totalq + ", correctans=" + correctans + ", wrongans=" + wrongans + ", email=" + email + '}';
    }
 
 
 
}
