package dssc.assignment.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EntryReader {

    private final List<String> fileLines;
    private int numbOfLines;
    public EntryReader(Path filePath) throws IOException {
        fileLines = Files.readAllLines(filePath);
        numbOfLines = fileLines.size();
    }

    public Entry readEntry() {
        return new Entry(fileLines.get(0), fileLines.get(1), fileLines.get(2));
    }
    public int getNumberOfEntries(){return (numbOfLines+1)/4;}
}
