import java.text.DecimalFormat

/**
 * Matt D 11/16/20
 * class Employee is what's used for the three employee variables in main
 * the display and calculate function will be called in main for each employee
 *
 */
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

    /**
     * The first if statement in calculate is for employees whose payrate is modified for 2nd shift
     * the second if statement is for empoyees whose payrate is modified for 3rd shift
     * the third is for if they are payed hourly and the one inside that is to determine if they've worked more than 40
     * hours
     */
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
