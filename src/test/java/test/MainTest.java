package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    private static final String SEARCH_NAME = "french bulldogs" + "\n";
    private static final long ACCEPTED_RESULT = 48;

    @Test
    public void checkThatPageContainsImage() {
        getHomePage().implicitWait(30);
        getHomePage().clickAcceptCookies();
        getHomePage().searchByKeyword(SEARCH_NAME);
        getSearchPage().CheckSearchResult();
        Assert.assertEquals(getSearchPage().getProductResultsCount(), ACCEPTED_RESULT);
    }
}

