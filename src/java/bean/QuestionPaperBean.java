/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author Mohd Haris Khan
 */
public class QuestionPaperBean {
  private int qid;
  private int catid;
  private String question;
  private String option_a;
  private String option_b;
  private String option_c;
  private String option_d;
  private String answer;
  private String status;

    public QuestionPaperBean() {
    }

    public QuestionPaperBean(int qid, int catid, String question, String option_a, String option_b, String option_c, String option_d, String answer, String status) {
        this.qid = qid;
        this.catid = catid;
        this.question = question;
        this.option_a = option_a;
        this.option_b = option_b;
        this.option_c = option_c;
        this.option_d = option_d;
        this.answer = answer;
        this.status = status;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption_a() {
        return option_a;
    }

    public void setOption_a(String option_a) {
        this.option_a = option_a;
    }

    public String getOption_b() {
        return option_b;
    }

    public void setOption_b(String option_b) {
        this.option_b = option_b;
    }

    public String getOption_c() {
        return option_c;
    }

    public void setOption_c(String option_c) {
        this.option_c = option_c;
    }

    public String getOption_d() {
        return option_d;
    }

    public void setOption_d(String option_d) {
        this.option_d = option_d;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.qid;
        hash = 13 * hash + this.catid;
        hash = 13 * hash + Objects.hashCode(this.question);
        hash = 13 * hash + Objects.hashCode(this.option_a);
        hash = 13 * hash + Objects.hashCode(this.option_b);
        hash = 13 * hash + Objects.hashCode(this.option_c);
        hash = 13 * hash + Objects.hashCode(this.option_d);
        hash = 13 * hash + Objects.hashCode(this.answer);
        hash = 13 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionPaperBean other = (QuestionPaperBean) obj;
        if (this.qid != other.qid) {
            return false;
        }
        if (this.catid != other.catid) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.option_a, other.option_a)) {
            return false;
        }
        if (!Objects.equals(this.option_b, other.option_b)) {
            return false;
        }
        if (!Objects.equals(this.option_c, other.option_c)) {
            return false;
        }
        if (!Objects.equals(this.option_d, other.option_d)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionPaper{" + "qid=" + qid + ", catid=" + catid + ", question=" + question + ", option_a=" + option_a + ", option_b=" + option_b + ", option_c=" + option_c + ", option_d=" + option_d + ", answer=" + answer + ", status=" + status + '}';
    }
  
  
    
    
  
}
