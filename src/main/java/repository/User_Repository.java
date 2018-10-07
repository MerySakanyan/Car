package repository;

import connector.MyConnector;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User_Repository {



    public void setUser(User user){

        try (Connection connection=MyConnector.getInstance()){

            PreparedStatement preparedStatement=connection.prepareStatement("insert into user values (0,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getSurname());
            preparedStatement.setString(3,user.getUsername());
            preparedStatement.setString(4,user.getPassword());
            preparedStatement.setInt(5,user.getUser_status());
            preparedStatement.setInt(6,user.getVerification_status());
            preparedStatement.setInt(7,user.getVerification_code());
            preparedStatement.setInt(8,user.getAmount());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }

}
