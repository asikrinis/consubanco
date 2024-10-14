package com.consuban.investment.Servicio;

import com.consuban.investment.DTO.ClientDTO;
import com.consuban.investment.Objetos.Client;
import com.consuban.investment.Repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Guardar un cliente
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // Actualizar un cliente existente
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    // Obtener un cliente por su ID
    public Optional<Client> getClient(String clientId) {
        return clientRepository.findById(clientId);
    }

    // Obtener todos los clientes
    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    // Eliminar un cliente por su ID
    public void deleteClient(String clientId) {
        clientRepository.deleteById(clientId);
    }

    // Convertir de ClientDTO a Client
    public Client convertToEntity(ClientDTO clientDTO) {
        Client client = new Client();
        client.setIdClient(clientDTO.getIdClient());
        client.setClientName(clientDTO.getClientName());
        client.setPhoneNum(clientDTO.getPhoneNum());
        client.setClientCol(clientDTO.getClientCol());
        return client;
    }

    // Convertir de Client a ClientDTO
    public ClientDTO convertToDTO(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setIdClient(client.getIdClient());
        clientDTO.setClientName(client.getClientName());
        clientDTO.setPhoneNum(client.getPhoneNum());
        clientDTO.setClientCol(client.getClientCol());
        return clientDTO;
    }
}
