package com.consuban.investment.Controladores;

import com.consuban.investment.DTO.ClientDTO;
import com.consuban.investment.Objetos.Client;
import com.consuban.investment.Servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Crear un nuevo cliente
    @PostMapping("/saveClient")
    public ResponseEntity<ClientDTO> saveClient(@RequestBody ClientDTO clientDTO) {
        Client client = clientService.convertToEntity(clientDTO);
        Client savedClient = clientService.saveClient(client);
        return ResponseEntity.ok(clientService.convertToDTO(savedClient));
    }

    // Actualizar un cliente existente
    @PutMapping("/updateClient")
    public ResponseEntity<ClientDTO> updateClient(@RequestBody ClientDTO clientDTO) {
        Client client = clientService.convertToEntity(clientDTO);
        Client updatedClient = clientService.updateClient(client);
        return ResponseEntity.ok(clientService.convertToDTO(updatedClient));
    }

    // Obtener un cliente por su ID
    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDTO> getClient(@PathVariable String clientId) {
        Optional<Client> client = clientService.getClient(clientId);
        return client.map(value -> ResponseEntity.ok(clientService.convertToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar un cliente por su ID
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable String clientId) {
        clientService.deleteClient(clientId);
        return ResponseEntity.ok().build();
    }

    // Obtener todos los clientes
    @GetMapping("/all")
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        List<ClientDTO> clientDTOs = clients.stream()
                                             .map(clientService::convertToDTO)
                                             .collect(Collectors.toList());
        return ResponseEntity.ok(clientDTOs);
    }
}
