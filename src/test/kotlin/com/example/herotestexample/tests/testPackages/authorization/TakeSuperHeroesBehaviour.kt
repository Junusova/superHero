package com.example.herotestexample.tests.testPackages.authorization

import com.example.herotestexample.tests.baseMethods.takeExecuteGetApiMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.*
import org.junit.jupiter.api.Test

class TakeSuperHeroesBehaviour {

  @Test
  fun behaviour_01_TakeSuperHeroesWithCorrectDataShouldReturnPositiveResponse() {

    takeExecuteGetApiMethod()
        .statusCode(HttpStatus.SC_OK)

        .body(
            "id", notNullValue(),
            "fullName", notNullValue(),
            "fullName", hasItems("Full Name"),
            "birthDate", notNullValue(),
            "birthDate", hasItems("2019-02-21"),
            "city", notNullValue(),
            "city", hasItems("City"),
            "mainSkill", notNullValue(),
            "mainSkill", hasItems("Magic"),
            "gender", notNullValue(),
            "gender", hasItems("No"),
            "phone[0]",equalTo(null))

  }
}