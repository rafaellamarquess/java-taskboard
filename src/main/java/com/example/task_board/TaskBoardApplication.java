package com.example.task_board;

import com.example.task_board.persistence.migration.MigrationStrategy;
import com.example.task_board.ui.MainMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

import static com.example.task_board.persistence.config.ConnectionConfig.getConnection;

@SpringBootApplication
public class TaskBoardApplication {

	public static void main(String[] args) throws SQLException {
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
		new MainMenu().execute();
	}
}
