package utilities;

import io.restassured.response.Response;
import static  io.restassured.RestAssured.given;

public class RestAPITest {
    public static void main(String[] args) {
        /**
         * Make get yard api call
         * 1.Request
         * -URL: BaseURL, Endpoint -> http://3.137.169.132/en-us/api/v2/yards/10/
         * -Headers: Authorization(Token), Accept(application/json)
         * -Method: Get
         * 2.Response
         * -Status code
         * -Json Data
         */

         given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization","Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().header("Accept", "application/json")
                .when().get("/yards/10/")
                .then().log().all();
                        ;
      //  System.out.println(response.statusCode());
       // System.out.println(response.body().asString());

        /**
         * POST call
         * Request:
         * 1.URL ->BaseURL+Endpoint
         * 2.Headers->Authorization(Token), Content-Type (application/json), Accept(application/json)
         * 3.Payload/Body-> json
         * 4.Method->POST
         *
         * Response:
         * 1.Status code ->201
         * 2.Body -> json
         */

        Response postResponse = given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization","Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                .and().body("{\n" +
                        "  \"location\": \"Cristina2\",\n" +
                        "  \"status\": \"active\",\n" +
                        "  \"address\": \"909 Des PLaines\",\n" +
                        "  \"apt_suite_company_co\": \"\",\n" +
                        "  \"city\": \"Chicago\",\n" +
                        "  \"state\": \"IL\",\n" +
                        "  \"zip_code\": \"60630\",\n" +
                        "  \"spots\": \"23\",\n" +
                        "  \"warning\": \"\",\n" +
                        "  \"notes\": \"\",\n" +
                        "  \"yard_picture\": [],\n" +
                        "  \"contacts\": [],\n" +
                        "  \"service_phone_number\": [\n" +
                        "    {\n" +
                        "      \"service_phone\": \"\",\n" +
                        "      \"service_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"owner_phone_number\": [\n" +
                        "    {\n" +
                        "      \"owner_phone\": \"\",\n" +
                        "      \"owner_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                .when().post("/yards/");
        System.out.println(postResponse.statusCode());
        System.out.println(postResponse.body().asString());

        /**
         * PATCH Call
         * Request:
         * 1.URL ->BaseURL+Endpoint
         * 2.Headers->Authorization(Token), Content-Type (application/json)
         * 3.Payload/Body-> json
         * 4.Method->PATCH
         *
         * Response:
         * 1.Status code->200
         * 2.Body-> json
         */

        Response updateResponse = given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization","Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                .and().body("{\n" +
                        "  \"location\": \"Cristina55\",\n" +
                        "  \"status\": \"active\",\n" +
                        "  \"address\": \"909 Des PLaines\",\n" +
                        "  \"apt_suite_company_co\": \"\",\n" +
                        "  \"city\": \"Chicago\",\n" +
                        "  \"state\": \"IL\",\n" +
                        "  \"zip_code\": \"60630\",\n" +
                        "  \"spots\": \"235\",\n" +
                        "  \"warning\": \"\",\n" +
                        "  \"notes\": \"\",\n" +
                        "  \"yard_picture\": [],\n" +
                        "  \"contacts\": [],\n" +
                        "  \"service_phone_number\": [\n" +
                        "    {\n" +
                        "      \"service_phone\": \"\",\n" +
                        "      \"service_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"owner_phone_number\": [\n" +
                        "    {\n" +
                        "      \"owner_phone\": \"\",\n" +
                        "      \"owner_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                .when().patch("/yards/47/");
        System.out.println(updateResponse.statusCode());
        System.out.println(updateResponse.body().asString());
    }
}
