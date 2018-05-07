package Steps;

import Pages.RequestAPI;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarGrupoProdutos {
    RequestAPI api = new RequestAPI();
    public String ResponseGet;

    @When("^Enviar uma requisição para a API de grupos \"([^\"]*)\"$")
    public void enviarUmaRequisicaoParaAAPIDeGrupos(String url) throws Throwable {
        ResponseGet = api.HttpGet(url);
    }

    @Then("^É retornado os dados com os grupos$")
    public void eRetornadoOsDadosComOsGrupos() throws Throwable {
        ResponseGet.contains("status:OK");
        ResponseGet.contains("type:SUCCESS");
    }
}
