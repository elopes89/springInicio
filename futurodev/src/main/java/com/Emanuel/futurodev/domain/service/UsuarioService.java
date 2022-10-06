package com.Emanuel.futurodev.domain.service;

import com.Emanuel.futurodev.domain.model.ClienteModel;
import com.Emanuel.futurodev.domain.model.EnderecoModel;
import com.Emanuel.futurodev.domain.repository.UsuarioRepository;
import com.Emanuel.futurodev.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public void salvar(UsuarioDto usuarioDto) {
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf(usuarioDto.getCpf());
        clienteModel.setNome(usuarioDto.getNome());
        String statusDoCliente = statusDoClienteNoCerasa(usuarioDto.getCpf());
        clienteModel.setStatusCliente(statusDoCliente);
        usuarioRepository.salvarCliente(clienteModel);

        EnderecoModel enderecoModel = new EnderecoModel ();
        enderecoModel.setCep (usuarioDto.getCep());
        enderecoModel.setCidade (usuarioDto.getCidade());
        enderecoModel.setEstado (usuarioDto.getEstado());
        enderecoModel.setRua (usuarioDto.getEstado());

        usuarioRepository.salvarEndereco(enderecoModel) ;
        System.out.println ( " cliente e endereço salvo com sucesso ");
    }
    private String statusDoClienteNoCerasa(String cpf) {
        return "Bom";
    }
}
