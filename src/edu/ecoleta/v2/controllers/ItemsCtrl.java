package edu.ecoleta.v2.controllers;

import edu.ecoleta.v2.models.ItemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsCtrl {

    private ResultSet rs;
    private Connection conn = null;
    private PreparedStatement stmt;

    public List<ItemModel> ReadItems() throws ClassNotFoundException, SQLException {

        List<ItemModel> pt = new ArrayList<>();
        String sql = "SELECT * FROM tb_items";

        conn = DBConnection.getConn();

        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        while (rs.next()) {
            ItemModel item = new ItemModel();

            item.setId(rs.getInt("id"));
            item.setTitle(rs.getString("title"));
            item.setSlug(rs.getString("slug"));

            pt.add(item);
        }

        return pt;

    }

    public List<ItemModel> findForItemsByPointId(String id) throws ClassNotFoundException, SQLException {

        List<ItemModel> itemModel = new ArrayList<>();

        String sql = "SELECT i.id, i.title, i.slug FROM tb_point_items pi JOIN tb_items i ON pi.item_id = i.id WHERE pi.point_id = ?";

        conn = DBConnection.getConn();

        stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);
        rs = stmt.executeQuery();

        while (rs.next()) {
            ItemModel item = new ItemModel();

            item.setId(rs.getInt("id"));
            item.setTitle(rs.getString("title"));
            item.setSlug(rs.getString("slug"));

            itemModel.add(item);
        }

        return itemModel;

    }

    public void deleteItemsByPoint(String pointId) throws ClassNotFoundException, SQLException {

        conn = DBConnection.getConn();

        String sql = "DELETE FROM tb_point_items WHERE point_id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, pointId);

        stmt.executeUpdate();

    }

    public void UpdatesItems(String pointId, List<String> items) throws SQLException, ClassNotFoundException {

        conn = DBConnection.getConn();

        String sql = "INSERT INTO tb_point_items(point_id, item_id) values(?, ?)";
        stmt = conn.prepareStatement(sql);

        for (String it : items) {

            if (it != null) {

                stmt.setString(1, pointId);
                stmt.setInt(2, Integer.parseInt(it));

                stmt.executeUpdate();

            }

        }

    }

}
