package com.zenika.tournamentgenerator.model

import org.junit.Test

class TournamentTest {

    @Test(expected = IllegalArgumentException::class)
    fun `test with no player`() {
        Tournament("test", listOf<Player>())
    }

    @Test
    fun `test with two players`() {
        val players = listOf(Player("bob"), Player("alice"))
        Tournament("test", players)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `test with three players`() {
        val players = listOf(Player("bob"),
                Player("alice"),
                Player("michel"))
        Tournament("test", players)
    }
}
