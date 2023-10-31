/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automvc.controller;

import automvc.model.Proprietario;

/**
 *
 * @author deivi
 */
public class PropController {



    public void Incluir(String nome, String cpf, String telefone, String bairro) {
        //Fazer validações
        if(!nome.equals("")&&!cpf.equals("")&&!telefone.equals("")&&!bairro.equals(""))
        {
            Proprietario prop = new Proprietario(nome,cpf,telefone,bairro);
            prop.Incluir(prop);
        }
    }

    public Proprietario Consultar(String cpf) {
        Proprietario p = new Proprietario();
        
       return p.Consultar(cpf);
    }

    public void Alterar(int id, String nome, String cpf, String telefone, String bairro) {
        if(!nome.equals("")&&!cpf.equals("")&&!telefone.equals("")&&!bairro.equals(""))
        {
            Proprietario prop = new Proprietario(id,nome,cpf,telefone,bairro);
            prop.Alterar(prop);
        }
    }

    public void Excluir(String cpf) {
       Proprietario p = new Proprietario();
       p.Excluir(cpf);
    }
    
}
