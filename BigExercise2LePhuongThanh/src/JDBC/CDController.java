package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @ Desciptione: Class controller of CD
 */

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @ Desciptione: Class
 */
public class CDController {
	//Connect database
	Database db = new Database();
	private List<CD> listCD = new ArrayList<CD>();
	private CD cd = new CD();

	public List<CD> getListCD() {
		return listCD;
	}

	public void setListCD(List<CD> listCD) {
		this.listCD = listCD;
	}

	public CDController(List<CD> listCD) {
		super();
		this.listCD = listCD;
	}

	public CDController() {
		super();
	}

	/**
	 * this is method get all data of CD from sql cdstore
	 * @return list CD
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<CD> getAllCD() throws ClassNotFoundException, SQLException {
		listCD = new ArrayList<CD>();

		try (Connection conn = db.connect()) {
			Statement statement = conn.createStatement();
			String sql = "Select * from cd";

			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));

				listCD.add(cd);
			}

		}
		return listCD;
	}

	/**
	 * this is method add new CD 
	 * @param cd
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addNewCD(CD cd) throws ClassNotFoundException, SQLException {

		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO cd(name, singer, numbersongs, price) VALUES ('"
					+ cd.getName()
					+ "','"
					+ cd.getSinger()
					+ "',"
					+ cd.getNumbersongs() 
					+ "," 
					+ cd.getPrice() 
					+ ");";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * this is method get list search name (search comparative)
	 * @param name
	 * @return result of list search
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<CD> getListSearch(String name) throws ClassNotFoundException,
			SQLException {
		listCD = new ArrayList<>();
		cd = new CD();
		try (Connection conn = db.connect()) {
			Statement statement = conn.createStatement();
			String sql = "Select * from cd where name like '%" + name
					+ "%'";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));

				listCD.add(cd);
			}
		}
		return listCD;
	}

	/**
	 * this is method update CD following number songs and price
	 * @param cd
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getListUpdate(CD cd) throws ClassNotFoundException,
			SQLException {
		try (Connection conn = db.connect()) {
			String sql = "update cd set numbersongs = " + cd.getNumbersongs()
					+ ", price = " + cd.getPrice() + " where id = "
					+ cd.getId() + ";";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.execute();

		}

	}
	/**
	 * this is method delete one CD
	 * @param id
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteOneCD(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {

			String sql = "delete from cd where id = " + cd.getId()
					+ "";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.execute();
		}
		System.out.println("Id: " + id + " is delete! ");
	}
	
	/**
	 * this is method check id duly
	 * @param id
	 * @return true of false
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean isId(int id) throws ClassNotFoundException, SQLException {
		listCD = getAllCD();
		for (int i = 0; i < listCD.size(); i++) {
			if (listCD.get(i).getId() == id) {
				return true;

			}
		}
		return false;

	}
	/**
	 * this is method print list CD updated
	 * @param cd
	 * @return result list is updated
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public String toStringUpdate(CD cd)
			throws ClassNotFoundException, SQLException {
		listCD = getAllCD();
		String s = (cd.getId()+1) + " is find";

		s += "\n==================List====================\n";
		s += "Id\t\tName \t\t\t Singer \t NumberSongs \t\tprice\n";

		s += listCD.get(cd.getId()-1).toString();

		return s;

	}

	/**
	 * this is method get information of list search
	 * @param name
	 * @return result list search
	 */
	public String toStringSearch(String name) {

		try {
			listCD = getListSearch(name);
			int len = listCD.size();
			if (len > 0) {
				String s = name + " is find has " + len + " CD!\n";
				s += "\n==================List====================\n";
				s += "Id\t\tName \t\t\t Singer \t NumberSongs \t\tprice\n";

				for (int i = 0; i < listCD.size(); i++) {
					s += listCD.get(i).toString();
				}
				return s;
			}
		}

		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String toString() {
		try {
			listCD = getAllCD();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = "==================List====================\n";
		s += "Id\t\tName \t\t\t Singer \t NumberSongs \t\tprice\n";
		for (int i = 0; i < listCD.size(); i++) {
			s += listCD.get(i).toString();
		}
		return s;
	}

}
