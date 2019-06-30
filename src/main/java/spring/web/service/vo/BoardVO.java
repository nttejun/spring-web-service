package spring.web.service.vo;

public class BoardVO {
    private String eid;
    private String category;
    private String title;
    private String contents;
    private String regUser;
    private String regDttm;
    private String uptUser;
    private String uptDttm;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getRegUser() {
        return regUser;
    }

    public void setRegUser(String regUser) {
        this.regUser = regUser;
    }

    public String getRegDttm() {
        return regDttm;
    }

    public void setRegDttm(String regDttm) {
        this.regDttm = regDttm;
    }

    public String getUptUser() {
        return uptUser;
    }

    public void setUptUser(String uptUser) {
        this.uptUser = uptUser;
    }

    public String getUptDttm() {
        return uptDttm;
    }

    public void setUptDttm(String uptDttm) {
        this.uptDttm = uptDttm;
    }

    @Override
    public String toString() {
        return "eid:" + eid
                + ",category:" + category
                + ",title:" + title
                + ",contents:" + contents
                + ",regUser:" + regUser
                + ",regDttm:" + regDttm
                + ",uptUser:" + uptUser
                + ",uptDttm:" + uptDttm;
    }
}
