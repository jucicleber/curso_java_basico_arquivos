package olamundo;


import java.awt.*;

public class HoraDoSistema {
        public static void main(String[] args) {
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
            System.out.println("Screen width = " + d.width);
            System.out.println("Screen height = " + d.height);

        }
    }
