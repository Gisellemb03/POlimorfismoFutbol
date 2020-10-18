/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafutbol;

/**
 *
 * 
 */
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }
// getter y setter

    public Entrenador(int id, String Nombre, String Apellidos, int Edad, String idFederacion) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String dirigirPartido() {
        return "Dirigiendo el partido";
    }

    public String dirigirEntrenamiento() {
        return "Dirigiendo el entrenamiento";
    }
}
