package model;

public enum Color {
    RED("czerwony"),
    YELLOW("żółty"),
    BLUE("niebieski");

    private final String translation;

    Color(String translation) {
        this.translation = translation;
    }
}
