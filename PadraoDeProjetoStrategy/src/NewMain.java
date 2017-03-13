
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleide
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexao con = null;
        for (int i = 0; i < 10; i++) {
            con = Conexao.getInstance();
        }
        con.getConnection();
        
        CursoController c = new CursoController();
        ArrayList<Object> l;
        l = c.getAll();
       // CursoModel t = new CursoModel();
         CursoModel t =  (CursoModel) l.get(0);
        CursoModel t2 = (CursoModel)l.get(1);
        System.out.println(t.getId());
        System.out.println(t2.getId());
    }
    
    
}
