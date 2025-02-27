public class NYSE implements Exchange {
    private String accessKey;

    public NYSE(String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public float rate(String origin, String target) {
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.5f;
        } else if (origin.equals("Euro") && target.equals("USD")) {
            return 2.0f;
        }
        return 1.0f;
    }

    @Override
    public String toString() {
        return "NYSE{" +
                "accessKey='" + accessKey + '\'' +
                '}';
    }
}
