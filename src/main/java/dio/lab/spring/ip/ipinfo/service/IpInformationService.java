package dio.lab.spring.ip.ipinfo.service;

import dio.lab.spring.ip.ipinfo.model.IpInformation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ipinfo", url = "https://ipapi.co/")
public interface IpInformationService {

    @GetMapping(value = "/{ip}/json/")
    IpInformation getIpInformation(@PathVariable("ip") String ip);
}
