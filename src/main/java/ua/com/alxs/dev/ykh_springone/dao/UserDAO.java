package ua.com.alxs.dev.ykh_springone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.alxs.dev.ykh_springone.models.User;

public interface UserDAO extends JpaRepository<User,Integer> {

}
