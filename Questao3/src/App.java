import java.util.Locale;

import com.compreaqui.Processos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        
        Processos processos = new Processos();
        processos.iniciar();
    }
}
