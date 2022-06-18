package libre

class No<T>(var valor: T, var proximo: No<T>? = null){
    override fun toString(): String {
        return if(proximo!= null){
            "$valor->${proximo.toString()}"
        }else{
            "$valor"
        }
    }
}

fun main(){
    val node1 = No(1)
    val node2 = No(3)
    val node3 = No(4)

    node1.proximo = node2
    node2.proximo = node3
    print(node1)
}