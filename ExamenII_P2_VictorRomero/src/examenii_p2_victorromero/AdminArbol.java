package examenii_p2_victorromero;

import java.io.Serializable;
import javax.swing.JTree;

public class AdminArbol implements Serializable {

    private JTree arbol;

    public AdminArbol(JTree arbol) {
        this.arbol = arbol;
    }

    public JTree getArbol() {
        return arbol;
    }

    public void setArbol(JTree arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return "AdmArbol{" + "arbol=" + arbol + '}';
    }

}
