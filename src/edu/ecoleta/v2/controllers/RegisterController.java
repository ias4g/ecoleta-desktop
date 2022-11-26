package edu.ecoleta.v2.controllers;

import edu.ecoleta.v2.models.AddressModel;
import edu.ecoleta.v2.models.PointModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RegisterController {

    private Connection conn = null;
    private PreparedStatement stmt;
    private PreparedStatement stmt_address;
    private PreparedStatement stmt_point_items;

    public String createRegister(PointModel pm, AddressModel am, List<String> items) {

        try {

            conn = DBConnection.getConn();

            if (conn == null) {
                return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
            }

            conn.setAutoCommit(false);

            // INSERINDO DADOS NA TABELA TB_POINTS -------------------------------------------------------------------------------
            String pmSQL = "INSERT INTO tb_points(id, name, email, image, whatsapp, createdAt) values(?, ?, ?, ?, ?, current_timestamp())";
            stmt = conn.prepareStatement(pmSQL);

            stmt.setString(1, pm.getId());
            stmt.setString(2, pm.getName());
            stmt.setString(3, pm.getEmail());
            stmt.setBytes(4, pm.getImage());
            stmt.setString(5, pm.getWhatsApp());

            stmt.executeUpdate();
            stmt.close();
            // END TB_POINTS -----------------------------------------------------------------------------------------------------

            // INSERINDO DADOS NA TABELA TB_ADDRESS ------------------------------------------------------------------------------
            String amSQL = "INSERT INTO tb_address(zipcode, publicPlace, complement, number, district, uf, city, point_id) values(?, ?, ?, ?, ?, ?, ?, ?)";
            stmt_address = conn.prepareStatement(amSQL);

            stmt_address.setString(1, am.getZipcode());
            stmt_address.setString(2, am.getPublicPlace());
            stmt_address.setString(3, am.getComplement());
            stmt_address.setInt(4, am.getNumber());
            stmt_address.setString(5, am.getDistrict());
            stmt_address.setString(6, am.getUf());
            stmt_address.setString(7, am.getCity());
            stmt_address.setString(8, pm.getId());

            stmt_address.executeUpdate();
            // END TB_ADDRESS ---------------------------------------------------------------------------------------------------

            // INSERINDO DADOS NA TABELA TB_POINT_ITEMS -------------------------------------------------------------------------
            String pimSQL = "INSERT INTO tb_point_items(point_id, item_id) values(?, ?)";
            stmt_point_items = conn.prepareStatement(pimSQL);
            for (String it : items) {

                if (it != null) {
                    stmt_point_items.setString(1, pm.getId());
                    stmt_point_items.setInt(2, Integer.parseInt(it));

                    stmt_point_items.executeUpdate();
                }
            }
            // END TB_POINT_ITEMS

            conn.commit();

            return "ok";

        } catch (ClassNotFoundException | SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                return "=> Erro no rollback na class createPoint.\n=>Error: " + ex.getMessage();
            }

            return "=> Erro de SQL na class RegisterController, no metodo createPoint(). Error: " + ex.getMessage();
        }
    }
}
