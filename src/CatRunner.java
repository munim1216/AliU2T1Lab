public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bettey", 1, 4.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jonnny", 24, 1);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
