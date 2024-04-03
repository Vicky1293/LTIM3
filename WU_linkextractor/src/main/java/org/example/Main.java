package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.flipkart.com/";

        try {
            // Fetching HTML content of the webpage
            Document document = Jsoup.connect(url).get();

            // Extracting all links using Jsoup
            Elements links = document.select("a[href]");

            // Using for Each loop to print all links
            System.out.println("Using For-Each Loop:");
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }

            // Using Stream and Lambda expression to print all links
            System.out.println("\nUsing Stream and Lambda Expression:");
            links.stream()
                    .map(link -> link.attr("abs:href"))
                    .forEach(System.out::println);

            // Using Parallel Stream and Lambda expression to print all links
            System.out.println("\nUsing Parallel Stream and Lambda Expression:");
            links.parallelStream()
                    .map(link -> link.attr("abs:href"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
