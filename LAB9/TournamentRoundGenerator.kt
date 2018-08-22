package com.zenika.tournamentgenerator.service

import com.zenika.tournamentgenerator.model.Match
import com.zenika.tournamentgenerator.model.Player
import com.zenika.tournamentgenerator.model.Round

fun generate(players: List<Player>): Round {
    val matches = mutableListOf<Match>()

    for(index in 0 until players.size step 2) {
        matches.add(Match(players[index], players[index + 1]))
    }

    return Round(matches)
}
