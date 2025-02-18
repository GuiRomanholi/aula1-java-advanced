package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.ClienteRequest;
import br.com.fiap.api_rest.dto.ClienteResponse;
import br.com.fiap.api_rest.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    public Cliente requestToCliente(ClienteRequest clienteRequest){
        return new Cliente(null, clienteRequest.getNome(), clienteRequest.getIdade());
    }

    public ClienteResponse clienteToResponse(Cliente cliente){
        return new ClienteResponse(cliente.getId(), cliente.getNome());
    }

    public List<ClienteResponse> clienteResponses(List<Cliente> clientes){
        List<ClienteResponse> clienteResponses = new ArrayList<>();
        for (Cliente cliente : clientes){
            clienteResponses.add(clienteToResponse(cliente));
        }
        return clienteResponses;
        //return clientes.stream().map(cliente -> clienteToResponse(cliente)).collect(Collectors.toList());
    }
}
