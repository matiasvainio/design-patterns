package singleton;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import singleton.DTO.DTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 * Singleton that handles connection to user and note collections in database.
 */
public class DbHandler {
    private static final String COLLECTION = "test";
    private static DbHandler INSTANCE;
    private static String DBNAME = "test";
    private final MongoDatabase database;
    private final MongoCollection<DTO> mongoCollection;
    private final MongoClient mongoClient;

    /**
     * Creates connection to mongodb and sets up collection.
     */
    private DbHandler() {
        this.mongoClient = createMongoClient();
        this.database = mongoClient.getDatabase(DBNAME);

        this.mongoCollection = database.getCollection(COLLECTION, DTO.class);
    }

    public static DbHandler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DbHandler();
        }
        return INSTANCE;
    }

    public MongoClient createMongoClient() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        ConnectionString connectionString = new ConnectionString(readConnectionString());
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .applyConnectionString(connectionString)
                .retryWrites(true)
                .build();
        return MongoClients.create(settings);
    }

    /**
     * For now read mongo connection string from resources folder.
     *
     * @return connection string.
     */
    public String readConnectionString() {
        InputStream is = getClass().getClassLoader().getResourceAsStream("mongoDB.txt");
        String line = "";

        try {
            assert is != null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

    public MongoCollection<DTO> getMongoCollection() {
        return mongoCollection;
    }

    public void setDatabaseName(String name) {
        DBNAME = name;
    }

    public void closeConnection() {
        this.mongoClient.close();
    }
}
