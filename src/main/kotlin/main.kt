fun main () {
    var y = evenIndicies(
        listOf(
            "Winfred",
            "Beatrice",
            "Faith",
            "Gumato",
            "Jane",
            "Christine",
            "Esther",
            "Nelius",
            "Grace",
            "Juliet"
        )
    )
    println(y)
    var x = averagesOfHeight(listOf(5.6, 3.0, 4.0, 6.7, 2.9))
    println(x)

    var p = checkPassword("dtfyghklj;pokjhyuiokl,mnjh")
    println(p)

    oddOrEven(11)
}



fun evenIndicies(names:List<String>):List<String>{
    var nList= mutableListOf<String>()

    names.forEachIndexed(){index, name ->
        if((index %2)==0){
            nList.add(name)
        }
    }
    return nList
}

fun averagesOfHeight(heights:List<Double>):String{

    var sum = heights.sum()
    var average= heights.average()

    var result= "$sum, $average"

    return result
}

fun checkPassword(password:String): Boolean{

    return password.length<= 8 && password.length<=16
}


fun oddOrEven(number:Int){
    if (number %2 == 0){
        println("even")
    }
    else{
        println("odd ")
    }

}
