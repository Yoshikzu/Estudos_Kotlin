class Console private constructor(){

    companion object{
        fun readInt(msg: String): Int{
            var retorno: Int? = null
            do {
                print(msg)
                val info = readLine()

                retorno = info?.toIntOrNull()
                if (retorno == null || retorno <= 0 ){
                    println("Valor Inválido!!")
                }

            }while(retorno == null || retorno <= 0)

            return 0
        }

        fun readString(msg: String):String{
            var retorno: String? = null
            do{
                print(msg)
                val info = readLine()

                retorno = info.lowercase()
                if(retorno == null || retorno == ""){
                    println("Valor inválido!")
                }
            }while(retorno == null || retorno == "")
        }

    }

}