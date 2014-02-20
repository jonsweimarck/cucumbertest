package se.bfb.cucumbertest.pages;

public class Dn extends WebpageBase {
    public void open(String url){
        driver.get(url);
    }

    public boolean showsFirstPage() {
       return driver.getTitle().contains("Nyheter - DN.SE");
    }

    public void openFirstPage() {
        open("http://www.dn.se");
    }

    public void clickSportSection() {
    }

}
