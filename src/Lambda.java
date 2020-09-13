import java.io.Closeable;
import java.io.IOException;

public class Lambda {
    public static void main(String[] args) throws IOException {
        Closeable closeable = new Closeable() {
            @Override
            public void close() throws IOException {
                System.out.println("Closing io stuff");
            }
        };

        Closeable closeable1 = () -> System.out.println("Closing io stuff with lambda");

        closeable.close();
        closeable1.close();
    }
}
