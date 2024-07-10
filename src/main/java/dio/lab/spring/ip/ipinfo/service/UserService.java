package dio.lab.spring.ip.ipinfo.service;

import dio.lab.spring.ip.ipinfo.model.UserIP;

public interface UserService {

    Iterable<UserIP> buscarTodos();

    UserIP buscarPorId(Long id);

    void salvar(UserIP user);

    void editar(Long id, UserIP user);

    void excluir(Long id);


}
