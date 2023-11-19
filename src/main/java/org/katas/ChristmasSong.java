package org.katas;

public class ChristmasSong {
    public static String getVerse(int i) {
        if (i == 1)
            return "On the First day of Christmas" + System.lineSeparator() +
                    "My true love gave to me:" + System.lineSeparator() +
                    "A partridge in a pear tree";
        if (i == 2)
            return "On the Second day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "Two turtle doves," + System.lineSeparator() +
                "And a partridge in a pear tree";
        return "On the Third day of Christmas" + System.lineSeparator() +
                "My true love gave to me:" + System.lineSeparator() +
                "Three French hens," + System.lineSeparator() +
                "Two turtle doves," + System.lineSeparator() +
                "And a partridge in a pear tree";
    }
}
