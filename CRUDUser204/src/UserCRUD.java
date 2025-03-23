import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserCRUD {
    
    private Connection conexion;
    
    //constructor de la clase arranca la conexion a BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String correo, String contraseña){
    
        String insertSQL = " INSERT INTO Usuarios(Nombre, Correo, Contraseña) VALUES (?,?,?)";
        
        try{
            //asignamos la sentencia y los parametros para su ejecucion
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2,correo);
            ps.setString(3, contraseña);
            return ps.executeUpdate()>0;         
        }
        catch(SQLException e){
            //imprimimos en consola en caso de que no se ejecute el INSERT INTO
            System.out.println("Error al crear el usuario " + e.getMessage());
            return false;
        }
    }
            
}
      

