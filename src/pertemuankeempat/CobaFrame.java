package pertemuankeempat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
        
public class CobaFrame {
    public static void main(String[] args){
        //System.out.println("halo dunia");
        //membuat frame
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //membuat label
        JLabel nama = new JLabel("Paul");
     
     
        frame.add(nama);
        
        JButton tombol = new JButton("Oke");
        
        //tombol.setSize(100, 200);
        
        frame.add(tombol);
        
        //mengukur ukuran frame
        frame.setSize(1000,400);
        
        //menampilkan frame
        frame.setVisible(true);
    }
        
    
}
