class Colecoes {
    //Arrays, List

    val numbers = arrayOf(1,2,3) //arrayOf => imutaveis - indice a partir do 0
    val array = Array(5,{10}) //Array de 5 posições com valor = 10

    val numberInt = intArrayOf(1,2,3)
    var texts = listOf("Olá","Mundo","Teste") //Lista imutaveis
    var names = mutableListOf<String>() //Lista mutaveis

    names.add("Lamar")
    names.add("Adrian")
    names.add("Jackson")
    println(names)

    names.isEmpty()
    names.size() //Tamanho
    names.first() //Primeiro Valor
    names.last() //último Valor
    names.min() //Menor valor
    names.joinToString(";")//Separa elementos com ;
    names.slice(0..2).contains("Adrian")
    names.remove("Adrian")
    names.sort()

    for(name in names){
        println(name)
    }

    for((index,name) in names.withIndex()){
        println("$index, $name")
    }

    var listOfNullables: List<Int?> = ListOf(1,2,null,4)
    var listOfNull: List<Int>? = null

    val products = mapOf("Apple" to "IOS", "Google" to "Android")
    products["Apple"]
    products.isEmpty()
    products.size

    val userA = mutableMapOf("name" to "Tiago","country" to "Brasil")

    userA.put("country","USA") //Atualiza o "country"

    var pairTeacher = "teacher" to "Sim"
    userA += pairTeacher

    userA.remove("teacher")

    for(key in userA.keys){
        println(key)
    }

    val otherNames = setOf("Tiago","Felipe","Tiago") //Set não duplica valores

    val array = arrayOf(1,2,3,2)
    val fromArray = mutableSetOf(*array) //Transforma em set
    fromArray.add(6)
    fromArray.remove(2)



}