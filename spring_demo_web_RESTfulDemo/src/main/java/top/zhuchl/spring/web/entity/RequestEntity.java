package top.zhuchl.spring.web.entity;

/**
 * POJO类绑定请求参数
 *
 * @author zclys
 * @date 2020/11/10 14:09
 */
public class RequestEntity {

    private String msgid;

    private String comId;

    private String rsvFlg;

    private Tranm copNm;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getRsvFlg() {
        return rsvFlg;
    }

    public void setRsvFlg(String rsvFlg) {
        this.rsvFlg = rsvFlg;
    }

    public Tranm getCopNm() {
        return copNm;
    }

    public void setCopNm(Tranm copNm) {
        this.copNm = copNm;
    }

    @Override
    public String toString() {
        return "RequestEntity{" +
                "msgid='" + msgid + '\'' +
                ", comId='" + comId + '\'' +
                ", rsvFlg='" + rsvFlg + '\'' +
                ", tranm=" + copNm +
                '}';
    }
}
