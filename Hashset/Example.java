import java.util.*;

class Film{
    String id;
    String directorId;
    int year;

    public Film(String id, String directorId, int year) {
        this.id = id;
        this.directorId = directorId;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getDirectorId() {
        return directorId;
    }
}

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of films
        int numFilms = Integer.parseInt(scanner.nextLine());

        // Create a list to store films
        List<Film> films = new ArrayList<>();

        // Read film details
        for (int i = 0; i < numFilms; i++) {
            String[] filmDetails = scanner.nextLine().split(" ");
            films.add(new Film(filmDetails[0], filmDetails[1], Integer.parseInt(filmDetails[2])));
        }

        // Read the director ID for which films need to be listed
        String directorIdToFind = scanner.nextLine();

        // Output films directed by the specified director
        for (Film film : films) {
            if (film.getDirectorId().equals(directorIdToFind)) {
                System.out.println(film.getId());
            }
        }
    }
}
