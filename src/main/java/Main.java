public class Main {
    public static void main(String[] args) {
        System.out.println("Getting the Band together...");

        Musician singer = new Musician("Julian", "Voice");
        System.out.println(singer.sayHi());

        Guitarist shredder = new Guitarist("Nick");
        System.out.println(shredder.sayHi());
        shredder.playRiff();

        Drummer stickMonkey = new Drummer("Fabrizio");
        System.out.println(stickMonkey.sayHi());
        stickMonkey.breakItDown();
    }
}
