package hw9.md2html;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Reader {
    BufferedReader reader;

    Reader(String fileIn) throws FileNotFoundException {
        reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileIn),
                        StandardCharsets.UTF_8
                )
        );
    }
    void read(List<String> strings) throws IOException {
        String string;
        while ((string = reader.readLine()) != null) {
            strings.add(string);
        }
        reader.close();
    }
}
