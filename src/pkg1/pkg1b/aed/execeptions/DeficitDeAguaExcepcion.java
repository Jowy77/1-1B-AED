package pkg1.pkg1b.aed.execeptions;

import java.io.IOException;

public class DeficitDeAguaExcepcion extends IOException {

    public DeficitDeAguaExcepcion() {
    }

    public DeficitDeAguaExcepcion(String message) {
        super(message);
    }

    public DeficitDeAguaExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public DeficitDeAguaExcepcion(Throwable cause) {
        super(cause);
    }
    
    
    
}
