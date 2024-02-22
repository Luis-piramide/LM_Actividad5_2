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
            NodeList libros = elementoraiz.getElementsByTagName("libro");
            for (int i = 0; i< libros.getLength();i++){
                Element elementolibro = (Element) libros.item(i);
                Element elementoTitulo = (Element) elementolibro.getElementsByTagName("titulo").item(0);
                System.out.println("Titulo: "+ elementoTitulo.getTextContent());
                Element elementoAutor = (Element) elementolibro.getElementsByTagName("autor").item(0);
                System.out.println("Autor: "+elementoAutor.getTextContent());
                Element elementoGenero = (Element) elementolibro.getElementsByTagName("genero").item(0);
                System.out.println("Género: "+ elementoGenero.getTextContent());
                Element elementoanio = (Element) elementolibro.getElementsByTagName("anio").item(0);
                System.out.println("Año:"+ elementoanio.getTextContent());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
