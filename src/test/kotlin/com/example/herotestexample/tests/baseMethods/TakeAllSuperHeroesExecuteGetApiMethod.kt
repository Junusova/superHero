package com.example.herotestexample.tests.baseMethods

import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import tests.baseMethods.Authentication.app_url
import tests.consnts.CONTENT_TYPE_APPLICATION_JSON


fun takeExecuteGetApiMethod(

): ValidatableResponse {
  return given()
               .header(CONTENT_TYPE_APPLICATION_JSON).
       `when`()
             .get("$app_url/superheroes").
       then()

}

fun takeOneHeroFromListExecuteGetApiMethod(

): ValidatableResponse {

  return given()
            .header(CONTENT_TYPE_APPLICATION_JSON).
        `when`()
               .get("$app_url/superheroes/").
        then()

}

fun takeNonExistHeroFromListExecuteGetApiMethod(

): ValidatableResponse {

  return given()
            .header(CONTENT_TYPE_APPLICATION_JSON).
      `when`()
            .get("$app_url/superheroes/0").
      then()

}