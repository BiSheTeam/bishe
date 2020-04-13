package team.bishe.wms.bean;

/**
 * @ClassName TbrhInfo
 * @Description 业务机构信息表
 * @Author RJ
 * @Date 2020/4/8 15:55
 * @Version 1.0
 **/
public class TbrhInfo {
    /*
     * 机构号
     **/
    private String  brhId;
    /*
     *扩展键
     **/
    private String  subKeyCd;
    /*
     *机构类型
     **/
    private String  brhTypeCd;
    /*
     *机构状态
     **/
    private String  sta;
    /*
     *机构名称
     **/
    private String  brhNm;
    /*
     *机构所在国
     **/
    private String  locNation;
    /*
     *机构所在省份
     **/
    private String  locProv;
    /*
     *机构所属城市
     **/
    private String  locCity;
    /*
     *机构地址
     **/
    private String  addr;
    /*
     *联系人
     **/
    private String  person;
    /*
     *联系电话
     **/
    private String  tel;
    /*
     *联系电子邮件
     **/
    private String  email;
    /*
     *紧急联系人
     **/
    private String  emContact;
    /*
     *紧急联系电话
     **/
    private String  emTel;
    /*
     *证件类型
     **/
    private String  idType;
    /*
     *机构创建日期
     **/
    private String  crtDt;
    /*
     *最后修改机构号
     **/
    private String  lastUpdBrhId;
    /*
     *最后修改操作员
     **/
    private String  lastUpdOprId;
    /*
     *最后修改交易名
     **/
    private String  lastUpdTxnCd;
    /*
     *最后修改时间
     **/
    private String  lastUpdTs;

    public String getBrhId() {
        return brhId;
    }

    public void setBrhId(String brhId) {
        this.brhId = brhId;
    }

    public String getSubKeyCd() {
        return subKeyCd;
    }

    public void setSubKeyCd(String subKeyCd) {
        this.subKeyCd = subKeyCd;
    }

    public String getBrhTypeCd() {
        return brhTypeCd;
    }

    public void setBrhTypeCd(String brhTypeCd) {
        this.brhTypeCd = brhTypeCd;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getBrhNm() {
        return brhNm;
    }

    public void setBrhNm(String brhNm) {
        this.brhNm = brhNm;
    }

    public String getLocNation() {
        return locNation;
    }

    public void setLocNation(String locNation) {
        this.locNation = locNation;
    }

    public String getLocProv() {
        return locProv;
    }

    public void setLocProv(String locProv) {
        this.locProv = locProv;
    }

    public String getLocCity() {
        return locCity;
    }

    public void setLocCity(String locCity) {
        this.locCity = locCity;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmContact() {
        return emContact;
    }

    public void setEmContact(String emContact) {
        this.emContact = emContact;
    }

    public String getEmTel() {
        return emTel;
    }

    public void setEmTel(String emTel) {
        this.emTel = emTel;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public String getLastUpdBrhId() {
        return lastUpdBrhId;
    }

    public void setLastUpdBrhId(String lastUpdBrhId) {
        this.lastUpdBrhId = lastUpdBrhId;
    }

    public String getLastUpdOprId() {
        return lastUpdOprId;
    }

    public void setLastUpdOprId(String lastUpdOprId) {
        this.lastUpdOprId = lastUpdOprId;
    }

    public String getLastUpdTxnCd() {
        return lastUpdTxnCd;
    }

    public void setLastUpdTxnCd(String lastUpdTxnCd) {
        this.lastUpdTxnCd = lastUpdTxnCd;
    }

    public String getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(String lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }
}
