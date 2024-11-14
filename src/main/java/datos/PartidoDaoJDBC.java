package datos;

import domain.Partido;
import java.sql.*;
import java.util.*;

public class PartidoDaoJDBC implements IPartidoDao {
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_partido, fecha, liga, equipo_a, equipo_b, p1a, p1b, p2a, p2b, p3a, p3b, p4a, p4b, favorito, div_favorito FROM partidos";
    private static final String SQL_INSERT = "INSERT INTO partidos(fecha, liga, equipo_a, equipo_b, p1a, p1b, p2a, p2b, p3a, p3b, p4a, p4b, favorito, div_favorito) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE partidos SET fecha=?, liga=?, equipo_a=?, equipo_b=?, p1a=?, p1b=?, p2a=?, p2b=?, p3a=?, p3b=?, p4a=?, p4b=?, favorito=?, div_favorito=? WHERE id_partido = ?";
    private static final String SQL_DELETE = "DELETE FROM partidos WHERE id_paratido=?";
    
    public PartidoDaoJDBC(){
        
    }
    
    public PartidoDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    @Override
    public List<Partido> select() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Partido partido = null;
        List<Partido> partidos = new ArrayList<Partido>();
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idPartido = rs.getInt("id_partido");
                String fecha = rs.getString("fecha");
                String liga = rs.getString("liga");
                String equipoA = rs.getString("equipo_a");
                String equipoB = rs.getString("equipo_b");
                int p1A = rs.getInt("p1a");
                int p1B = rs.getInt("p1b");
                int p2A = rs.getInt("p2a");
                int p2B = rs.getInt("p2b");
                int p3A = rs.getInt("p3a");
                int p3B = rs.getInt("p3b");
                int p4A = rs.getInt("p4a");
                int p4B = rs.getInt("p4b");
                String favorito = rs.getString("favorito");
                double divFavorito = rs.getDouble("div_favorito");
                
                partido = new Partido(fecha, liga, equipoA, equipoB, p1A, p1B, p2A, p2B, favorito, divFavorito, p3A, p3B, p4A, p4B);               
                partidos.add(partido);
                partido.setIdPartido(idPartido);
            }
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if ( this.conexionTransaccional == null){
                Conexion.close(conn);
            }
        }
        return partidos;
    }
    
    @Override
    public int insert(Partido partido) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, partido.getFecha());
            stmt.setString(2, partido.getLiga());
            stmt.setString(3, partido.getEquipoA());
            stmt.setString(4, partido.getEquipoB());
            stmt.setInt(5, partido.getP1A());
            stmt.setInt(6, partido.getP1B());
            stmt.setInt(7, partido.getP2A());
            stmt.setInt(8, partido.getP2B());
            stmt.setInt(9, partido.getP3A());
            stmt.setInt(10, partido.getP3B());
            stmt.setInt(11, partido.getP4A());
            stmt.setInt(12, partido.getP4B());
            stmt.setString(13, partido.getFavorito());
            stmt.setDouble(14, partido.getDivFavorito());           
            rows = stmt.executeUpdate();
            System.out.println("Partido registrado");
            }
            finally{
            Conexion.close(stmt);
            if ( this.conexionTransaccional == null){
                Conexion.close(conn);
            }
            }
        
        return rows;
    }
    
    @Override
    public int update(Partido partido) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, partido.getFecha());
            stmt.setString(2, partido.getLiga());
            stmt.setString(3, partido.getEquipoA());
            stmt.setString(4, partido.getEquipoB());
            stmt.setInt(5, partido.getP1A());
            stmt.setInt(6, partido.getP1B());
            stmt.setInt(7, partido.getP2A());
            stmt.setInt(8, partido.getP2B());
            stmt.setInt(9, partido.getP3A());
            stmt.setInt(10, partido.getP3B());
            stmt.setInt(11, partido.getP4A());
            stmt.setInt(12, partido.getP4B());
            stmt.setInt(13, partido.getpMitadA());
            stmt.setInt(14, partido.getpMitadB());
            stmt.setInt(15, partido.getP3CA());
            stmt.setInt(16, partido.getP3CB());
            stmt.setInt(17, partido.getResfA());
            stmt.setInt(18, partido.getResfB());
            stmt.setString(19, partido.getFavorito());
            stmt.setDouble(20, partido.getDivFavorito());
            stmt.setString(21, partido.getGp1());
            stmt.setString(22, partido.getGp2());
            stmt.setString(23, partido.getGp3());
            stmt.setString(24, partido.getGp4());
            stmt.setString(25, partido.getgP());
            stmt.setInt(26, partido.getIdPartido());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
        }
        finally{
            Conexion.close(stmt);
            if ( this.conexionTransaccional == null){
                Conexion.close(conn);
            }
        }
        
        return rows;
    }
    
    @Override
    public int delete(Partido partido) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, partido.getIdPartido());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        }
        finally{
            Conexion.close(stmt);
            if ( this.conexionTransaccional == null){
                Conexion.close(conn);
            }
        }
        
        return rows;
    }
}
