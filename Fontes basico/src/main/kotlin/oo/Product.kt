package oo

//Data class = somente armazena dados
data class Product(var name: String, var price: Double) {
    override fun equals(other: Any?):Boolean{
        if(this === other)
            return true
        if(other === null)
            return false

        val obj = other as Product //Convertendo em tipo Product

        if(this.name != obj.name)
            return false

        if(this.price != obj.price)
            return false
        return true
    }

    override fun toString(): String {
        return "Product is ${name} ${price}"
    }
}