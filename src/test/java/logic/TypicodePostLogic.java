package logic;

import groovy.util.logging.Log4j2;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.TypicodePostPage;

import static io.restassured.RestAssured.given;

@Log4j2
public class TypicodePostLogic {
private TypicodePostPage typicodePostPage;
    private Response response;
    public TypicodePostLogic(){
        typicodePostPage = new TypicodePostPage();
        RestAssured.baseURI = typicodePostPage.linkBaseUri;
        RestAssured.basePath = typicodePostPage.linkBasePath;
    }

}
