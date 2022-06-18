package variableExer

internal fun distanceHamming(listHamming: List<Char>?, listComparableHamming: List<Char>): Any {
    if(listHamming == listComparableHamming){
        return println("cadeias iguais")
    }else {
        return print(listHamming?.elementAt(7)?.equals(listComparableHamming.elementAt(index = 7))!!)
    }
    return print("$listHamming e $listComparableHamming")
}

fun main() {
    val readLIne = readLine()?.trim()?.toList()
    val readLineComparable = readLine()?.trim()?.toList()
    readLineComparable?.let { distanceHamming(readLIne, it) }
}