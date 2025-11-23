/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion8;

/**
 *
 * @author nicoo
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return ("\nFirma digital del usuario:\nCodigo Hash: " + codigoHash + 
                "\nFecha de firma: " + fecha);
    }
}
