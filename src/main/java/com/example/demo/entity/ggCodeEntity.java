package com.example.demo.entity;

import java.util.Date;

/**
 * ggcode实体类
 *
 * @author ROG
 * @create 2017-11-20-11:24
 */
public class ggCodeEntity {

    private String CODETYPE;
    private String COMPANYCODE;
    private String CODECODE;
    private String CODECNAME;
    private String CODETNAME;
    private String CODEENAME;
    private String CREATORCODE;
    private Date CREATETIME;
    private Date UPDATETIME;
    private String REMARK;
    private String FLAG;
    private Double DISPLAYNO;
    private String REFERENCE;

    public String getCODETYPE() {
        return CODETYPE;
    }

    public void setCODETYPE(String CODETYPE) {
        this.CODETYPE = CODETYPE;
    }

    public String getCOMPANYCODE() {
        return COMPANYCODE;
    }

    public void setCOMPANYCODE(String COMPANYCODE) {
        this.COMPANYCODE = COMPANYCODE;
    }

    public String getCODECODE() {
        return CODECODE;
    }

    public void setCODECODE(String CODECODE) {
        this.CODECODE = CODECODE;
    }

    public String getCODECNAME() {
        return CODECNAME;
    }

    public void setCODECNAME(String CODECNAME) {
        this.CODECNAME = CODECNAME;
    }

    public String getCODETNAME() {
        return CODETNAME;
    }

    public void setCODETNAME(String CODETNAME) {
        this.CODETNAME = CODETNAME;
    }

    public String getCODEENAME() {
        return CODEENAME;
    }

    public void setCODEENAME(String CODEENAME) {
        this.CODEENAME = CODEENAME;
    }

    public String getCREATORCODE() {
        return CREATORCODE;
    }

    public void setCREATORCODE(String CREATORCODE) {
        this.CREATORCODE = CREATORCODE;
    }

    public Date getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(Date CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public Double getDISPLAYNO() {
        return DISPLAYNO;
    }

    public void setDISPLAYNO(Double DISPLAYNO) {
        this.DISPLAYNO = DISPLAYNO;
    }

    public String getREFERENCE() {
        return REFERENCE;
    }

    public void setREFERENCE(String REFERENCE) {
        this.REFERENCE = REFERENCE;
    }
}
