package singleton.DTO;

import org.bson.types.ObjectId;

public class DTOImpl implements DTO {
    private ObjectId id;
    private String data;

    public DTOImpl() {
        this.id = new ObjectId();
        this.data = null;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public ObjectId getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DTOImpl{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
