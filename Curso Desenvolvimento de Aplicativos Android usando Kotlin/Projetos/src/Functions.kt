import java.lang.Math.*

fun main() {
    helloWorld()
    println("A soma de 2 e 4 é ${sum(2,4)}")

    //Função de String
    val str = "Kotlin First"

    println("Tamanho ${str.length}") //propriedade
    println("Posição 0: ${str[0]}")
    println(str.startsWith("Kot"))
    println(str.endsWith("Sk"))
    println(str.substring(2))
    println(str.substring(2,4))
    println(str.substring(2))
    println(str.replace("Kotlin","Kotlin is cool!"))
    println(str.lowercase())
    println(str.uppercase())
    println(str.trim())//Corta espaços no começo e no fim

    //Função de Math
    println(max(2,1)) //Retorna o valor maior entre dois valores
    println(min(2,1))
    println(sqrt(2.0))
    println(PI)
    println(E)
    println(round(2.33))



}

fun helloWorld(){
    println("Hello World")
}

fun sum(a: Int, b:Int):Int{
    return a + b
}

//Função de uma linha => somente uma instrução
fun multiply(a: Int, b:Int):Int = a * b
fun multiply2(a: Int, b:Int) = a * b
fun Hello() = println("Hello, world")

fun maiordeIdade(age: Int){
    if (age > 18){
        println("Maior de idade")
        if (age > 65) {
            println("Melhor Idade")
        }
    }else{
        println("Menor de idade")
    }
}


fun Saudacao(dia: Boolean):String{
    return if(dia){
        "Bom Dia"
    }else{
        "Boa Noite"
    }
}

fun Saudacao2(dia: Boolean)= if(dia){
        "Bom Dia"
    }else{
        "Boa Noite"
    }

fun bonusWhen(cargo: String):Float{
    var bonus: Float = 0f
    when(cargo){
        "Gerente" -> {
            bonus = 2000f
        }
        "Coordenador" -> bonus = 1000f
        "Estagiário" -> bonus = 200f
        else -> bonus = 100f
    }

    var bonus2 = when(cargo){
        "Gerente" -> {
            2000f
        }
        "Coordenador" -> 1000f
        "Estagiário" -> 200f
        else -> 100f
    }
    return bonus
}
//Valor default no parametro (parametro opcional)
fun endereco(rua: String, cidade: String, estado: String, cep: String, numero: Int = 0){
}

fun media(vararg notas: Float):Float{
    //vararg => permite passar n parametros
    //Generics => permite passar qualquer tipo
    var soma = 0f
    for(nota in notas){
        soma += nota
    }
    return(soma/notas.size)
}

//função média2 é do tipo T (Generic)
fun <T, J> media2(abc: J, vararg notas: T, ):Float{
    //vararg => permite passar n parametros => sempre passar por último parametro
    //Generics => permite passar qualquer tipo
    var soma = 0f
    for(nota in notas){
        if (nota is Float){
            soma += nota
        }
    }
    return(soma/notas.size)
}