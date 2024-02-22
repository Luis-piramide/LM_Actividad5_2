//Mediante el entorno de desarrollo IntelliJ IDEA, el lenguaje de programación Java y DOM, lee el
// siguiente fichero xml, y muestra todos los valores por pantalla, de la misma manera que se indica
// en el siguiente recuadro.

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class Enunciado2 {
    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("Resources/Enunciado2.xml");
            Document document = documentBuilder.parse(file);

            System.out.println("Usuarios:");

            Element elementoraiz = document.getDocumentElement();
            NodeList usuarios = elementoraiz.getElementsByTagName("usuario");
            for (int i = 0; i< usuarios.getLength(); i++){
                Element elementousuario = (Element) usuarios.item(i);
                System.out.println("Usuario "+ elementousuario.getAttribute("id")+":");
                Element elementonombre = (Element) elementousuario.getElementsByTagName("nombre").item(0);
                System.out.println("Nombre: "+elementonombre.getTextContent()+" "+elementonombre.getAttribute("apellido"));
                System.out.println("Edad: "+elementonombre.getAttribute("edad")+" años");
                Element elementocontacto = (Element) elementousuario.getElementsByTagName("contacto").item(0);
                Element elementoemail = (Element) elementocontacto.getElementsByTagName("email").item(0);
                System.out.println("Email: "+elementoemail.getTextContent());
                Element elementotelefono = (Element) elementocontacto.getElementsByTagName("telefono").item(0);
                System.out.println("Teléfono: "+elementotelefono.getTextContent());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
