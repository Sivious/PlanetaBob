package com.planetabob.planetabob;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Asynchronous wrapper for {@link yahoofinance.YahooFinance}. The methods have the same
 * names and parameters that they do on the original API but with one parameter more at the end.
 * That parameter is the listener which will be called once the API has returned the data.
 */
public class YahooFinanceAsyncWrapper {

    public static void get(String symbol, final YahooFinanceListener listener) {
        get(symbol, false, listener);
    }

    public static void get(String symbol, final Boolean includeHistorical, final YahooFinanceListener listener) {
        AsyncTask<String, Void, Stock> task = new AsyncTask<String, Void, Stock>() {
            @Override
            protected Stock doInBackground(String... params) {
                try {
                    return YahooFinance.get(params[0], includeHistorical);
                } catch (IOException e) {
                    return null;
                }
            }

            @Override
            protected void onPostExecute(Stock stock) {
                if (listener != null) {
                    if (stock != null)
                        listener.gotStock(stock);
                    else
                        listener.onError();
                }
            }
        };
        task.execute(symbol);
    }

    public void get(String[] symbols, final YahooFinanceListener listener) {
        get(symbols, false, listener);
    }

    public static void get(String[] symbols, final Boolean includeHistorical, final YahooFinanceListener listener) {
        AsyncTask<String, Void, Map<String, Stock>> task = new AsyncTask<String, Void, Map<String, Stock>>() {
            @Override
            protected Map<String, Stock> doInBackground(String... params) {
                try {
                    return YahooFinance.get(params, includeHistorical);
                } catch (IOException e) {
                    return null;
                }
            }

            @Override
            protected void onPostExecute(Map<String, Stock> stocks) {
                if (listener != null) {
                    if (stocks != null)
                        listener.gotStocks(stocks);
                    else
                        listener.onError();
                }
            }
        };
        task.execute(symbols);
    }


    /**
     *  Listener class to be used on the calls to the API via this asynchronous wrapper.
     *  Methods needed to be overridden will depend on the called endpoint of the API.
     */
    public static class YahooFinanceListener {
        public void gotStock(Stock stock) {}
        public void gotStocks(Map<String, Stock> stocks) {}
        public void onError() {}
    }
}
