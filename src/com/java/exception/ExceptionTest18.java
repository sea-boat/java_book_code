package com.java.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest18 {

	public static void main(String[] args) {
		try {
			test(false);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void test(boolean flag) throws IOException, SQLException {
		if (flag == true)
			throw new IOException("IO“Ï≥£");
		else
			throw new SQLException("SQL“Ï≥£");
	}
}
