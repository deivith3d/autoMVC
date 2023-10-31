/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automvc.model;


public class veiculo {
    private int idVeic;
    private String marcaVeic;
    private String modeloVeic;
    private String placaVeic;
    private String corVeic;

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getMarcaVeic() {
        return marcaVeic;
    }

    public void setMarcaVeic(String marcaVeic) {
        this.marcaVeic = marcaVeic;
    }

    public String getModeloVeic() {
        return modeloVeic;
    }

    public void setModeloVeic(String modeloVeic) {
        this.modeloVeic = modeloVeic;
    }

    public String getPlacaVeic() {
        return placaVeic;
    }

    public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
    }

    public String getCorVeic() {
        return corVeic;
    }

    public void setCorVeic(String corVeic) {
        this.corVeic = corVeic;
    }

    public veiculo(String marcaVeic, String modeloVeic, String placaVeic, String corVeic) {
        this.marcaVeic = marcaVeic;
        this.modeloVeic = modeloVeic;
        this.placaVeic = placaVeic;
        this.corVeic = corVeic;
    }

    public veiculo() {
    }
    
}
