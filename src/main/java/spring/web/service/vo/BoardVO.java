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

    @Override
    public String toString() {
        return "eid:" + eid
                + "category:" + category
                + "title:" + title
                + "contents:" + contents
                + "regUser:" + regUser
                + "regDttm:" + regDttm
                + "uptUser:" + uptUser
                + "uptDttm:" + uptDttm;
    }
}
