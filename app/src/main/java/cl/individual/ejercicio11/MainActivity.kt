package cl.individual.ejercicio11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*fun main() {
    var numero1 = 10
    var numero2 = 33
    var numero3 = 66

    var resultado = numero1 + numero2 + numero3

    println(resultado)

    numero1 = 55

    resultado = numero1 + numero2 + numero3
    println(resultado)

    val promedio = resultado/3

    println(promedio)
}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to: $hobby")
        if (referrer==null) {
            println("Doesn't have a referrer")
        } else {
            println("Has a referrer named ${referrer.name}, who likes to play ${referrer.hobby}")
        }
    }
}