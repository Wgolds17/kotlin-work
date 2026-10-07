// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val length1 = args[0].toDouble()
    val length2 = args[1].toDouble()
    val length3 = args[2].toDouble()

    val s = (length1 + length2 + length3) * 0.5
    val area = sqrt(s*(s-length1)*(s-length2)*(s-length3))

    val roundedArea = "%.5f".format(area)
    println("Area = $roundedArea")
}