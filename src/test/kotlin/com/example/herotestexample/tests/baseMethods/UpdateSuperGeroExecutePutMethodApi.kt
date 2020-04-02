package com.example.herotestexample.tests.baseMethods

import com.google.gson.Gson
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import tests.baseMethods.Authentication.app_url
import tests.consnts.CONTENT_TYPE_APPLICATION_JSON
import tests.dtos.UpdateSuperHeroDto


fun updateSuperHeroExecutePostApiMethod (

    requestPayload: UpdateSuperHeroDto
): ValidatableResponse {
  val superHeroId = HeroId.getHeroId()
  return given()
               .body(Gson().toJson(requestPayload))
               .header(CONTENT_TYPE_APPLICATION_JSON).
         `when`()
                .put("$app_url/superheroes/$superHeroId").
         then()

}