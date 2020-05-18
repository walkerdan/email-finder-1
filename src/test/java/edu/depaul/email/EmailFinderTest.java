package edu.depaul.email;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailFinderTest {

  @Test
  @DisplayName("Test Page Parser")
  void testPageParser() {
    String html = "<html><a href='/some/other/file.html'>my link</a></body></html>";
    Document doc = Jsoup.parse(html);
    PageParser test = new PageParser();
    test.findLinks(doc);
    assertEquals(null,doc.getElementById("my link"));
  }
}
