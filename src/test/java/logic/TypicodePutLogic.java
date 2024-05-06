package logic;

import io.restassured.RestAssured;
import pages.TypicodePutPage;

public class TypicodePutLogic {
    private TypicodePutPage typicodePutPage;
    public TypicodePutLogic(){
        typicodePutPage = new TypicodePutPage();
        RestAssured.baseURI = typicodePutPage.linkBaseUri;
        RestAssured.basePath = typicodePutPage.linkBasePath;
    }
}
