package midterm2018;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
            + "    “task” : “inc”,\n"
            + "    “num” : 3\n"
            + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host
        System.out.println("\nHost:");
        System.out.println(getHost(question1and2));

        // Question 2
        // return sum of a and b
        System.out.println("\nSum:");
        //System.out.println(totalSum(question1and2));

        // Question 3
        // convert to java object, increment num, convert back to json and return

        // Question 4
        // return unique words
        System.out.println("\nUnique Words:");

        Scanner scan = new Scanner(question4and5);
        HashMap<String, Integer> map = new HashMap<>();
        while (scan.hasNext()) {
            String word = scan.next();
            int countWord = 0;
            if (!map.containsKey(word)) {
                map.put(word, 1);
            }
            else {
                countWord = map.get(word) + 1;
                map.remove(word);
                map.put(word, countWord);
            }
        }

        System.out.println(map.size());

        // Question 5
        // return 2nd most common word

    }

    public static String getHost(String q1and2) {
        String host = q1and2;
        int index = host.indexOf("Host: ");

        if (index != 0) {
            host = host.substring(index + 6);
        }

        index = host.indexOf("\n");

        if (index != -1) {
            host = host.substring(0, index);
        }

        return host;
    }

    /*
    public static int totalSum(String q1and2) {
        String sumString = q1and2;

        int sum = Integer.parseInt(sumString.replaceAll("[\\D]", ""));

        return 0;
    }
    */


}
