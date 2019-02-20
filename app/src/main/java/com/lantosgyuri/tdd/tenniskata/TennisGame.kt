package com.lantosgyuri.tdd.tenniskata

class TennisGame(var player1: Player, var player2: Player) {

    fun getResult(): String {
        return when {
            player1.points > 3 && player2.points > 3 -> advantageOrWinForPlayer(player1.points, player2.points)
            player1.points == player2.points && player1.points == 3 -> "Deuce-Deuce"
            player1.points == player2.points -> getPointsInString(player1.points) + "-" + "All"
            else -> getPointsInString(player1.points) + "-" + getPointsInString(player2.points)
        }

    }

    private fun getPointsInString(score: Int) = when (score) {
        1 -> "Fifteen"
        2 -> "Thirty"
        3 -> "Forty"
        else -> "Love"
    }

    private fun advantageOrWinForPlayer(score1: Int, score2: Int): String {
        val isWin = Math.abs(score1 - score2) > 1

        return when {
            isWin && score1 > score2 -> "Win for ${player1.name}"
            isWin && score2 > score1 -> "Win for ${player2.name}"
            else -> if (score1 > score2) "Advantage for ${player1.name}"
            else "Advantage for ${player2.name}"
        }

    }

}