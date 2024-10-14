package com.consuban.investment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.consuban.investment.Objetos.Branch;
import com.consuban.investment.Objetos.Client;
import com.consuban.investment.Objetos.ClientHasBranch;
import com.consuban.investment.Repositorio.BranchRepository;
import com.consuban.investment.Repositorio.ClientHasBranchRepository;
import com.consuban.investment.Repositorio.ClientRepository;


@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private ClientHasBranchRepository clientHasBranchRepository;

    @Override
public void run(String... args) throws Exception {
    // Crear un cliente
    Client client = new Client();
    client.setIdClient("CL001");
    client.setClientName("Juan Pérez");
    client.setPhoneNum("5551234567");
    client.setClientCol("Colonia Ejemplo");

    Branch branch1 = new Branch();
    branch1.setIdBranch(1L);
    branch1.setBranchName("Sucursal Principal");
    branch1.setAddress("Ciudad de México");

    branchRepository.save(branch1); // Guardar en base de datos

    System.out.println("Sucursal inicial insertada en la base de datos");

    Branch branch2 = new Branch();
    branch2.setIdBranch(Long.parseLong("2")); // Cambiado para ser compatible con Long
    branch2.setBranchName("Sucursal Secundaria");
    branch2.setAddress("Guadalajara");

    // Guardar cliente y sucursales primero para asegurar su existencia en la base de datos
    clientRepository.save(client);
    branchRepository.save(branch1);
    branchRepository.save(branch2);

    // Crear las relaciones entre el cliente y las sucursales
    ClientHasBranch clientBranch1 = new ClientHasBranch();
    clientBranch1.setClient(client);
    clientBranch1.setBranch(branch1);

    ClientHasBranch clientBranch2 = new ClientHasBranch();
    clientBranch2.setClient(client);
    clientBranch2.setBranch(branch2);

    // Luego guardar las relaciones en la base de datos
    clientHasBranchRepository.save(clientBranch1);
    clientHasBranchRepository.save(clientBranch2);

    // Mensaje para confirmar la inserción de datos iniciales
    System.out.println("Datos iniciales insertados en la base de datos");
}

}
