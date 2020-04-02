package com.example.herotestexample.tests.testPackages.authorization

import com.example.herotestexample.tests.baseMethods.updateSuperHeroExecutePostApiMethod
import com.example.herotestexample.tests.fixtures.UpdateSuperHeroHelpers
import com.example.herotestexample.tests.preconditions.SuperHeroPreconditions
import org.apache.http.HttpStatus
import org.junit.jupiter.api.Test

class UpdateSuperHeroBehaviour: SuperHeroPreconditions() {

  @Test
  fun behaviour_01_UpdateSuperHeroesWithCorrectDataShouldReturnPositiveResponse() {

    updateSuperHeroExecutePostApiMethod(
        requestPayload = UpdateSuperHeroHelpers().superHero
    )
        .statusCode(HttpStatus.SC_OK)
        .log().all()
  }
}