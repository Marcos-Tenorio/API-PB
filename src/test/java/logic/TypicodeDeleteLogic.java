package logic;

import io.restassured.RestAssured;
import pages.TypicodeDeletePage;

public class TypicodeDeleteLogic {
    private TypicodeDeletePage typicodeDeletePage;
    public TypicodeDeleteLogic(){
        typicodeDeletePage = new TypicodeDeletePage();
        RestAssured.baseURI = typicodeDeletePage.linkBaseUri;
        RestAssured.basePath = typicodeDeletePage.linkBasePath;
    }
}
