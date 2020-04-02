package tests.fixtures

import tests.dtos.CreateSuperHeroDto

class CreateSuperHeroHelper {

  val superHero = CreateSuperHeroDto(
      birthDate = "2019-02-21",
      city = "New York",
      fullName = "Doctor Linge",
      gender = listOf("F"),
      id = 1212,
      mainSkill = "Test Skill",
      phone = "+74998884433"
  )

  val createSuperHeroWithEmptyBirthDateField = CreateSuperHeroDto (

      birthDate = "",
      city = "New York",
      fullName = "Doctor Linge",
      gender = listOf("F"),
      id = 1212,
      mainSkill = "Test Skill",
      phone = "+74998884433"

  )

  val createSuperHeroWithNotCorrectYearOfBirthDateField = CreateSuperHeroDto (

      birthDate = "209-02-21",
      city = "New York",
      fullName = "Doctor Linge",
      gender = listOf("F"),
      id = 1212,
      mainSkill = "Test Skill",
      phone = "+74998884433"

  )
}

