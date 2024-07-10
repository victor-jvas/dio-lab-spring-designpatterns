package dio.lab.spring.ip.ipinfo.repository;

import dio.lab.spring.ip.ipinfo.model.IpInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpInformationRepository extends CrudRepository<IpInformation, String> {
}
