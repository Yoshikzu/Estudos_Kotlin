class Sequencia {
    val range = 0..5
    val decrease = 5 downTo 0
    val rangeTil 0 until 5 // Exclui o último valor (5)

    println(range)

    val user = "Sam"
    when(user){
        "Sam","Moto" -> println("Android")
        else -> println("IOS")
    }

    val number = 3
    val numberToText = when(number){
        0 -> "Zero"
        1 -> "Um"
        else{
            println("Desconhecido")
            "desconhecido"
        }
    }

    val hour = 9
    val time = when(hour){
        in 6..11 -> "Manhã"
        in 12..17 -> "Tarde"
        in 18..24 -> "Noite"
        else -> "Indefinido"
    }
}