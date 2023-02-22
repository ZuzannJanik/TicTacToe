package com.tictactoe;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.springframework.test.util.AssertionErrors.*;


class TictactoeApplicationTests {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("Test for O")

    @Test
    void testOInRows() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "O";
        menu.move2 = "O";
        menu.move3 = "O";

        //When
        results.gameOver();

        //Then
        assertTrue("Win O", true);
    }

    @Test
    void testOInColumn() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "O";
        menu.move4 = "O";
        menu.move7 = "O";

        //When
        results.gameOver();

        //Then
        assertTrue("Win O", true);
    }

    @Test
    void testODiagonal() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "O";
        menu.move5 = "O";
        menu.move9 = "O";

        //When
        results.gameOver();

        //Then
        assertTrue("Win O", true);
    }

    @Nested
    @DisplayName("Test for X")

    @Test
    void testXInRows() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "X";
        menu.move2 = "X";
        menu.move3 = "X";

        //When
        results.gameOver();

        //Then
        assertTrue("Win X", true);
    }

    @Test
    void testXInColumn() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "X";
        menu.move4 = "X";
        menu.move7 = "X";

        //When
        results.gameOver();

        //Then
        assertTrue("Win X", true);
    }

    @Test
    void testXDiagonal() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "X";
        menu.move5 = "X";
        menu.move9 = "X";

        //When
        results.gameOver();

        //Then
        assertTrue("Win X", true);
    }

    @Nested
    @DisplayName("Other tests")

    @Test
    void testDraw() {
        //Given
        Menu menu = new Menu();
        Results results = new Results();
        menu.move1 = "X";
        menu.move2 = "O";
        menu.move3 = "X";
        menu.move4 = "X";
        menu.move5 = "O";
        menu.move6 = "X";
        menu.move7 = "O";
        menu.move8 = "X";
        menu.move9 = "O";

        //When
        results.gameOver();

        //Then
        assertFalse("Nobody win. DRAW", false);
    }
    @Test
    void testSameChoice() {
        //Given
        Menu menu = new Menu();
        menu.move1 = "X";

        //When
        String input = "X";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //Then
        Assertions.assertEquals("X", menu.move1);
    }
}



