package org.katas;

public class ChristmasSong {
    public static String getVerse(int i) {
        StringBuilder verse = new StringBuilder();
        verse.append("On the")
                .append(" ")
                .append(getNumberAsWord(i))
                .append(" ")
                .append("day of Christmas")
                .append(System.lineSeparator())
                .append("My true love gave to me:")
                .append(System.lineSeparator());

        switch (i) {
            case 3:
                verse.append("Three French hens,")
                        .append(System.lineSeparator());
            case 2:
                verse.append("Two turtle doves,")
                        .append(System.lineSeparator());
            case 1:
                if(i > 1) {
                    verse.append("And a partridge in a pear tree");
                }
                else {
                    verse.append("A partridge in a pear tree");
                }
        }
        return verse.toString();
    }

    private static String getNumberAsWord(int i) {
        if (i == 1)
            return "First";
        if (i == 2)
            return "Second";
        return "Third";
    }
}
