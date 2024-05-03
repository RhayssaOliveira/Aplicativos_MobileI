package com.example.Listas

fun main() {
    //criando uma lista
    val solarSystem = listOf("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter",
        "Saturno", "Urano", "Netuno")
    //vai exibir o número da quantidade de itens da lista
    println(solarSystem.size)

    //mostrando o nome do planeta pelo índice
    println(solarSystem[2])
    println(solarSystem.get(3))

    //mostrando o índice do planeta
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto")) // vai aparecer como -1 porque não existe

    //código de repetição que mostra todos os nomes dos planetas
    for (planet in solarSystem) {
        println(planet)
    }
}