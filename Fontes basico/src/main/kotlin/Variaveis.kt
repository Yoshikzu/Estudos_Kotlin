const val VARIAVEL_CONST = 20 //constante
class Variaveis {
    val variavel_teste // Variável definido por "val" que uma vez atribuido, não poderá ser alterado
    val preco_minimo:Float = 2.92f //Definindo tipo Float
    var valor = 20.99f //Variavél definido por "var" pode ser alterado
    var x:Int
    val rate: Double = 19.5
    val hours:Int = 10
    val total = rate * hours // Double


    'c'.toInt() //converte a variavel
    x = 1_000_000 //Kotlin permite informar um número grande com _

    x +=1 //Operador de incremento

    "O preço é ${10.0/20}"

    var textos = """
                Ola Kotlin 
                em multiplas linhas
                """.trimIndent() //Tira espaços em branco

    val coordinates = Pair(2.3,1) //Atribui os pares numa variavel
    coordinates.first //Acesso ao 2.3
    coordinates.second //Acesso ao 1

    val coord = 2 to 3
    val (x,y) = coord //Atribui os valores dos pares em x e y respectivamente
    val (x1,_) = coord //Atribui somente o primeiro valor para x1 e descarta o outro

    val cood3D = Triple(1,2,3)

    //types
    val bytes: Byte = 1 //1 byte
    val short: Short = 1 // 2 byte
    val int: Int = 1 //4 bytes
    val long: Long = 1 // 8 bytes

    val float: Float = 1.0f // 1 byte - 6 digitos
    val double: Double= 1.- // 2 byte - 15 digitos


    //Any, Unit, Nothing
    //Any: pode ser qualquer tipo
    val numberAny : Any = 10
    val textAny : Any ="10"

    //Unit: função que não retorna nada => Unit equivalente ao void (java)
    fun add():Unit{
        val result = 2 + 2
        println(result)
    }

    //Nothing: função que nunca termina
    fun forever(): Nothing{
        while(true){
            Thread.sleep(1000)
            println('Oi')
        }
    }

}