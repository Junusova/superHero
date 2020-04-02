package com.example.herotestexample.tests.testPackages.authorization

import com.example.herotestexample.tests.baseMethods.createSuperHeroExecutePostApiMethod
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.*
import org.junit.FixMethodOrder
import org.junit.jupiter.api.Test
import org.junit.runners.MethodSorters
import tests.fixtures.CreateSuperHeroHelper


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CreateSuperHeroBehaviour {


  @Test
  fun behaviour_01_CreateSuperHeroesWithCorrectDataShouldReturnPositiveResponse() {

    createSuperHeroExecutePostApiMethod(
        requestPayload = CreateSuperHeroHelper().superHero
    )
        .statusCode(HttpStatus.SC_OK)
        .body(
            "id", notNullValue(),
            "fullName", notNullValue(),
            "fullName", equalTo("Doctor Linge"),
            "birthDate", notNullValue(),
            "birthDate", equalTo("2019-02-21"),
            "city", notNullValue(),
            "city", equalTo("New York"),
            "mainSkill", notNullValue(),
            "mainSkill", equalTo("Test Skill"),
            "gender", notNullValue(),
            "gender", equalTo("F"),
            "phone", equalTo(null))
  }

  @Test
  fun behaviour_02_CreateSuperHeroWithOutDataBirthShouldReturnNegativeResponse() {

    createSuperHeroExecutePostApiMethod(
        requestPayload = CreateSuperHeroHelper().createSuperHeroWithEmptyBirthDateField
    )
        .statusCode(HttpStatus.SC_FORBIDDEN)
        .body(
            "message", notNullValue(),
            "message", equalTo("Incorrect request data"),
            "code", notNullValue(),
            "code", equalTo("BAD_REQUEST"))
  }

  @Test
  fun behaviour_03_CreateSuperHeroWithNotDataStructureCorrectDataShouldReturnNegativeResponse() {

    createSuperHeroExecutePostApiMethod(
        requestPayload = CreateSuperHeroHelper().createSuperHeroWithNotCorrectYearOfBirthDateField
    )
        .statusCode(HttpStatus.SC_BAD_REQUEST)
        .body(
            "error", notNullValue(),
            "error", equalTo("Bad Request"),
            "message", notNullValue(),
            "path", notNullValue(),
            "path", equalTo("/superheroes"))
  }
}