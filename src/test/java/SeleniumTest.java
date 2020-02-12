import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }
    @Test
        public void addRecordTest(){
        Selenium.addRecord("Tadas","Atano","Ignas");
    }
    @Test
        public void badRecordTest(){
        Selenium.badRecord("<..>","<..>","<..>");
    }
    @Test
        public void deleteRecordTest(){
        Selenium.deleteRecord("222");
    }
    @Test
        public void updateRecordTest(){
        Selenium.updateRecord("223","Medu","Nesa","Bites");
    }
    @Test
        public void badUpdateTest(){
        Selenium.badUpdate("224","<..>","!!!!!","Ignas");
    }
    @AfterTest
        public void close(){
        Selenium.close();
    }
}
