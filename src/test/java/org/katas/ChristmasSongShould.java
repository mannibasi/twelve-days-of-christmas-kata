package org.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasSongShould {

    @Test
    public void ReturnFirstVerseOfTheSongWhenCalledWithOne() {
        assertEquals(ChristmasSong.getVerse(1), "On the First day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "A partridge in a pear tree");
    }

    @Test
    public void ReturnSecondVerseOfTheSongWhenCalledWithTwo() {
        assertEquals(ChristmasSong.getVerse(2), "On the Second day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "Two turtle doves," + System.lineSeparator() +
                "And a partridge in a pear tree");
    }

    @Test
    public void ReturnThirdVerseOfTheSongWhenCalledWithThree() {
        assertEquals(ChristmasSong.getVerse(3), "On the Third day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "Three French hens," + System.lineSeparator() +
                "Two turtle doves," + System.lineSeparator() +
                "And a partridge in a pear tree");
    }
}
