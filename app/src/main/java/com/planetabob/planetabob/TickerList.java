package com.planetabob.planetabob;

import java.util.ArrayList;
import java.util.List;

public final class TickerList {
    public static final String MARKETS[] = {
            "NYSE",
            "Nasdaq",    // En MainFragment.java establece el número de filas con NUM_ROWS.... si no coinciden, falla la carga de imágenes
            "Madrid"
    };

    public static List<Ticker> list;

    public static List<Ticker> setupTickers() {
        list = new ArrayList<Ticker>();

        String symbol[] = {
                "GOOG",
                "YAHOO",
                "INDX.MC",
                "MSTR",
                "FERR"
        };

        String companyName[] = {
                "Google",
                "YAHOO!",
                "Inditex",
                "Microstrategy",
                "Ferrari"
        };

        String bgImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };
        String cardImageUrl[] = {
                // Internet tiene el emulador, la imagen siguiente la captura correctamente ara incluirla en parrilla
                "http://farm4.static.flickr.com/3221/2658147888_826edc8465.jpg",
                //"http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg"
        };

        list.add(buildTickerInfo(symbol[0],
                companyName[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildTickerInfo(symbol[1],
                companyName[1], cardImageUrl[1], bgImageUrl[1]));
        list.add(buildTickerInfo(symbol[2],
                companyName[2], cardImageUrl[2], bgImageUrl[2]));
        list.add(buildTickerInfo(symbol[3],
                companyName[3], cardImageUrl[3], bgImageUrl[3]));
        list.add(buildTickerInfo(symbol[4],
                companyName[4], cardImageUrl[4], bgImageUrl[4]));

        return list;
    }

    private static Ticker buildTickerInfo(String symbol,
                                        String description,  String cardImageUrl,
                                        String bgImageUrl) {
        Ticker ticker = new Ticker();
        ticker.setId(Ticker.getCount());
        Ticker.incCount();
        ticker.setTicker(symbol);
        ticker.setDescription(description);


        ticker.setCardImageUrl(cardImageUrl);
        ticker.setBackgroundImageUrl(bgImageUrl);
        return ticker;
    }
}
