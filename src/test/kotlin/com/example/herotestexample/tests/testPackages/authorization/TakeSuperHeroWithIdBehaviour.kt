package com.example.herotestexample.tests.testPackages.authorization

import com.example.herotestexample.tests.baseMethods.takeNonExistHeroFromListExecuteGetApiMethod
import com.example.herotestexample.tests.baseMethods.takeOneHeroFromListExecuteGetApiMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.jupiter.api.Test

class TakeSuperHeroWithIdBehaviour {

  @Test
  fun behaviour_01_TakeSuperHeroWithCorrectDataShouldReturnPositiveResponse() {

    takeOneHeroFromListExecuteGetApiMethod()
        .statusCode(HttpStatus.SC_OK)

  }

  @Test
  fun behaviour_02_TakeSuperHeroNonExistIdShouldReturn400StatusCode() {

    takeNonExistHeroFromListExecuteGetApiMethod()
        .statusCode(HttpStatus.SC_BAD_REQUEST)
        .body(
            "message", notNullValue(),
            "message", equalTo("Superhero with id '0' was not found"),
            "code", notNullValue(),
            "code", equalTo("NOT_FOUND"))

  }
}