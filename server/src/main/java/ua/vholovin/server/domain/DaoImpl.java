package ua.vholovin.server.domain;


import org.springframework.beans.factory.annotation.Autowired;

public class DaoImpl {
    private static DaoImpl daoImpl;
    @Autowired
    private Dao dao;

    protected DaoImpl() {
        daoImpl = this;
    }

    public void save(Actor actor) {
        dao.save(actor);
    }

    public static synchronized DaoImpl getInstance() {
        if (daoImpl == null) {
            daoImpl = new DaoImpl();
        }
        return daoImpl;
    }

}
