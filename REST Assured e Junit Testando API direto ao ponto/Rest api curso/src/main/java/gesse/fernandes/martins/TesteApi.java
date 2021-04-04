package gesse.fernandes.martins;

import org.junit.gen5.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

/**
 * Hello world!
 *
 */
public class TesteApi {
    String vote_id;

    @Test
    public void cadastro() {
        // url da api direto
        String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
        // requisição do body da api
        String corpo = "{\"email\": \"tiagoamaro@gmail.com\",\"appDescription\":\"teste the cat api\"}";
        // DADO QUE
        // GIVEN
        // acima tipo de aplicação e definimos o body corpo]
        // aqui eu crio um response de resposta
        Response resposta = given().contentType("application/json").body(corpo).
        // passa o when depois o post da url
                when().post(url);
        // se tiver ok status 200 deu bom
        resposta.then().body("message", containsString("SUCCESS")).statusCode(200);

        // QUANDO ESTIVER COM
        // WHEN
        // ENTÃO
        // THEN
        System.out.println("RETORNO =>" + resposta.body().asString());

    }

    @Test
    public void votacao() {
        // url da api direto
        String url = "https://api.thecatapi.com/v1/votes/";
        // requisição do body da api
        String corpo = "{\"image_id\": \"6lh\",\"value\":\"true\",\"sub_id\":\"demo-c26f9f\"}";
        // String corpo = "{\"email\":
        // \"tiagoamaro@gmail.com\",\"appDescription\":\"teste the cat api\"}";
        // DADO QUE
        // GIVEN
        // acima tipo de aplicação e definimos o body corpo]
        // aqui eu crio um response de resposta
        Response resposta = given().contentType("application/json").body(corpo).
        // passa o when depois o post da url
                when().post(url);
        // se tiver ok status 200 deu bom
        resposta.then().body("message", containsString("SUCCESS")).statusCode(200);

        // QUANDO ESTIVER COM
        // WHEN
        // ENTÃO
        // THEN
        System.out.println("RETORNO =>" + resposta.body().asString());
        String id = resposta.jsonPath().getString("id");
        vote_id = id;
        System.out.println("ID =>" + id);

    }

    @Test
    public void deletaVotacao() {
        votacao();
        deletaVoto();
    }

    public void deletaVoto() {
        // url da api direto
        String url = "https://api.thecatapi.com/v1/votes/{vote_id}";
        // requisição do body da api
        // String corpo = "{\"email\":
        // \"tiagoamaro@gmail.com\",\"appDescription\":\"teste the cat api\"}";
        // DADO QUE
        // GIVEN
        // acima tipo de aplicação e definimos o body corpo]
        // aqui eu crio um response de resposta
        Response resposta = given().contentType("application/json").
                 //head("key","63c85667-c979-4976-90e4-ec90ae950797")
                pathParams("vote_id", vote_id).
        // passa o when depois o post da url
                when().delete(url);
                 System.out.println("RETORNO =>" + resposta.body().asString());
        //se tiver ok status 200 deu bom
        resposta.then().body("message", containsString("SUCCESS")).statusCode(200);

        // QUANDO ESTIVER COM
        // WHEN
        // ENTÃO
        // THEN

    }

    public static void main(String[] args) {
        TesteApi a = new TesteApi();
        a.deletaVotacao();
    }
}
