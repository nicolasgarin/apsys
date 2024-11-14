package datos;

import domain.Partido;
import java.sql.SQLException;
import java.util.List;

public interface IPartidoDao {
    
    List<Partido> select() throws SQLException;
    
    int insert(Partido partido) throws SQLException;
    
    int update(Partido partido) throws SQLException;
    
    int delete(Partido partido) throws SQLException;
}
