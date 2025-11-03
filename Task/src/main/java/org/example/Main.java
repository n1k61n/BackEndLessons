package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


class Main {

    static void main() throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\t%s", headline.attr("title"), headline.absUrl("href"));
        }
    }

    static void log(String msg, String... vals) {
        System.out.println(String.format(msg, (Object[]) vals));
    }

}