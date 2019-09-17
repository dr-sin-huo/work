package com.shortrent.myproject.generator.model;

import java.io.Serializable;

/**
 * house
 * @author 
 */
public class House implements Serializable {
    private Integer hId;

    private String hDelocation;

    private String hType;

    private String hRetype;

    private String hArea;

    private String hHutype;

    private String hBatype;

    private String hBedinfo;

    private String hSunum;

    private String hCohabitation;

    private String hSihouse;

    private String hName;

    private String hPedescription;

    private String hInsituation;

    private String hTraffic;

    private String hBeside;

    private String hBath;

    private String hElectro;

    private String hFacilities;

    private String hSpefac;

    private String hRequire;

    private String hPicture;

    private String hPrice;

    private static final long serialVersionUID = 1L;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethDelocation() {
        return hDelocation;
    }

    public void sethDelocation(String hDelocation) {
        this.hDelocation = hDelocation;
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType;
    }

    public String gethRetype() {
        return hRetype;
    }

    public void sethRetype(String hRetype) {
        this.hRetype = hRetype;
    }

    public String gethArea() {
        return hArea;
    }

    public void sethArea(String hArea) {
        this.hArea = hArea;
    }

    public String gethHutype() {
        return hHutype;
    }

    public void sethHutype(String hHutype) {
        this.hHutype = hHutype;
    }

    public String gethBatype() {
        return hBatype;
    }

    public void sethBatype(String hBatype) {
        this.hBatype = hBatype;
    }

    public String gethBedinfo() {
        return hBedinfo;
    }

    public void sethBedinfo(String hBedinfo) {
        this.hBedinfo = hBedinfo;
    }

    public String gethSunum() {
        return hSunum;
    }

    public void sethSunum(String hSunum) {
        this.hSunum = hSunum;
    }

    public String gethCohabitation() {
        return hCohabitation;
    }

    public void sethCohabitation(String hCohabitation) {
        this.hCohabitation = hCohabitation;
    }

    public String gethSihouse() {
        return hSihouse;
    }

