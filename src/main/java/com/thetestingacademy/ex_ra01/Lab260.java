package com.thetestingacademy.ex_ra01;


public class Lab260 {
    public static void main(String[] args) {

        /*
        REST ASSURED _Is a JAVA Domain Specific Language(DSL) API used for writing automated testfor RESTful APIs

        It is used to invoke REST web services for POST,GET, PUT,DELETE, OPTIONS and HEAD requests and validate Response.

        For Example in Postman, we have functions like pm.xxx()

        Also,REST ASSURED has its own function:

       RestAssured.basic().authenticate().xxxxxx().yyyyyyyyy.().zzzzzzz()
       Mainly using the dot dot operator
        ---> It follows the Builder Pattern.

        BENEFITS OF REST ASSURED
        - Contains tons of helper methods and abstraction layers.
        - Remove the need for writing a lot of code for connections,sennding a request, and parsing a response
        - Easy to understand Domain Specific Language
        - Seamless integration with Java,TestNG,Maven, Reporting(Alllure Report,Extent Report, ReportNG)

        REST ASSURED follows the Given,When,Then
        - Given, When,Then is invented by Martin fowler,it is called the Gokins Syntax  which is Behaviour Driven
        Development (BDD).
        For example;
       given--> url,header,auth,payload
       when--> get,post
       then --> response which i can verify
         */

// Rest Assured Hello World Program
        RestAssured
                .given().baseUrl("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get.then().statusCode(expectedStatusCode:201);



    }

}
