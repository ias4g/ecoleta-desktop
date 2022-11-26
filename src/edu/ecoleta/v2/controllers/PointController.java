package edu.ecoleta.v2.controllers;

import edu.ecoleta.v2.models.PointModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PointController {

    private Connection conn = null;
    private PreparedStatement stmt;
    private ResultSet result;

    public List<PointModel> listPoint() throws ClassNotFoundException, SQLException {

        List<PointModel> resultData = new ArrayList<>();

        conn = DBConnection.getConn();

        if (conn == null) {
            return null;
        }

        String sql = "SELECT * FROM tb_points";
        stmt = conn.prepareStatement(sql);

        result = stmt.executeQuery();

        if (result == null) {
            return null;
        }

        while (result.next()) {

            PointModel pm = new PointModel();

            pm.setId(result.getString("id"));
            pm.setName(result.getString("name"));
            pm.setEmail(result.getString("email"));
            pm.setImage(result.getBytes("image"));
            pm.setWhatsApp(result.getString("whatsapp"));
            pm.setCreatedAt(result.getString("createdAt"));
            pm.setUpdateAt(result.getString("updatedAt"));

            resultData.add(pm);

        }

        return resultData;

    }

    public PointModel listPointById(String id) throws ClassNotFoundException, SQLException {

        PointModel pm = new PointModel();

        conn = DBConnection.getConn();

        if (conn == null) {
            return null;
        }

        String sql = "SELECT * FROM tb_points WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);

        result = stmt.executeQuery();

        if (result == null) {
            return null;
        }

        while (result.next()) {
            pm.setId(result.getString("id"));
            pm.setName(result.getString("name"));
            pm.setEmail(result.getString("email"));
            pm.setImage(result.getBytes("image"));
            pm.setWhatsApp(result.getString("whatsapp"));
            pm.setCreatedAt(result.getString("createdAt"));
            pm.setUpdateAt(result.getString("updatedAt"));
        }

        return pm;

    }

    public void updatePoint(PointModel pm) throws ClassNotFoundException, SQLException {

        conn = DBConnection.getConn();

        String sql = "UPDATE tb_points SET name = ?, email = ?, image = ?, whatsapp = ?, updatedAt = current_timestamp() WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, pm.getName());
        stmt.setString(2, pm.getEmail());
        stmt.setBytes(3, pm.getImage());
        stmt.setString(4, pm.getWhatsApp());
        stmt.setString(5, pm.getId());

        stmt.executeUpdate();

    }

    public void deletePoint(String id) throws ClassNotFoundException, SQLException {

        conn = DBConnection.getConn();

        String sql = "DELETE FROM tb_points WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, id);

        stmt.executeUpdate();

    }

}
