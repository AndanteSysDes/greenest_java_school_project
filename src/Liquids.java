public enum Liquids {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    String value;

    Liquids(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}