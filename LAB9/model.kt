package com.zenika.tournamentgenerator.model

data class Player(val pseudo: String)
data class Match(val player1: Player, val player2: Player)
data class Round(val matches: List<Match>)

data class Tournament(val name: String, val players: List<Player>) {
    init {
        if(players.size !in 2..32 || (players.size and players.size - 1 != 0)) {
            throw IllegalArgumentException()
        }

        when {
            players.size !in 2..32 -> throw IllegalArgumentException("Number of players must ")
            players.size and players.size - 1 != 0 -> throw IllegalArgumentException("")
        }
    }
}
