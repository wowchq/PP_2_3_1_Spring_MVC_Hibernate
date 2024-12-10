package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    void add(User user);

    void update(User user);

    void delete(long id);

    User findById(long id);
}
