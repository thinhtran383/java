public enum Season {
    SPRING("Xuan"),
    SUMMER("Ha"),
    FALL("Thu"),
    WINTER("Dong");

    private String seasonName;

    Season(String name) {
        seasonName = name;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
