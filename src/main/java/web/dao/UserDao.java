package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.entity.User;

import java.util.List;

public interface UserDao{
    public List getAllUsers();
    public User getUserById(Long id);
    public boolean saveUser(User user);
    public boolean deleteUserById(Long id);
}
