package com.example.matrizes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.colecoes.ui.theme.ColecoesTheme

fun main() {
    //variavel p planetas rochosos
    val rockPlanets = arrayOf<String>("Mercúrio", "Vênus", "Terra", "Marte")
    //variavel p planetas gasosos
    val gasPlanets = arrayOf("Júpiter", "Saturno", "Urano", "Netuno")
    //variavel p juntar os dois e fazer uma matriz pelo índice
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    //dando valor a um indice especifico e mostrando ele
    solarSystem[3] = "Pequena Terra"
    println(solarSystem[3])

    //aumentadno a matriz, pois o max de indices sao 8
    val newSolarSystem = arrayOf("Mercúrio", "Vênus", "Terra", "Marte",
        "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")
    println(newSolarSystem[8])
}
