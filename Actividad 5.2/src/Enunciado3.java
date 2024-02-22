//A partir del fichero xml utilizado en el enunciado 3,  crea un programa que determine si el número de
// teléfono introducido por teclado corresponde algún usuario. En caso afirmativo muestra el nombre de dicho usuario.
// Para ello, almacena todos los números de teléfono en una colección.

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class Enunciado3 {
    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("Resources/Enunciado3");
            Document document = documentBuilder.parse(file);

            Element elementoraiz = document.getDocumentElement();
            NodeList usuarios = elementoraiz.getElementsByTagName("usuario");

            for (int i = 0; i< usuarios.getLength(); i++){
                Element elementousuario = (Element) usuarios.item(i);
                Element elementonombre = (Element) elementousuario.getElementsByTagName("nombre").item(0);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
