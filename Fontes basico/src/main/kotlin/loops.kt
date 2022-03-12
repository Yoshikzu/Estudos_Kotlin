class loops {

    var sum = 1
    while(sum < 1000){
        sum+= 1
        println(sum)
    }
    do {
        sum+= 1
        println(sum)
        if (sum == 500){
            break
        }
    }while(sum < 1000)

    val range = 0..5
    for(x in range){
        println(x)
    }

    for(i in 0..32 step 2){ //Loop de 2 em 2

    }

    for(x in 0 until 8){

    }

    col@ for(y in 0 until 8){
        row@ for(x in 0 until 8){

        }
    }

    range.forEach(){
        println(it)
    }

    repeat(10){

    }
}