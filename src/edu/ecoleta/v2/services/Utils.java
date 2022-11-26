package edu.ecoleta.v2.services;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.ecoleta.v2.components.JTextFieldWithPlaceholder;
import edu.ecoleta.v2.models.Municipios;
import edu.ecoleta.v2.models.ResultSearchCep;
import edu.ecoleta.v2.models.Ufs;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Utils {

    public static void deserializeUf(JComboBox combo) {

//        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione um estado"}));
        ConsumidorAPI consumidor = ConsumidorAPI.getInstance();
        String jsonEstados = consumidor.doRequest("estados");

        Type ufsTypes = new TypeToken<ArrayList<Ufs>>() {
        }.getType();

        List<Ufs> ufs = new Gson().fromJson(jsonEstados, ufsTypes);
        List<String> siglasUfs = new ArrayList<>();

        for (Ufs item : ufs) {
            siglasUfs.add(item.getSigla());
        }

        for (String item : siglasUfs) {
            combo.addItem(item);
        }

//        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione um estado"}));
    }

    public static void deserializeMunicipios(JComboBox combo, String sigla) {

        ConsumidorAPI consumidor = ConsumidorAPI.getInstance();
        String jsonMunicipios = consumidor.doRequest("estados/" + sigla + "/municipios");

        Type municipiosTypes = new TypeToken<ArrayList<Municipios>>() {
        }.getType();

        List<Municipios> namesMunicipios = new Gson().fromJson(jsonMunicipios, municipiosTypes);
        List<String> names = new ArrayList<>();

        for (Municipios item : namesMunicipios) {
            names.add(item.getNome());
        }

        for (String item : names) {
            combo.addItem(item);
        }
    }

    public static void openUrl(String url, JLabel label) throws URISyntaxException, IOException {

        label.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI(url);
        desktop.browse(uri);

        label.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }

    public static ResultSearchCep cepSearch(String zipcode) throws MalformedURLException, DocumentException {

        ResultSearchCep resultCep = new ResultSearchCep();
        URL url = new URL("https://viacep.com.br/ws/" + zipcode + "/xml/");

        SAXReader xml = new SAXReader();
        Document doc = xml.read(url);
        Element root = doc.getRootElement();

        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {

            Element el = it.next();

            switch (el.getQualifiedName()) {
                case "erro" ->
                    resultCep.setError(Boolean.valueOf(el.getText()));
                case "logradouro" ->
                    resultCep.setPublicPlace(el.getText());
                case "complemento" ->
                    resultCep.setComplement(el.getText());
                case "bairro" ->
                    resultCep.setDistrict(el.getText());
                case "localidade" ->
                    resultCep.setLocality(el.getText());
                case "uf" ->
                    resultCep.setUf(el.getText());
            }

        }

        return resultCep;

    }

    public static void fieldRestricted(JTextFieldWithPlaceholder text, JTextFieldWithPlaceholder number) {
        RestrictedTextField validZipcode = new RestrictedTextField(text);
        RestrictedTextField validNumber = new RestrictedTextField(number);

        validZipcode.setOnlyNums(true);
        validZipcode.setLimit(8);

        validNumber.setOnlyNums(true);
    }

    public static void insertIconFrame(JFrame frm) {
        try {
            frm.getContentPane().setBackground(new Color(217, 217, 217));
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/edu/ecoletav2/images/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void insertIconDialog(JDialog dialog) {
        try {
            dialog.getContentPane().setBackground(new Color(217, 217, 217));
            dialog.setIconImage(Toolkit.getDefaultToolkit().getImage("src/edu/ecoletav2/images/icon-system.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static byte[] getImageFile(File imageFile) throws IOException {

        boolean isPng = false;

        if (imageFile != null) {

            isPng = imageFile.getName().endsWith("png");

            BufferedImage image = ImageIO.read(imageFile);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int type = BufferedImage.TYPE_INT_RGB;

            if (isPng) {
                type = BufferedImage.BITMASK;
            }

            BufferedImage newImage = new BufferedImage(400, 400, type);
            Graphics2D g = newImage.createGraphics();
            g.setComposite(AlphaComposite.Src);
            g.drawImage(image, 0, 0, 400, 400, null);

            if (isPng) {
                ImageIO.write(newImage, "png", out);
            } else {
                ImageIO.write(newImage, "jpg", out);
            }

            out.flush();
            byte[] arrayByte = out.toByteArray();
            out.close();

            return arrayByte;

        }

        return null;
    }

    public static void openImageWithFile(File imageFile, JLabel image) {

        if (imageFile != null) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(image.getWidth(), image.getHeight(), 100));
            image.setText(null);
            image.setIcon(icon);
        }

    }

    public static void openImageWithBytes(byte[] imgByte, JPanel panel, JLabel image) {

        if (imgByte != null) {
            ImageIcon icon = new ImageIcon(imgByte);
            icon.setImage(icon.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), 1));
            image.setIcon(icon);
        }

    }

    public static File selectImage(JDialog frame) {

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens em JPEG  e PNG", "jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.showOpenDialog(frame);

        return fileChooser.getSelectedFile();

    }

}
