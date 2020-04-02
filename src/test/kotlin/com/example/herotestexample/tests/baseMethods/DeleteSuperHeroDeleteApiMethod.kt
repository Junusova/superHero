package com.example.herotestexample.tests.baseMethods

import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import tests.baseMethods.Authentication.app_url
import tests.consnts.CONTENT_TYPE_APPLICATION_JSON

fun deleteSuperHeroExecutePostApiMethod (

): ValidatableResponse {
  val superHeroId = HeroId.getHeroId()
  return given()
            .header(CONTENT_TYPE_APPLICATION_JSON).
       `when`()
             .delete("$app_url/superheroes/$superHeroId").
       then()

}