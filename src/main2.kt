fun main (){
    val num1 = readLine()?.toDoubleOrNull()!!
    val znak = readLine()!!
    val num2 = readLine()!!.toDouble()


    when (znak) {
        "+" -> {val r =  num1 + num2
            print (r)
        }


        "-" -> print (num1 - num2)


        "*" -> {
            print (num1)
            print ("*")
            print (num2)
            print ("=")

            print (num1 * num2)
        }


        "/" -> print ("$num1 / $num2 = ${num1 + num2}")


        else -> print("Ошибка")
    }

}