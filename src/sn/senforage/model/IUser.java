package sn.senforage.model;

import sn.senforage.entities.User;

import java.util.List;

public interface IUser {
    public int add(User utilisateur);
    public List<User> users();
    public User getLogin(String email, String password);
    public int delete(int id, User utilisateur);
}
