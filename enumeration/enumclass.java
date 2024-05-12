class enumclass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myval = Level.MEDIUM;
        System.out.println(myval);

        for (Level myVal : Level.values()) {
            System.out.println(myVal);
        }
    }
}
