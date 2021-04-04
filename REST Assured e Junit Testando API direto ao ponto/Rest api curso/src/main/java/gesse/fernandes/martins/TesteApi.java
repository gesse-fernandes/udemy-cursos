package gesse.fernandes.martins;

import org.junit.gen5.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
/**
 * Hello world!
 *
 */
public class TesteApi 
{
    @Test
    public void cadastro()
    {
        //url da api direto 
        String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
        // requisição do body da api
        String corpo = "{\"email\": \"tiagoamaro@gmail.com\",\"appDescription\":\"teste the cat api\"}";
        //DADO QUE
        //GIVEN
        //acima tipo de aplicação e definimos o body corpo]
        //aqui eu crio um response de resposta
        Response resposta =
        given().contentType("application/json").body(corpo).
        //passa o when depois o post da url
                        when().post(url);
        //se tiver ok status 200 deu bom
        resposta.then().statusCode(200);
        
        //QUANDO ESTIVER COM
        //WHEN
        //ENTÃO
        //THEN
        System.out.println("RETORNO =>" + resposta.body().asString());
       
    }
    public static void main(String[] args) {
        TesteApi a = new TesteApi();
        a.cadastro();
    }
}
