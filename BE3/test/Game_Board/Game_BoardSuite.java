/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_Board;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author teddy.delavallee
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Game_Board.BoxTest.class, Game_Board.Game_PieceTest.class, Game_Board.LineBoardTest.class, Game_Board.BoardTest.class, Game_Board.CheckerBoardTest.class, Game_Board.DiceTest.class, Game_Board.Agressive_Game_PieceTest.class, Game_Board.SnakesAndLaddersGameTest.class, Game_Board.Mobile_Game_PieceTest.class, Game_Board.GameTest.class, Game_Board.GamePieceTransformationTest.class, Game_Board.PlayerTest.class, Game_Board.SnakesAndLaddersPlayerTest.class, Game_Board.SnakesAndLaddersBoardTest.class, Game_Board.CheckerBoxTest.class, Game_Board.LineBoxTest.class})
public class Game_BoardSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
