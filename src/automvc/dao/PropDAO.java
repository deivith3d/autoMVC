/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automvc.dao;

import automvc.model.Proprietario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author deivi
 */
public class PropDAO {

    public void Incluir(Proprietario prop) {
        String sql =  "INSERT INTO proprietario (nomeProp, cpfProp, foneProp, bairroProp) VALUES ( "
                    + " '" + prop.getNomeProp() +   "' ,  "
                    + " '" + prop.getCpfProp() +  "' ,  "
                    + " '" + prop.getFoneProp() +"' , "
                    + " '" + prop.getBairroProp() +"'  ) ";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Registro incluido com sucesso!!!");
    }

    public Proprietario Consultar(String cpfp) {
     Proprietario prop=null;
        String sql = "SELECT * FROM proprietario WHERE cpfProp = '"+ cpfp+"';";
       // System.out.println(sql);
        
        ResultSet rs = Conexao.consultar( sql );
        int id =0;
        String nome="";
        String cpf="";
        String fone="";
        String bairro="";
        if( rs != null){
            try{
                if (rs.next()) {  
                    id = rs.getInt( 1 );
                    nome = rs.getString( 2 );
                    cpf = rs.getString( 3 );
                    fone = rs.getString( 4 );
                    bairro = rs.getString( 5 );
                    prop = new Proprietario(id,nome, cpf, fone, bairro);
                }
                    
            }catch(Exception e){
                System.out.println("==>" + e);
            }
        }
        return prop;
    }

    public void Alterar(Proprietario prop) {
        String sql =  "UPDATE proprietario SET "
                + " nomeProp = '" + prop.getNomeProp() +   "' ,  "
                + " cpfProp  = '" + prop.getCpfProp() +  "' ,  "
                + " foneProp = '" + prop.getFoneProp() +"' , "
                + " bairroProp = '"+ prop.getBairroProp() +"'  "
                + " WHERE idProp = "+ prop.getIdProp()+" ;";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!!!");
    }

    public void Excluir(String cpf) {
        String sql =  "DELETE from proprietario WHERE cpfProp = '"+cpf+"' ;";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!!!");
    }
}
