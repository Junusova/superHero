package com.example.herotestexample.tests.preconditions

import com.example.herotestexample.tests.baseMethods.createSuperHeroExecutePostApiMethod
import org.apache.http.HttpStatus
import org.junit.Before
import tests.fixtures.CreateSuperHeroHelper

open class SuperHeroPreconditions {

  @Before
  fun createSuperHeroPrecondition() {

    createSuperHeroExecutePostApiMethod(
        requestPayload = CreateSuperHeroHelper().superHero
    )
        .statusCode(HttpStatus.SC_BAD_REQUEST)
  }
}