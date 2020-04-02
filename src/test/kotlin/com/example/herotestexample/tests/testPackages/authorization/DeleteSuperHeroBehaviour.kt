package com.example.herotestexample.tests.testPackages.authorization

import com.example.herotestexample.tests.baseMethods.deleteSuperHeroExecutePostApiMethod
import com.example.herotestexample.tests.preconditions.SuperHeroPreconditions
import org.apache.http.HttpStatus
import org.junit.jupiter.api.Test

class DeleteSuperHeroBehaviour: SuperHeroPreconditions() {

  @Test
  fun behaviour_01_DeleteSuperHeroShouldReturnPositiveResponse() {

    deleteSuperHeroExecutePostApiMethod()
        .statusCode(HttpStatus.SC_OK)
  }
}