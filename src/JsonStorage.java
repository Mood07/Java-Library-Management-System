import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage {

    private static final String FILE_NAME = "library.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void save(List<Book> books) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(books, writer);
            System.out.println("📁 Data saved to library.json");
        } catch (IOException e) {
            System.out.println("❌ Failed to save data.");
            e.printStackTrace();
        }
    }

    public static List<Book> load() {
        try (FileReader reader = new FileReader(FILE_NAME)) {
            Type listType = new TypeToken<ArrayList<Book>>(){}.getType();
            List<Book> books = gson.fromJson(reader, listType);

            if (books == null) return new ArrayList<>();
            return books;

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
