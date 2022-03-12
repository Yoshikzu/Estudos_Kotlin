class AnonimusFunction {

    //função sem nome (lambda)
    var calcularLambda = {a: Int, b: Int -> Int
        a+ b
    }

    val square: (Int) -> Int = {
        it * it
    }

    fun lambdaCalc(x: Int, y: Int, function:(Int,Int) -> Int){
        function(x,y)
    }

    lambdaCalc(2,3){x,y -> x* y}

    var lambda:() -> Unit = {
        println("Ola")
    }

    //Lambda
    array.filter{
        it > 2
    }

    println(array.map{
        it * 0.8
    })

    println(array.reduce{a,b ->
        a + b
    })
}