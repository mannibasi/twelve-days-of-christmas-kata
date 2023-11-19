package org.katas;

import org.junit.jupiter.api.Test;

public class ChristmasSongShould {

    @Test
    public void ReturnFirstVerseOfTheSongWhenCalledWithOne() {
        assertEquals(ChristmasSong.getVerse(1), "On the First day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "A partridge in a pear tree");
    }
}
