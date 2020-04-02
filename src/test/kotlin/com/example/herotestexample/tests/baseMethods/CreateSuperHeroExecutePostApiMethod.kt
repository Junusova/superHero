package com.example.herotestexample.tests.baseMethods

import com.google.gson.Gson
import io.restassured.response.ValidatableResponse
import io.restassured.RestAssured.given
import tests.baseMethods.Authentication.app_url
import tests.consnts.CONTENT_TYPE_APPLICATION_JSON
import tests.dtos.CreateSuperHeroDto


fun createSuperHeroExecutePostApiMethod (

    requestPayload: CreateSuperHeroDto
): ValidatableResponse {
  return given()
             .body(Gson().toJson(requestPayload))
             .header(CONTENT_TYPE_APPLICATION_JSON).
      `when`()
              .post("$app_url/superheroes").
       then()

}