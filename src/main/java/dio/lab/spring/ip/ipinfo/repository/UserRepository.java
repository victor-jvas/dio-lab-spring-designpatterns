package dio.lab.spring.ip.ipinfo.repository;

import dio.lab.spring.ip.ipinfo.model.UserIP;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserIP, Long> {
}
