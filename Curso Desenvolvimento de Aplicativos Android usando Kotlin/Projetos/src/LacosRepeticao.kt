fun main () {

    //FOR
    for(i in 1..12 step 2){
        println("$i")
    }

    //Percorrendo uma string
    val str = "Kotlin First"
    for(char in str){
        println("$char")
    }

    for(j in 20 downTo 1){
        println("$j")
    }

    //WHILE
    val contador = 1
    while(contador < 100){
        println($contador)
        contador++
    }

    //DO WHILE

    do {
        contador--
    }while(contador > 30)


    for(i in 0..20){
        if (i > 20){
            break
        }else if( i == 5){
            continue //Equivalente ao cycle do clarion
        }
        println("$i")
    }


}