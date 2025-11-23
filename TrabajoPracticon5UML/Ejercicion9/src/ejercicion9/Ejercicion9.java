/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion9;

/**
 *
 * @author nicoo
 */
public class Ejercicion9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Jorge Rial", "OSUTHGRA");
        Profesional profesional = new Profesional ("Fernando Mendez", "Cardiologo");
        CitaMedica citaMedica = new CitaMedica("23/10/2025", "15:00hs");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        citaMedica.mostrarCitaMedica();
        
        
        
    }
}