    public void sethSihouse(String hSihouse) {
        this.hSihouse = hSihouse;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethPedescription() {
        return hPedescription;
    }

    public void sethPedescription(String hPedescription) {
        this.hPedescription = hPedescription;
    }

    public String gethInsituation() {
        return hInsituation;
    }

    public void sethInsituation(String hInsituation) {
        this.hInsituation = hInsituation;
    }

    public String gethTraffic() {
        return hTraffic;
    }

    public void sethTraffic(String hTraffic) {
        this.hTraffic = hTraffic;
    }

    public String gethBeside() {
        return hBeside;
    }

    public void sethBeside(String hBeside) {
        this.hBeside = hBeside;
    }

    public String gethBath() {
        return hBath;
    }

    public void sethBath(String hBath) {
        this.hBath = hBath;
    }

    public String gethElectro() {
        return hElectro;
    }

    public void sethElectro(String hElectro) {
        this.hElectro = hElectro;
    }

    public String gethFacilities() {
        return hFacilities;
    }

    public void sethFacilities(String hFacilities) {
        this.hFacilities = hFacilities;
    }

    public String gethSpefac() {
        return hSpefac;
    }

    public void sethSpefac(String hSpefac) {
        this.hSpefac = hSpefac;
    }

    public String gethRequire() {
        return hRequire;
    }

    public void sethRequire(String hRequire) {
        this.hRequire = hRequire;
    }

    public String gethPicture() {
        return hPicture;
    }

    public void sethPicture(String hPicture) {
        this.hPicture = hPicture;
    }

    public String gethPrice() {
        return hPrice;
    }

    public void sethPrice(String hPrice) {
        this.hPrice = hPrice;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        House other = (House) that;
        return (this.gethId() == null ? other.gethId() == null : this.gethId().equals(other.gethId()))
            && (this.gethDelocation() == null ? other.gethDelocation() == null : this.gethDelocation().equals(other.gethDelocation()))
            && (this.gethType() == null ? other.gethType() == null : this.gethType().equals(other.gethType()))
            && (this.gethRetype() == null ? other.gethRetype() == null : this.gethRetype().equals(other.gethRetype()))
            && (this.gethArea() == null ? other.gethArea() == null : this.gethArea().equals(other.gethArea()))
            && (this.gethHutype() == null ? other.gethHutype() == null : this.gethHutype().equals(other.gethHutype()))
            && (this.gethBatype() == null ? other.gethBatype() == null : this.gethBatype().equals(other.gethBatype()))
            && (this.gethBedinfo() == null ? other.gethBedinfo() == null : this.gethBedinfo().equals(other.gethBedinfo()))
            && (this.gethSunum() == null ? other.gethSunum() == null : this.gethSunum().equals(other.gethSunum()))
            && (this.gethCohabitation() == null ? other.gethCohabitation() == null : this.gethCohabitation().equals(other.gethCohabitation()))
            && (this.gethSihouse() == null ? other.gethSihouse() == null : this.gethSihouse().equals(other.gethSihouse()))
            && (this.gethName() == null ? other.gethName() == null : this.gethName().equals(other.gethName()))
            && (this.gethPedescription() == null ? other.gethPedescription() == null : this.gethPedescription().equals(other.gethPedescription()))
            && (this.gethInsituation() == null ? other.gethInsituation() == null : this.gethInsituation().equals(other.gethInsituation()))
            && (this.gethTraffic() == null ? other.gethTraffic() == null : this.gethTraffic().equals(other.gethTraffic()))
            && (this.gethBeside() == null ? other.gethBeside() == null : this.gethBeside().equals(other.gethBeside()))
            && (this.gethBath() == null ? other.gethBath() == null : this.gethBath().equals(other.gethBath()))
            && (this.gethElectro() == null ? other.gethElectro() == null : this.gethElectro().equals(other.gethElectro()))
            && (this.gethFacilities() == null ? other.gethFacilities() == null : this.gethFacilities().equals(other.gethFacilities()))
            && (this.gethSpefac() == null ? other.gethSpefac() == null : this.gethSpefac().equals(other.gethSpefac()))
            && (this.gethRequire() == null ? other.gethRequire() == null : this.gethRequire().equals(other.gethRequire()))
            && (this.gethPicture() == null ? other.gethPicture() == null : this.gethPicture().equals(other.gethPicture()))
            && (this.gethPrice() == null ? other.gethPrice() == null : this.gethPrice().equals(other.gethPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gethId() == null) ? 0 : gethId().hashCode());
        result = prime * result + ((gethDelocation() == null) ? 0 : gethDelocation().hashCode());
        result = prime * result + ((gethType() == null) ? 0 : gethType().hashCode());
        result = prime * result + ((gethRetype() == null) ? 0 : gethRetype().hashCode());
        result = prime * result + ((gethArea() == null) ? 0 : gethArea().hashCode());
        result = prime * result + ((gethHutype() == null) ? 0 : gethHutype().hashCode());
        result = prime * result + ((gethBatype() == null) ? 0 : gethBatype().hashCode());
        result = prime * result + ((gethBedinfo() == null) ? 0 : gethBedinfo().hashCode());
        result = prime * result + ((gethSunum() == null) ? 0 : gethSunum().hashCode());
        result = prime * result + ((gethCohabitation() == null) ? 0 : gethCohabitation().hashCode());
        result = prime * result + ((gethSihouse() == null) ? 0 : gethSihouse().hashCode());
        result = prime * result + ((gethName() == null) ? 0 : gethName().hashCode());
        result = prime * result + ((gethPedescription() == null) ? 0 : gethPedescription().hashCode());
        result = prime * result + ((gethInsituation() == null) ? 0 : gethInsituation().hashCode());
        result = prime * result + ((gethTraffic() == null) ? 0 : gethTraffic().hashCode());
        result = prime * result + ((gethBeside() == null) ? 0 : gethBeside().hashCode());
        result = prime * result + ((gethBath() == null) ? 0 : gethBath().hashCode());
        result = prime * result + ((gethElectro() == null) ? 0 : gethElectro().hashCode());
        result = prime * result + ((gethFacilities() == null) ? 0 : gethFacilities().hashCode());
        result = prime * result + ((gethSpefac() == null) ? 0 : gethSpefac().hashCode());
        result = prime * result + ((gethRequire() == null) ? 0 : gethRequire().hashCode());
        result = prime * result + ((gethPicture() == null) ? 0 : gethPicture().hashCode());
        result = prime * result + ((gethPrice() == null) ? 0 : gethPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hId=").append(hId);
        sb.append(", hDelocation=").append(hDelocation);
        sb.append(", hType=").append(hType);
        sb.append(", hRetype=").append(hRetype);
        sb.append(", hArea=").append(hArea);
        sb.append(", hHutype=").append(hHutype);
        sb.append(", hBatype=").append(hBatype);
        sb.append(", hBedinfo=").append(hBedinfo);
        sb.append(", hSunum=").append(hSunum);
        sb.append(", hCohabitation=").append(hCohabitation);
        sb.append(", hSihouse=").append(hSihouse);
        sb.append(", hName=").append(hName);
        sb.append(", hPedescription=").append(hPedescription);
        sb.append(", hInsituation=").append(hInsituation);
        sb.append(", hTraffic=").append(hTraffic);
        sb.append(", hBeside=").append(hBeside);
        sb.append(", hBath=").append(hBath);
        sb.append(", hElectro=").append(hElectro);
        sb.append(", hFacilities=").append(hFacilities);
        sb.append(", hSpefac=").append(hSpefac);
        sb.append(", hRequire=").append(hRequire);
        sb.append(", hPicture=").append(hPicture);
        sb.append(", hPrice=").append(hPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}