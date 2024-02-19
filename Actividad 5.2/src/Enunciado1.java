//Mediante el entorno de desarrollo IntelliJ IDEA, el lenguaje de programación Java y DOM, lee el siguiente fichero xml,
// y muestra todos los valores por pantalla.

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class Enunciado1 {
    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("Resources/Enunciado1.xml");
            Document document = documentBuilder.parse(file);

            Element elementoraiz = document.getDocumentElement();
            NodeList libro = elementoraiz.getElementsByTagName("libro");
            for (int i = 0; i< libro.getLength();i++){
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
