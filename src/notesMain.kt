fun main(){
    var person1 = notesPerson("John", "Smith", 'M', 35)

    println(person1.fullName)
    person1.firstName = "Mike"
    println("${person1.firstName} --- ${person1.fullName}")
}