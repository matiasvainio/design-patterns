package singleton;

import singleton.DAO.DAO;
import singleton.DAO.DAOImpl;
import singleton.DTO.DTO;
import singleton.DTO.DTOImpl;

public class Main {

    public static void main(String[] args) {

        DAO dao = new DAOImpl();
        DTO dto = new DTOImpl();
        dto.setData("Hello World!");

        dao.create(dto);
        System.out.println(dao.read().get(0).getData());

        dao.delete(dao.read().get(0));

        System.out.println(dao.read());
    }
}
