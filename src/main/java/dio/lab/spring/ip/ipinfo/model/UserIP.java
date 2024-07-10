package dio.lab.spring.ip.ipinfo.model;

import jakarta.persistence.*;

@Entity
public class UserIP {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private IpInformation ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpInformation getIp() {
        return ip;
    }

    public void setIp(IpInformation ip) {
        this.ip = ip;
    }


}
