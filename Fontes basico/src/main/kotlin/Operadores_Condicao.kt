class Operadores_Condicao {
    (1 == 2) //Comparação =
    (1 != 2) //Diferente
    val and = true && false // AND
    val or = true || false //OR
    val a = 1
    val b = 2
    val max = if( a > b)  a else b

    val bankAccount = 2000.0f
    val product = if(bankAccount > 1900){
        "Iphone"
    }else if (bankAccount >1700) {
        "Motorola"
    }else{
        "Samsung"
    }

}