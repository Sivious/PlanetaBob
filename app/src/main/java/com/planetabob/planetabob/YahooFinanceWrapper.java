package com.planetabob.planetabob;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Created by jcpenuela on 12/07/15.
 */
public class YahooFinanceWrapper {

    private Map<String, List<String>> simbolos;

    YahooFinanceWrapper() {
    }

    public static Stock get(String symbol) throws IOException {
        return YahooFinance.get(symbol);
    }

    public static Stock get(String symbol, boolean b) throws IOException{
        return YahooFinance.get(symbol, b);
    }

    public static Map<String,Stock> get(String[] symbols, boolean includeHistorical) throws IOException{
        return YahooFinance.get(symbols, includeHistorical);
    }

    public static Map<String,Stock> get(String[] symbols, Calendar from) throws IOException{
        return YahooFinance.get(symbols, from);
    }

    public static Map<String,Stock> get(String[] symbols, Calendar from, Calendar to) throws IOException{
        return YahooFinance.get(symbols, from, to);
    }


}
