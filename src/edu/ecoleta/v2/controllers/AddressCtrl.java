package edu.ecoleta.v2.controllers;

import edu.ecoleta.v2.models.AddressModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressCtrl {

    private Connection conn = null;
    private PreparedStatement stmt;
    private ResultSet result;

    public AddressModel listAddressById(String id) throws ClassNotFoundException, SQLException {

        AddressModel am = new AddressModel();

        conn = DBConnection.getConn();

        if (conn == null) {
            return null;
        }

        String sql = "SELECT * FROM tb_address WHERE point_id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);

        result = stmt.executeQuery();

        if (result == null) {
            return null;
        }

        while (result.next()) {
            am.setId(result.getInt("id"));
            am.setZipcode(result.getString("zipcode"));
            am.setPublicPlace(result.getString("publicPlace"));
            am.setNumber(result.getInt("number"));
            am.setComplement(result.getString("complement"));
            am.setDistrict(result.getString("district"));
            am.setUf(result.getString("uf"));
            am.setCity(result.getString("city"));
            am.setPointId(result.getString("point_id"));
        }

        return am;

    }

    public void updateAddress(AddressModel am) throws ClassNotFoundException, SQLException {

        conn = DBConnection.getConn();

        String sql = "UPDATE tb_address SET zipcode = ?, publicPlace = ?, number = ?, complement = ?, district = ?, uf = ?, city = ? WHERE id = ? AND point_id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, am.getZipcode());
        stmt.setString(2, am.getPublicPlace());
        stmt.setString(3, String.valueOf(am.getNumber()));
        stmt.setString(4, am.getComplement());
        stmt.setString(5, am.getDistrict());
        stmt.setString(6, am.getUf());
        stmt.setString(7, am.getCity());
        stmt.setString(8, String.valueOf(am.getId()));
        stmt.setString(9, am.getPointId());

        stmt.executeUpdate();

    }

}
