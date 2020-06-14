package com.cursospring.main.modelo;

import java.util.Date;

public class StockDetail implements java.io.Serializable {
    private static final long serialVersionUID = 2L;

    private Integer stockId;
	private Stock stock;
	private String compName;
	private String compDesc;
	private String remark;
    private Date listedDate;


    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompDesc() {
        return compDesc;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getListedDate() {
        return listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    @Override
    public String toString() {
        return "StockDetail [compDesc=" + compDesc + ", compName=" + compName + ", listedDate=" + listedDate
                + ", remark=" + remark + ", stock=" + stock + ", stockId=" + stockId + "]";
    }
    
    

}