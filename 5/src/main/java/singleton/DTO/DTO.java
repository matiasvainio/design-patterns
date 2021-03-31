package singleton.DTO;

import org.bson.types.ObjectId;

public interface DTO {

    void setData(String data);

    String getData();

    void setId(ObjectId id);

    ObjectId getId();

}
