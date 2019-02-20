package com.lantosgyuri.tdd.tenniskata

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TennisGameTest{

    lateinit var SUT: TennisGame

    @Before
    fun setUp() {
        SUT = TennisGame(Player("Johnny"), Player("Ubul"))
    }

    @Test
    fun setScorePlayerOne_1_printFifteenLove(){
        SUT.player1.playerScored()
        assertEquals("Fifteen-Love", SUT.getResult())
    }

    /*
     setScore player1 score player 2 not
     setScore till 3 write fifteen-love, thirty-love, forty-love,
      */

    @Test
    fun setScorePlayerOne_2_printThirtyLove(){
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        assertEquals("Thirty-Love", SUT.getResult())
    }

    @Test
    fun setScorePlayerOne_3_printThirtyLove(){
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        assertEquals("Forty-Love", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwo_1_printLoveFifteen(){
        SUT.player2.playerScored()
        assertEquals("Love-Fifteen", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwo_2_printLoveThirty(){
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        assertEquals("Love-Thirty", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwo_3_printLoveForty(){
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        assertEquals("Love-Forty", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwoAndOne_1_2_printFifteenThirty(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        assertEquals("Fifteen-Thirty", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwoAndOne_2_3_printThirtyForty(){
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        assertEquals("Thirty-Forty", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwoAndOne_3_1_printFortyFifteen(){
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Forty-Fifteen", SUT.getResult())
    }

    /*
     setScore player1 score player 2 score too
     setScore till 3 write fifteen-all, thirty-all,
      */

    @Test
    fun setScorePlayerTwoAndOne_0_0_printLoveAll(){
        assertEquals("Love-All", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwoAndOne_1_1_printFifteenAll(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Fifteen-All", SUT.getResult())
    }

    @Test
    fun setScorePlayerTwoAndOne_2_2_printThirtyAll(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Thirty-All", SUT.getResult())
    }

    /*
     setScore player1 score 40 player 2 40
     write deuce-deuce,
      */

    @Test
    fun setScorePlayerTwoAndOne_3_3_printDeuceDeuce(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Deuce-Deuce", SUT.getResult())
    }

    /*
     setScore player1 score Adv player 40
     write Advantage for PLayer1 Name
      */
    @Test
    fun setScorePlayerOneAndTwo_5_4_printAdvForPlayerOneName(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        assertEquals("Advantage for ${SUT.player1.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_10_9_printAdvForPlayerOneName(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Advantage for ${SUT.player1.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_4_5_printAdvForPlayerTwoName(){
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Advantage for ${SUT.player2.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_9_10_printAdvForPlayerTwoName(){
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        assertEquals("Advantage for ${SUT.player2.name}", SUT.getResult())
    }


    /*
     setScore player1 score Adv and score again player 40
     write win for PLayer 1
      */

    @Test
    fun setScorePlayerOneAndTwo_4_6_printWinForPlayerTwoName(){
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        assertEquals("Win for ${SUT.player2.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_9_11_printWinForPlayerTwoName(){
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        assertEquals("Win for ${SUT.player2.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_6_4_printAdvForPlayerOneName(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        assertEquals("Win for ${SUT.player1.name}", SUT.getResult())
    }

    @Test
    fun setScorePlayerOneAndTwo_11_9_printWinForPlayerOneName(){
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        SUT.player2.playerScored()
        SUT.player1.playerScored()
        assertEquals("Win for ${SUT.player1.name}", SUT.getResult())
    }

    /*
     setScore player2 score Adv player 40
     write Advantage for PLayer2 Name
      */

    /*
     setScore player1 score Adv and score again player 40
     write win for PLayer 2
      */
}