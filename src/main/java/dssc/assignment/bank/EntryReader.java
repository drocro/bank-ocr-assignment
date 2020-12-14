package dssc.assignment.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EntryReader {

    private final List<String> fileLines;
    private int numbOfLines;
    private int entryIndex;
    public EntryReader(Path filePath) throws IOException {
        fileLines = Files.readAllLines(filePath);
        fileLines.add("");//adds the last empty line that is not read on the method just above
        numbOfLines = fileLines.size();
    }
    public boolean isEmpty(){return entryIndex == numbOfLines;}
    public Entry readEntry() {
        if (!this.isEmpty()) {
            Entry newEntry = new Entry(fileLines.get(entryIndex), fileLines.get(entryIndex+1), fileLines.get(entryIndex+2));
            entryIndex += 4;//makes it point to the next entry
            return newEntry;
        }
        ////else return empty entry(BETTER TO THROW AN EXCEPTION?)
        return new Entry("","","");
    }
    public int getNumberOfEntries(){
        return (numbOfLines+1)/4;
    }
}
