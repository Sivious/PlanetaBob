package com.planetabob.planetabob;

import java.util.Date;

/**
 * Created by jcpenuela on 6/07/15.
 * Lista de indicadores del ticker
 */
public class TickerData {

    static final long serialVersionUID = 700033375075960653L; // Cambiado el UID
    private static long count = 0;
    private long id;
    private Date date;
    private float stockPrice;
    private float ninimum;
    private float maximum;
    private float open;
    private float close;

    public TickerData() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public float getNinimum() {
        return ninimum;
    }

    public void setNinimum(float ninimum) {
        this.ninimum = ninimum;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }
}
