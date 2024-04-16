package hw9.md2html;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Writer {
    BufferedWriter writer;

    Writer(String fileIn) throws IOException {
        writer = Files.newBufferedWriter(Path.of(fileIn));
    }

    void write(List<String> strings) throws IOException {
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            writer.write(str);
            writer.newLine();
        }
        writer.close();
    }
}
