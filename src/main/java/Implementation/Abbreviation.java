package Implementation;

public enum Abbreviation {
    COLOR("red, green, blue"), GS("general studies"),
    WHO("World Health Organisation");

    public final String value;

    Abbreviation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
