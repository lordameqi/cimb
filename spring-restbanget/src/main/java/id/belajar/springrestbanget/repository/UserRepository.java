package id.belajar.springrestbanget.repository;

import id.belajar.springrestbanget.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
