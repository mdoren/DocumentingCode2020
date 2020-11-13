class notesPerson constructor(firstName: String,
                              lastName: String,
                              middleInitial: Char,
                              var age: Int){
    var fullName: String = ""
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    var lastName: String = lastName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    var middleInitial: Char = middleInitial
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }


    init {
        fullName = "$firstName $middleInitial $lastName"
    }

    fun printAll(){
        println("$fullName is $age.")
    }
}