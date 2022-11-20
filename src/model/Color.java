public enum Color {

    BLACK("BLACK"),
    RED("RED"),
    BLUE("BLUE");

    private String value;
    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
