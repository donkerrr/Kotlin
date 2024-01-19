fun main (){
    val num1 = readLine()?.toDoubleOrNull()!!
    val znak = readLine()!!
    val num2 = readLine()!!.toDouble()


    if  (znak == "+") {
        val got = num1 + num2
        println(got)
    }

    else if (znak == "-"){
        val got = num1 - num2
        println(got)
    }

    else if (znak == "*"){
        val got = num1 * num2
        println(got)
    }

    else if (znak == "/"){
        val got = num1 / num2
        println(got)
    }

}
