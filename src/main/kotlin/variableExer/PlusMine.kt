package variableExer

import java.text.DecimalFormat

import java.text.NumberFormat


fun plusMinus(arr: Array<Int>): Unit {
    val number = DoubleArray(3)

    for (numbers: Int in arr) {
        if (numbers >= 0) {
            number[0]++
        } else if (numbers < 0) {
            number[1]++
        } else {
            number[2]++
        }
    }
    val formatter: NumberFormat = DecimalFormat("#0.000000")
    print(formatter.format(number[0] / number.size))
    print(formatter.format(number[1] / number.size))
    print(formatter.format(number[2] / number.size))
}

fun main(args: Array<String>) {

    val arr = readLine()?.trimEnd()?.split(" ")?.map { it.toInt() }?.toTypedArray()

    arr?.let { plusMinus(it) }

}