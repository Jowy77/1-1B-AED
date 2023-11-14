
package pkg1.pkg1b.aed.execeptions;

import java.io.IOException;


public class PiscinaDesbordadaExcepcion extends IOException {

    public PiscinaDesbordadaExcepcion() {
    }

    public PiscinaDesbordadaExcepcion(String message) {
        super(message);
    }

    public PiscinaDesbordadaExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public PiscinaDesbordadaExcepcion(Throwable cause) {
        super(cause);
    }
    
    
    
}
