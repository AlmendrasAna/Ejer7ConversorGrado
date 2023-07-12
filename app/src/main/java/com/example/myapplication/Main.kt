package com.example.myapplication

fun main() {

println("Ingrese valor en grados celcius")
val celcius = readLine()!!.toDouble()
val farenhais=((9.0/5.0)*celcius)+32
println("Farenhai $farenhais")
val kelvin = celcius+273.15
  println("Kelvin $kelvin")

val farenhaisToKelvin = 5.0/9.0*(farenhais - 32) + 273.15
  println("De farenhai a kelvin $farenhaisToKelvin")
}
