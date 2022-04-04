package passportTestDemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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
			EntityTransaction et = em.getTransaction();
			et.begin();
				em.persist(passport);
			et.commit();			
		}






		public void modifypassport(passport pass) {
			EntityTransaction et = em.getTransaction();
			et.begin();
				em.merge(pass);
			et.commit();
			
		}






		public void deletepassport(int passportno) {
			EntityTransaction et = em.getTransaction();
			et.begin();
				passport pass = em.find(passport.class, passportno);
				em.remove(pass);
			et.commit();
			
		}






		public passport findpassport(int passport) {
			return em.find(passport.class, passport);
	
		}






		public Set<passport> findAllpassports() {
			Query query = em.createQuery("from passport");
			List<passport> list = query.getResultList();
			Set<passport> passportSet = new HashSet(list);
			return passportSet;
		}

}