/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu1;

/**
 *
 * @author Student
 */
public final class Cerc extends Forma {
    
    private double raza;
    
    public Cerc(double raza) {
        this.raza = raza;
    }
    
    public final double arie() {
        return Math.PI * raza * raza;
    }
}
