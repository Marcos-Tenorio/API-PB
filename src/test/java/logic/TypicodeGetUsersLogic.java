package logic;

import groovy.util.logging.Log4j2;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.TypicodeGetUsersPage;

import static io.restassured.RestAssured.given;

@Log4j2
public class TypicodeGetUsersLogic {

    private Response response;
    private TypicodeGetUsersPage typicodeGetUsersPage;

    public TypicodeGetUsersLogic(){
        typicodeGetUsersPage = new TypicodeGetUsersPage();
        RestAssured.baseURI = typicodeGetUsersPage.linkBaseUri;
        RestAssured.basePath = typicodeGetUsersPage.linkBasePath;
    }

}
