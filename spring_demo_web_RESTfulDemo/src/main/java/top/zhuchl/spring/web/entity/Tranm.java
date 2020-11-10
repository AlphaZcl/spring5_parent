package top.zhuchl.spring.web.entity;

/**
 * POJO类，级联属性，请求参数映射类
 *
 * @author zclys
 * @date 2020/11/10 14:12
 */
public class Tranm {

    private String unisocCdtCd;

    private String entNm ;

    private String acctSts;

    public String getUnisocCdtCd() {
        return unisocCdtCd;
    }

    public void setUnisocCdtCd(String unisocCdtCd) {
        this.unisocCdtCd = unisocCdtCd;
    }

    public String getEntNm() {
        return entNm;
    }

    public void setEntNm(String entNm) {
        this.entNm = entNm;
    }

    public String getAcctSts() {
        return acctSts;
    }

    public void setAcctSts(String acctSts) {
        this.acctSts = acctSts;
    }

    @Override
    public String toString() {
        return "Tranm{" +
                "unisocCdtCd='" + unisocCdtCd + '\'' +
                ", entNm='" + entNm + '\'' +
                ", acctSts='" + acctSts + '\'' +
                '}';
    }
}
