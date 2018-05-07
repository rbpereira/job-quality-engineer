package Pages;

import gherkin.deps.com.google.gson.JsonArray;
import okhttp3.*;

import java.io.IOException;

public class RequestAPI {
    public String HttpGet(String URL) throws IOException {
        OkHttpClient client = new OkHttpClient();

        okhttp3.Request request;
        request = new okhttp3.Request.Builder()
                .url(URL)
                .get()
                .addHeader("api-key", "4aa90b1087807b5fb8e52b01584f84e416ddb8ab8e5b800ae5d0f075a2d1e379")
                .addHeader("platform", "intelipost-docs")
                .addHeader("platform-version", "v1.0.0")
                .addHeader("plugin", "intelipost-plugin")
                .addHeader("plugin-version", "v2.0.0")
                .addHeader("Cache-Control", "no-cache")
                .build();
            Response response = client.newCall(request).execute();
            String retorno = response.body().string();
            return retorno;
    }

    public String HttpPost(String URL, String Origin_zip_code, String Destination_zip_code) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"origin_zip_code\":" + Origin_zip_code +",\"destination_zip_code\":" + Destination_zip_code +",\"quoting_mode\":\"DYNAMIC_BOX_ALL_ITEMS\",\"products\":[{\"weight\":5,\"cost_of_goods\":10.7,\"width\":15,\"height\":17.5,\"length\":15,\"quantity\":1,\"sku_id\":\"SKU123\",\"product_category\":\"Bebidas\"}],\"additional_information\":{\"lead_time_business_days\":1,\"sales_channel\":\"meu_canal_de_vendas\",\"client_type\":\"gold\"},\"identification\":{\"session\":\"04e5bdf7ed15e571c0265c18333b6fdf1434658753\",\"ip\":\"000.000.000.000\",\"page_name\":\"carrinho\",\"url\":\"http://www.intelipost.com.br/checkout/cart/\"}}");
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .addHeader("api-key", "4aa90b1087807b5fb8e52b01584f84e416ddb8ab8e5b800ae5d0f075a2d1e379")
                .addHeader("platform", "intelipost-docs")
                .addHeader("platform-version", "v1.0.0")
                .addHeader("plugin", "intelipost-plugin")
                .addHeader("plugin-version", "v2.0.0")
                .addHeader("content-type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        String retorno = response.body().string();

        return retorno;
    }
}
