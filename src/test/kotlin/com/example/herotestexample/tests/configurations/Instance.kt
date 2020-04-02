package tests.configurations

object Instance {
    val APP_URL: String? = System.getenv("APP_URL")

    fun getWebAppUrl(): String {
        return APP_URL ?: "https://superhero.qa-test.csssr.com"
    }
}