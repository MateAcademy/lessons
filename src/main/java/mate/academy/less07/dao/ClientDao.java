package mate.academy.less07.dao;

import mate.academy.less07.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
