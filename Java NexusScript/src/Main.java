import Analizador.GramaticaTokenManager;
import Analizador.SimpleCharStream;
import Analizador.Token;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    private static File file;
    public static void main(String[] args) {
        Main.getFile();
        if (file == null) {
            JOptionPane.showMessageDialog(null, "Archivo no valido");
            System.exit(-1);
        }
        try {
            GramaticaTokenManager lexer = new GramaticaTokenManager
                    (new SimpleCharStream(new FileReader(Main.file)));

            Token token;

            while ((token = lexer.getNextToken()).kind != GramaticaTokenManager.EOF){}

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private final static void getFile()
    {
        JFileChooser search = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Archivos de codigo fuente", "txt");

        search.setFileFilter(filter);
        search.setFileFilter(filter2);

        int option = search.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            Main.file = search.getSelectedFile();
        }
    }
}
