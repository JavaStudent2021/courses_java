
/*
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestJavaRush {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file = reader.readLine();
//            file = "d:\\PROJECTS\\Programir\\javarush\\1.txt";
            final String word = args[0];
//            final String word = "span";

            try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                String line;
                StringBuilder sb = new StringBuilder("");
                while ((line = fileReader.readLine())!= null)
                    sb.append(line);
                String text = sb.toString();

            //    Document html = Jsoup.parse(text);

            //    Elements span = html.select(word);
//                while ((span = html.select(word)) != null) {
//
//                }
             //   System.out.println(span);


            }

        }
    }


}
