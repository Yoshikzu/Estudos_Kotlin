import java.lang.NullPointerException

fun main(){
    var str: String? = null //? => a variável aceita null

    println(str?.length) //Efetuando o tratamento de nullPointException (variável não instanciada)
    //println(str!!.length) //!! = Utilizado para que o Kotlin não verifique e o programador assume
    // que a variável não vai estar nula

    //Captura de Exceções
    try {
        var str2: String? = null
        var a = 10/ 0
        println(str2!!.length)
    }catch(e: NullPointerException){
        println("Variável Nula!")
    }catch (e: ArithmeticException) {
        println("Impossível dividir por 0")
    }catch (e: Exception){ //Exceção mais genérica
        println("Genérica")
    }finally { //Executado sempre

    }

    //Elvis Operator
    val str: String? = null
    if(str == null){
        println("Nulo")
    }else{
        println(str)
    }
    //Equivalente a condição acima
    println(str ?: "nulo")
    //Operador Elvis
    //(str) => variavel que pode ser nulo e seguido de ?: o que vai ser executado caso seja verdadeiro
    //NÃO É OPERADOR TERNÁRIO
    //NÃO EXISTE OPERADOR TERNÁRIO EM KOTLIN
    //EXPRESSÃO ? IF_TRUE : FALSE


    //let
    val str3: String?= null
    //Let executando somente caso str3 seja diferente de nulo
    str3?.let{
        //scope function
        it.lowercase()
        it.length
        println(it)
    }


}