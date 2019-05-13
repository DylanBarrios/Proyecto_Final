package fynal.project;

/**
 *
 * @author Usuario
 */
public class tmp {

public static String tmp = "";

    /**
     * @return the tmp
     * Metodo que me servira para guardar variables y generar el juego que 
     *haya guardado
     */
    public static String getTmp() {
        return tmp;
    }

    /**
     * @param aTmp the tmp to set
     */
    public static void setTmp(String aTmp) {
        tmp = aTmp;
    }

    
    public void muestra(){
        System.out.println(getTmp());
    }
}
