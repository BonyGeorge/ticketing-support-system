package ticketingsystem;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface IFile {
    public boolean WritingFile()throws IOException;
     public boolean  ReadingFile()throws FileNotFoundException, IOException;
}
