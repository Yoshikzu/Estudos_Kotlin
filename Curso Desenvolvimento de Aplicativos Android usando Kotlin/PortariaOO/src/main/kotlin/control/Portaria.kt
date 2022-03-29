class Portaria {

    fun controle(){
        val idade = Console.readInt("Qual sua idade? ")

        if(idade < 18){
            println("Menor de Idade não serão permitido!")
        }

        val tipoConvite = Console.readString("Qual o tipo de convite? ")

    }
}