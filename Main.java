public class Main {
    public static void main(String[] args) {
               
        Movie movie1 = new Movie();
        movie1.title = "Inception";
        movie1.genre = "Sci-Fi";
        movie1.duration = 148;
        
        Movie movie2 = new Movie();
        movie2.title = "Home alone";
        movie2.genre = "Comedy";
        movie2.duration = 100;

        Movie movie3 = new Movie();
        movie3.title = "Titanic";
        movie3.genre = "Romance";
        movie3.duration = 106;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}
