public class Musician {
    private String stageName;
    private String instrument;

    public Musician(String name, String instrument) {
        this.stageName = name;
        this.instrument = instrument;
    }

    public String sayHi() {
        String greeting = "Hello! I'm " + this.stageName;
        if (this.instrument == "Voice") {
            greeting += ". I'll delight ya'll with my singing!";
        }
        return greeting;
    }
}
