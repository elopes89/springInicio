package com.Emanuel.futurodev.domain.repository;

import com.Emanuel.futurodev.domain.model.EnderecoModel;
import org.springframework.stereotype.Repository;
import com.Emanuel.futurodev.domain.model.ClienteModel;


@Repository
public class UsuarioRepository {
    public void salvarCliente(ClienteModel clienteModel) {
        var insertTable = " Insert into cliente ( nome , cpf ) values ( ) ";
        System.out.println(" cliente inserido com sucesso! " + clienteModel.toString());
    }

    public void salvarEndereco (EnderecoModel enderecoModel ) {
       //var insertTable = " Insert into endereço ( ) values ( )";
       System.out.println("Endereço salvo: " + enderecoModel.toString());
   }

}