package tests.dtos

data class CreateSuperHeroDto(

        val birthDate: String?,
        val city: String?,
        val fullName: String?,
        val gender: List<String>,
        val id: Int,
        val mainSkill: String,
        val phone: String
)

data class UpdateSuperHeroDto(

    val birthDate: String?,
    val city: String?,
    val fullName: String?,
    val gender: List<String>,
    val id: Int,
    val mainSkill: String,
    val phone: String
)