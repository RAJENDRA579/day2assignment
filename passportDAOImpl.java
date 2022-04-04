package passportTestDemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class passportDAOImpl implements passportDAO {

	EntityManagerFactory emf;
	EntityManager em ;
	
	public passportDAOImpl() {
		System.out.println("passportDAOImpl()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}
	
	
		public Set<passport> findAllpassport() {
		Query query = em.createQuery("from passport");
		List<passport> list = query.getResultList();
		Set<passport> empSet = new HashSet(list);
		return empSet;
	}






		public void addpassport(passport passport) {
			// TODO Auto-generated method stub
			
		}






		public void modifypassport(passport pass) {
			// TODO Auto-generated method stub
			
		}






		public void deletepassport(int passportno) {
			// TODO Auto-generated method stub
			
		}






		public passport findpassport(int passport) {
			// TODO Auto-generated method stub
			return null;
		}






		public Set<passport> findAllpassports() {
			// TODO Auto-generated method stub
			return null;
		}

}