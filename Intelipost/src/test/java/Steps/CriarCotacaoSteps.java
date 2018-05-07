package Steps;

import Pages.RequestAPI;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CriarCotacaoSteps {
    RequestAPI api = new RequestAPI();
    public String ResponsePost;
    public String Origin_zip_code = "04012080";
    public String Destination_zip_code = "04346000";

    @When("^Enviar uma requisição para a API \"([^\"]*)\", informando os parametros necessários$")
    public void enviarUmaRequisiçãoParaAAPIInformandoOsParametrosNecessários(String url) throws Throwable {
        ResponsePost = api.HttpPost(url, Origin_zip_code, Destination_zip_code);
    }

    @Then("^É retornado os dados cotação$")
    public void eRetornadoOsDadosCotacao() throws Throwable {
        ResponsePost.contains("status:OK");
        ResponsePost.contains("delivery_estimate_business_days");
        ResponsePost.contains("description");
        ResponsePost.contains("final_shipping_cost");
    }
}
