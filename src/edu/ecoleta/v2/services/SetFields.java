package edu.ecoleta.v2.services;

import edu.ecoleta.v2.components.JTextFieldWithPlaceholder;
import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.ResultSearchCep;
import javax.swing.JComboBox;

public class SetFields {

    public static void setFields(JTextFieldWithPlaceholder address, JTextFieldWithPlaceholder complement, JTextFieldWithPlaceholder district, JComboBox uf, JComboBox city, ResultSearchCep rsc) {

        address.setText(rsc.getPublicPlace());
        complement.setText(rsc.getComplement());
        district.setText(rsc.getDistrict());
        uf.setSelectedItem(rsc.getUf());
        city.setSelectedItem(rsc.getLocality());

    }

    public static void setFields(AddressModel am, JTextFieldWithPlaceholder id, JTextFieldWithPlaceholder zipcode, JTextFieldWithPlaceholder address, JTextFieldWithPlaceholder number, JTextFieldWithPlaceholder complement, JTextFieldWithPlaceholder district, JComboBox uf, JComboBox city, JTextFieldWithPlaceholder pointId) {

        id.setText(String.valueOf(am.getId()));
        zipcode.setText(am.getZipcode());
        address.setText(am.getPublicPlace());
        number.setText(String.valueOf(am.getNumber()));
        complement.setText(am.getComplement());
        district.setText(am.getDistrict());
        uf.setSelectedItem(am.getUf());
        city.setSelectedItem(am.getCity());
        pointId.setText(am.getPointId());

    }

    public static void addMunicipos(JComboBox c1, JComboBox c2) {
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione uma cidade"}));
        Utils.deserializeMunicipios(c1, c2.getSelectedItem().toString());
    }

}
