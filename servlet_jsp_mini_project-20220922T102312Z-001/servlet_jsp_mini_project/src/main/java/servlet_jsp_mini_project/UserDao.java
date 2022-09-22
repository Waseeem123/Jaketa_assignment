package servlet_jsp_mini_project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = factory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User_Dto saveUser(User_Dto user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	
	public User_Dto getUserByEmail(String email, long password) {
		Query query = entityManager.createQuery("Select u from User_Dto u where u.email=?1 AND u.number=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		try {
			User_Dto user = (User_Dto) query.getSingleResult();
			return user;
		} 
		catch (Exception e) {
			return null;
		}
		
	}

	public User_Dto getUserByName(String name)
	{
		Query q = entityManager.createQuery("select u from User_Dto u where u.name=?1");
		q.setParameter(1, name);
		User_Dto u= (User_Dto)q.getSingleResult();
		return u;
	}
//	public User_Dto getUserById(int id) {
//		return entityManager.find(User_Dto.class, id);
//	}
//
//	public List<User_Dto> getAllUsers() {
//		Query query = entityManager.createQuery("Select u from User_Dto u");
//		List<User_Dto> user = query.getResultList();
//		return user;
//	}
//
//	public void deleteUserById(int id) {
//
//		User_Dto user = entityManager.find(User_Dto.class, id);
//		entityTransaction.begin();
//
//		if (user != null) {
//			entityManager.remove(user);
//		}
//		entityTransaction.commit();
//	}
//
//	public User_Dto updateUser(User_Dto user) {
//		entityTransaction.begin();
//		entityManager.merge(user);
//		entityTransaction.commit();
//		return user;
//	}

}
