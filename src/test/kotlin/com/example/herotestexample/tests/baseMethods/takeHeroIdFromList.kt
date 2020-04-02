package com.example.herotestexample.tests.baseMethods

import io.restassured.RestAssured.given
import tests.baseMethods.Authentication.app_url

object HeroId {

  fun getHeroId(): Long {
    return given()

        .`when`()
        .get("$app_url/superheroes").
        then()
        .extract()
        .response()
        .jsonPath()
        .getList<Long>("id").last()

  }
}