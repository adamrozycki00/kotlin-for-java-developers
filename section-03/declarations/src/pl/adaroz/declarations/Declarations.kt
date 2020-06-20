package pl.adaroz.declarations

fun main() {
    var number: Int
    number = 10
    number = 20
    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
    val employee2: Employee
    val number2 = 100

    employee2 = if (number < number2) {
        Employee("Jane Smith", 400)
    } else {
        Employee("Mike Watson", 150)
    }

}

class Employee(var name: String, private val id: Int) {
    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
