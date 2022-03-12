//Comentário de uma linha

/*
Comentário de mais de uma linha
 */

import kotlin.math.*

//Operações e formatações
//Expressão de formatação
"%.4f".format(29.0/10.2)

8 shl 1 //=> 16 - Shift Left
8 shr 1 //=> 4  - Shift Right

sqrt(2.0) // Função de Raiz Quadrada

sin(90 * PI) // seno => PI está definido na biblioteca math
max(2,3) //máximo
min(5,2) //mínimo


class Button private constructor(val id:Int, color: Int){

    //Static do java
    companion object{
        var current_id = 0
        fun newButton(color:Int): Button{
            return Bottom
        }
    }
}

interface onClickListener{
    fun onClick()
    fun onLogClick()
}

val listener = object : OnClickListener{
    override fun onClick(){

    }
    override fun OnLogClick(){

    }
}