package calculator
/* Empty class:
class [nameOfClass] - no body or
 */


/*
Calculator class without primary constructor
 */


class SimpleCalculator constructor(val maxOperations: Byte){
//    range of maxOperations <2,127> : less than 2 is non-sense, 127 is enough big number for simple calculations
//      and additionally is maximal (positive) range of Byte
    val maximumOperations: Byte = when{
        maxOperations < 2 -> 2
        maxOperations > 127 -> 127
        else -> maxOperations
    }
    // Array of consecutive numbers
    // var Numbers - Collection?
    // Array of consecutive operations
    // var Operations

}