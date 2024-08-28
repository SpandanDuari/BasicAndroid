package com.example.rockpaperscissors

fun main(){
    var computerchoice=""
    var playerchoice=""
    println("Rock,paper,scissors,enter your choice")
    playerchoice= readln()

    val randommunber = (1..3).random()

   if(randommunber==1)
       computerchoice="Rock"
    else if(randommunber==2)
        computerchoice=="paper"
    else if(randommunber==3)
        computerchoice="scissors"

    println(computerchoice)
    val winner=when{
        playerchoice==computerchoice->"Tie"
        playerchoice=="Rock" && computerchoice=="paper"->"Player"
        playerchoice=="paper" && computerchoice=="scissors"->"Player"
        playerchoice=="scissors" && computerchoice=="Rock"->"Player"
        else ->"Computer"

    }
    if(winner=="Tie")
        println("Its Tie")
    else if(winner=="Player")
        println("Player")
    else
        println("Computer")



    }

