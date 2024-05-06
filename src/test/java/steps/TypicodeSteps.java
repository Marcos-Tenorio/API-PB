package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import logic.TypicodeGetUsersLogic;
import logic.TypicodePostLogic;
import logic.TypicodePutLogic;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;

public class TypicodeSteps {

    public Response response;
    private TypicodeGetUsersLogic typicodeGetUsersLogic;
    private TypicodePostLogic typicodePostLogic;
    private TypicodePutLogic typicodePutLogic;

    public TypicodeSteps() {

    }

    @Given("^que efetuo consulta de usuarios total$")
    public void que_efetuo_contulta_de_usuarios_total() throws Throwable {
        typicodeGetUsersLogic = new TypicodeGetUsersLogic();

        response =
                given()
                        .log().all()
                        .when()
                        .get()
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    @Given("^que efetuo PUT$")
    public void que_efetuo_PUT() throws Throwable {
        typicodePutLogic = new TypicodePutLogic();

        response =
                given()
                        .log().all()
                        .when()
                        .put()
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    @Given("^que efetuo DELETE$")
    public void que_efetuo_DELETE() throws Throwable {
        typicodePutLogic = new TypicodePutLogic();

        response =
                given()
                        .log().all()
                        .when()
                        .delete()
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    @Then("^verifico name do usuario 10$")
    public void verifico_name_do_usuario_10() {
        response.then().body("id.max()", equalTo(10));

        JSONArray jsonArray = new JSONArray(response.getBody().prettyPrint());

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (jsonObject.getInt("id") == 10) {
                String name = jsonObject.getString("name");
                Assert.assertEquals(name, "Clementina DuBuque");
                break;
            }
        }
    }

    @When("^devo obter o retorno 200$")
    public void devo_obter_o_retorno_200() throws Throwable {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @When("^devo obter o retorno 201$")
    public void devo_obter_o_retorno_201() throws Throwable {
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Given("^que efetuo post$")
    public void que_efetuo_post() {
        typicodePostLogic = new TypicodePostLogic();

        response = given().contentType(ContentType.JSON).log().all().post();

    }

    @Then("^verifico o id retornado$")
    public void verifico_o_id_retornado() {
        response.then().body("id", equalTo(101));
    }

    @Then("^verifico o id 1 retornado$")
    public void verifico_o_id_1_retornado() {
        response.then().body("id", equalTo(1));
    }

    @Then("^retorno deve ser vazio$")
    public void retorno_deve_ser_vazio() {
        Assert.assertTrue(response.getBody().print().equals("{}"));
    }

}
