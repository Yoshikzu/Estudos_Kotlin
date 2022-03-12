class Erro {
    var errorCode = 0
    var errCode: Int? = null //? => Pode ser atribuido como nulo

    var text: String? = "Ola"

    var msg: String = ""
    if(text != null){
        //Caso não seja nulo
    }

    println(text?.length?.plus(10)) //text? => garante tratamento caso o text seja igual null não executa o próximo
    text?.let{

    }

    println(text?,length ?: 0) //Caso a variavel seja nulo, tamanho = 0
}