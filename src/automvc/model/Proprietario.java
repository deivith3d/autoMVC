/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automvc.model;

import automvc.dao.PropDAO;


public class Proprietario {
    private int idProp;
    private String nomeProp;
    private String cpfProp;
    private String foneProp;
    private String bairroProp;



    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public String getCpfProp() {
        return cpfProp;
    }

    public void setCpfProp(String cpfProp) {
        this.cpfProp = cpfProp;
    }

    public String getFoneProp() {
        return foneProp;
    }

    public void setFoneProp(String foneProp) {
        this.foneProp = foneProp;
    }

    public String getBairroProp() {
        return bairroProp;
    }

    public void setBairroProp(String bairroProp) {
        this.bairroProp = bairroProp;
    }

    public Proprietario(String nomeProp, String cpfProp, String foneProp, String bairroProp) {
        this.nomeProp = nomeProp;
        this.cpfProp = cpfProp;
        this.foneProp = foneProp;
        this.bairroProp = bairroProp;
   
    }
    
        public Proprietario(int id, String nomeProp, String cpfProp, String foneProp, String bairroProp) {
            this.idProp = id;
            this.nomeProp = nomeProp;
            this.cpfProp = cpfProp;
            this.foneProp = foneProp;
            this.bairroProp = bairroProp;
    }

    public Proprietario() {
    }


    public void Incluir(Proprietario prop) {
        PropDAO pDAO = new PropDAO();
        pDAO.Incluir(prop);
    }

    public Proprietario Consultar(String cpf) {
        PropDAO pDAO = new PropDAO();
        return pDAO.Consultar(cpf);
    }

    public void Alterar(Proprietario prop) {
        PropDAO pDAO = new PropDAO();
        pDAO.Alterar(prop);
    }

    public void Excluir(String cpf) {
        PropDAO pDAO = new PropDAO();
        pDAO.Excluir(cpf);
    }
    
    
}
