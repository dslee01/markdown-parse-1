import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void parseTest1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));
    }

    @Test
    public void parseTest2() throws IOException {
        Path fileName = Path.of("test-two.md");
        String contents = Files.readString(fileName); 
        assertEquals(null, MarkdownParse.getLinks(contents));
    }

    @Test
    public void parseTest3() throws IOException {
        Path fileName = Path.of("test-three.md");
        String contents = Files.readString(fileName); 
        assertEquals(null, MarkdownParse.getLinks(contents));
    }

    @Test
    public void parseTest4() throws IOException {
        Path fileName = Path.of("test-four.md");
        String contents = Files.readString(fileName); 
        assertEquals(null, MarkdownParse.getLinks(contents));
    }


    
}
