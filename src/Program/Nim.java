/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Comparator;
/**
 *
 * @author TRIASNO
 */
public class Nim implements Comparator<Mahasiswa> {
    
      @Override
    public int compare(Mahasiswa x, Mahasiswa y)
    {
        return x.getnim().compareToIgnoreCase(y.getnim());
    
    }
}
