package Steps;

import Pages.RequestAPI;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConsultarMetodosEnvioSteps {
    RequestAPI api = new RequestAPI();
    public String ResponseGet;

    @When("^Enviar requisição para a API consulta de métodos de postagem \"([^\"]*)\"$")
    public void enviarRequisicaoParaAAPIConsultaDeMetodosDePostagem(String url) throws Throwable {
        ResponseGet = api.HttpGet(url);
    }
    @Then("^É retornado os dados com os métodos de envio$")
    public void eRetornadoOsDadosComOsMetodosDeEnvio() throws Throwable {
        ResponseGet.contains("status:OK");
        ResponseGet.contains("name:Correios PAC");
    }
}
