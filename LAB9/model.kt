package com.zenika.tournamentgenerator.model

data class Player(val pseudo: String)
data class Match(val player1: Player, val player2: Player)
data class Round(val matches: List<Match>)
data class Tournament(val name: String, val players: List<Player>)
