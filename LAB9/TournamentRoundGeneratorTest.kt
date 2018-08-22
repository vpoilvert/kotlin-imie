package com.zenika.tournamentgenerator.service

import com.zenika.tournamentgenerator.model.Player
import kotlin.test.Test
import kotlin.test.assertEquals

class TournamentRoundGeneratorTest {

    @Test
    fun `test create two player round`() {
        val players = listOf(
                Player("bob"),
                Player("alice"))
        val round = generate(players)

        assertEquals(1, round.matches.size)
    }
}
