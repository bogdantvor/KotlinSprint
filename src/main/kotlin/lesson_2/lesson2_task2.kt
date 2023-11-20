package lesson_2

fun main() {
    val employeesNumber = 50
    val employeeSalary = 30000
    val traineesNumber = 30
    val traineeSalary = 20000

    val permanentEmployeesSalary = employeesNumber * employeeSalary
    val allEmployeesSalary = employeesNumber * employeeSalary + traineesNumber * traineeSalary
    val averageSalary = (employeesNumber * employeeSalary + traineesNumber * traineeSalary)/
            (employeesNumber + traineesNumber)

    println("Зарплата постоянных сотрудников: $permanentEmployeesSalary")
    println("Зарплата всех сотрудников: $allEmployeesSalary")
    println("Средняя зарплата всех сотрудников: $averageSalary")
}