class DVD {
        public String name;
        public String director;
        public int releaseYear;

    public DVD(String name, String director, int releaseYear) {
        this.name = name;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

public class DVDCollection {
    public static void main(String [] args) {
        DVD[] dvdCollection = new DVD[15];
        
        DVD avengers = new DVD("The Avengers", "Joss Whedon", 2012);
        DVD lionKing = new DVD("The Lion King", "Jon Favreau", 2019);
        
        dvdCollection[7] = avengers;
        dvdCollection[3] = lionKing;
        
        System.out.println(dvdCollection[7]);
        System.out.println("The maximum capacity of the DVD Collection is " + dvdCollection.length);
    }

}
