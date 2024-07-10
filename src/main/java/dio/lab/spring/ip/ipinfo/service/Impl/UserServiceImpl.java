package dio.lab.spring.ip.ipinfo.service.Impl;

import dio.lab.spring.ip.ipinfo.model.IpInformation;
import dio.lab.spring.ip.ipinfo.model.UserIP;
import dio.lab.spring.ip.ipinfo.repository.IpInformationRepository;
import dio.lab.spring.ip.ipinfo.repository.UserRepository;
import dio.lab.spring.ip.ipinfo.service.IpInformationService;
import dio.lab.spring.ip.ipinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private IpInformationRepository ipInformationRepository;
    @Autowired
    private IpInformationService ipInformationService;


    @Override
    public Iterable<UserIP> buscarTodos() {
        return userRepository.findAll();
    }

    @Override
    public UserIP buscarPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void salvar(UserIP user) {
        salvarUserComIP(user);
    }

    private void salvarUserComIP(UserIP user) {
        String ip = user.getIp().getIp();
        IpInformation ipInformation = ipInformationRepository.findById(ip).orElseGet(() -> {
            IpInformation ipInformation1 = ipInformationService.getIpInformation(ip);
            ipInformationRepository.save(ipInformation1);
            return ipInformation1;
        });
        user.setIp(ipInformation);
        userRepository.save(user);
    }

    @Override
    public void editar(Long id, UserIP user) {
        Optional<UserIP> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            salvarUserComIP(user);
        }
    }

    @Override
    public void excluir(Long id) {
        userRepository.deleteById(id);
    }
}
