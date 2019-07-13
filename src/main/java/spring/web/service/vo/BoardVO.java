package spring.web.service.vo;

public class BoardVO {
    private String eid;
    private String category;
    private String title;
    private String contents;
    private String reg_user;
    private String reg_dttm;
    private String upt_user;
    private String upt_dttm;

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

    public String getReg_user() {
        return reg_user;
    }

    public void setReg_user(String regUser) {
        this.reg_user = regUser;
    }

    public String getReg_dttm() {
        return reg_dttm;
    }

    public void setReg_dttmsetRegDttm(String regDttm) {
        this.reg_dttm = regDttm;
    }

    public String getUpt_user() {
        return upt_user;
    }

    public void setUpt_user(String uptUser) {
        this.upt_user = uptUser;
    }

    public String getUpt_dttm() {
        return upt_dttm;
    }

    public void setUpt_dttm(String uptDttm) {
        this.upt_dttm = uptDttm;
    }

    @Override
    public String toString() {
        return "eid:" + eid
                + ",category:" + category
                + ",title:" + title
                + ",contents:" + contents
                + ",regUser:" + reg_user
                + ",regDttm:" + reg_dttm
                + ",uptUser:" + upt_user
                + ",uptDttm:" + upt_dttm;
    }
}
