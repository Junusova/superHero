package tests.configurations

import org.springframework.util.ResourceUtils
import java.io.FileInputStream
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class DbConfigurations {

    private val properties: Properties = Properties()

    val URL: String
    val USER: String
    val PASSWORD: String

    init {
        val file = ResourceUtils.getFile("/src/main/resources/bootstrap.properties")
        val stream = FileInputStream(file)
        properties.load(stream)
        URL = properties.getProperty("spring.datasource.url")
        USER = properties.getProperty("spring.datasource.username")
        PASSWORD = properties.getProperty("spring.datasource.password")


        @Throws(SQLException::class)
        fun connect(): Connection {
            return DriverManager.getConnection(URL, USER, PASSWORD)
        }

        @Throws(SQLException::class)
        fun connectSQL(SQL: String) {
            val connect = connect()
            val statement = connect.createStatement()

            statement.execute(SQL)
            statement.close()
            connect.close()
        }
    }
}