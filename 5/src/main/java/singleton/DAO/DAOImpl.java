package singleton.DAO;

import singleton.DTO.DTO;
import singleton.DTO.DTOImpl;
import singleton.DbHandler;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

public class DAOImpl implements DAO {
    @Override
    public void create(DTO dto) {
        DbHandler.getInstance().getMongoCollection().insertOne(dto);
    }

    @Override
    public List<DTO> read() {
        return DbHandler.getInstance().getMongoCollection().find(DTOImpl.class).into(new ArrayList<>());
    }

    @Override
    public void update(DTO dto) {
        DbHandler.getInstance()
                .getMongoCollection()
                .updateOne(eq("_id", dto.getId()),
                        combine(set("data", dto.getData())));

    }

    @Override
    public void delete(DTO dto) {
        DbHandler.getInstance()
                .getMongoCollection()
                .deleteOne(eq("_id", dto.getId()));
    }
}
