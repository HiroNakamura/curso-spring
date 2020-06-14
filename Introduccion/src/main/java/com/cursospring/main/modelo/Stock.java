package com.cursospring.main.modelo;

public class Stock implements java.io.Serializable {

	
    private static final long serialVersionUID = 1L;
    private Integer stockId;
	private String stockCode;
	private String stockName;
    private StockDetail stockDetail;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    @Override
    public String toString() {
        return "Stock [stockCode=" + stockCode + ", stockDetail=" + stockDetail + ", stockId=" + stockId
                + ", stockName=" + stockName + "]";
    }

    
}