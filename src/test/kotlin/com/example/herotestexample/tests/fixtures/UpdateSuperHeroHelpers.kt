package com.example.herotestexample.tests.fixtures

import tests.dtos.UpdateSuperHeroDto

class UpdateSuperHeroHelpers {

  val superHero = UpdateSuperHeroDto(

      birthDate = "2019-02-21",
      city = "Austin",
      fullName = "Killian",
      gender = listOf("F"),
      id = 1212,
      mainSkill = "Test Skill",
      phone = "+74998884433"
  )
}