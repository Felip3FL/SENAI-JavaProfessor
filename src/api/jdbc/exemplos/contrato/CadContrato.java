package api.jdbc.exemplos.contrato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

import fundamentos.lib.SwUtil;


public class CadContrato {
	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		try {
			// registrar o driver JDBC
			Class.forName("com.mysql.jdbc.Driver");

			// Conecta ao Banco de Dados
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CursoJava", "root", "root");) {

				Statement sql = con.createStatement();

				ResultSet resposta = sql.executeQuery("select * from contrato");

				while (resposta.next()) {
					System.out.println("Nº: " + resposta.getString("numero")
							+ " Descr: " + resposta.getString("descricao")
							+ " Dt. Abertura: "
							+ resposta.getDate("dataAbertura").toLocalDate().format(SwUtil.getDateTimeFormatter())
							+ " Valor R$ "
							+ fmt.format(resposta.getDouble("valor")));
				}
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver JDBC não encontrato");
		} catch (SQLException ex) {
			System.out.println("Houve erro na execução do SQL");
			ex.printStackTrace();
		}
	}
}
