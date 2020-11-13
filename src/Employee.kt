import java.text.DecimalFormat

class Employee(
    var name: String,
    var position: PositionTitle,
    var salary: Boolean,
    var payRate: Double,
    var shift: Int) {

    var twoDigits = DecimalFormat("$#,###,###.00")

    fun display(){
        println(name)
        println("$position, Shift $shift")
        println("Salary pay: " + salary)
        println("Rate of pay is " + twoDigits.format(payRate))
    }

    fun calculate(hoursIn: Int){
        var total = 00.00
        if (shift == 2){
            payRate = (payRate * 1.05)
        }
        if (shift == 3){
             payRate = (payRate * 1.1)
        }
        total = (hoursIn * payRate)
        if (!salary){
            if (hoursIn > 40){
                var overtime = hoursIn - 40
                var overtimeRate = (payRate * 1.5)
                total = ((40 * payRate) + (overtime * overtimeRate))
            }
        }
        println("$name made ${twoDigits.format(total)} this week.\n")
    }

}
