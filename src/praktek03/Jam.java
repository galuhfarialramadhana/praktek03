/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek03;

/**
 *
 * @author Galuh Farial R
 */
public class Jam extends JamTangan {
    private String jenisJam;
    
    void throttle() {
        System.out.println("Mantaaappp");
    }

    public String getJenisJam() {
        return jenisJam;
    }

    public void setJenisJam(String jenisJam) {
        this.jenisJam = jenisJam;
    }
    
    
}
