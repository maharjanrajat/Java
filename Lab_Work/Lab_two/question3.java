class question3 {

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        question3 qs = new question3();
        System.out.println(qs.formatNumber(500));
        System.out.println(qs.formatNumber(89.9934));
        System.out.println(qs.formatNumber("550"));
    }
}