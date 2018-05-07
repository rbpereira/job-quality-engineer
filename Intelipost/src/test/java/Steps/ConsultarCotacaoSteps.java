package Steps;

import Pages.RequestAPI;
import com.sun.javafx.scene.layout.region.Margins;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;

public class ConsultarCotacaoSteps {
    RequestAPI api = new RequestAPI();
    public String ResponseGet;

    @When("^Enviar uma requisição para a API \"([^\"]*)\"$")
    public void enviarUmaRequisiçãoParaAAPI(String url) throws Throwable {
        ResponseGet = api.HttpGet(url);
    }

    @Then("^É retornado os dados do frete$")
    public void eRetornadoOsDadosDoFrete() throws Throwable {
        ResponseGet.contains("status:OK");
    }
}
