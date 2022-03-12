class Funcoes {

    fun OlaMundo(){
        println("Olá Mundo")
    }

    fun somaNumeros(x: Int, y: Int = 10){ //Parametro => Caso não passe por parametro, valor padrão = 10
        println(x+ y)
    }

    fun somaNumerosII(x: Int, y: Int):Int{
        return(x+ y)
    }

    fun MultiplyDivider(x: Int, y:Int):Pair<Int,Int>{
        return(Pair(x*y,x / y))
    }

    fun MultiplyDivider(x: Int, y:Int) = return(Pair(x*y,x / y))

    //Sobrecarga de métodos.. com mesmo nome, porém parametros diferentes
    fun get(x: Int) = return x
    fun get(x:Int,def:Int) = return (x+ def)

    //Pode declarar e armazenar a função em uma variável
    var funSum = ::somaNumeros

    funSum(2,3)

    somaNumeros(2,3) //2 e 3 => Argumentos

    fun genericCalc(function: (Int, Int) -> Int, x:Int, y: Int){
        println(function(x,y))
    }

    genericCalc(::somaNumero,2,3)

}