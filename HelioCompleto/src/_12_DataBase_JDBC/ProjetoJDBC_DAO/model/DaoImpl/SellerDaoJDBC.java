package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {
	
	@Override
	public void insert(Seller obj) {
	
	}
	
	@Override
	public void update(Seller obj) {
	
	}
	
	@Override
	public void deleteById(Integer id) {
	
	}
	
	@Override
	public Seller findById(Integer id) {
		return null;
	}
	
	@Override
	public List<Seller> findAll() {
		return List.of();
	}
	
}
