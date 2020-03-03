fun main(){
    println(ifGreaterThanOne(2))
    println(ifGreaterThanOne(-2))

}

fun ifGreaterThanOne(a:Int) : Int? {
    return if (a > 1){
        a
    }
    else {
        null
    }
}