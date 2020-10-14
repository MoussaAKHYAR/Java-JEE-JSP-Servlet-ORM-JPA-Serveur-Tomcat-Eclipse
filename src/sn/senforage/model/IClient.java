package sn.senforage.model;

import sn.senforage.entities.Client;

import java.util.List;

public interface IClient {
    public int add(Client client);
    public List<Client> clients();
}
