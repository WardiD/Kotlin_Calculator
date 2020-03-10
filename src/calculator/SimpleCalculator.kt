package calculator

/*
Calculator class without primary constructor
 */

//class CannotComputeException : Exception();

class SimpleCalculator constructor(private val maxOperations: Byte){
//    range of maxOperations <2,127> : less than 2 is non-sense, 127 is enough big number for simple calculations
//      and additionally is maximal (positive) range of Byte
    val maximumOperations: Byte = when{
        maxOperations < 2 -> 2
        maxOperations > 127 -> 127
        else -> maxOperations
    }
    //Collections of consecutives values and operators
    private var values : MutableList<Double> = ArrayList<Double>()
    private var operators: MutableList<String> = ArrayList<String>()
    private var currentResult :Double = 0.0
        get() = this.calculate()


    public fun setNextValue(value: Double) : Unit {
        this.values.add(value)
    }

    public fun setNextOperation(operator: String) : Unit {
        this.operators.add(operator)
    }

    // to correct calculation quantity of operators should be less by 1 than quantity of values
    private fun isQuantityCorrect() : Boolean {
        return this.operators.size == this.values.size - 1
    }

    // In Progress
    public fun calculate() : Double{
        try {
            if (!isQuantityCorrect())
                throw Exception("Wrong quantity of operators or number values")
        } catch (ex: Exception){
            throw ex
        } else {
            for
        }
    }



}