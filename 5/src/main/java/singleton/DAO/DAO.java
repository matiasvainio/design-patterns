package singleton.DAO;

import singleton.DTO.DTO;

import java.util.List;

public interface DAO {

    void create(DTO dto);

    List<DTO> read();

    void update(DTO dto);

    void delete(DTO dto);
}
