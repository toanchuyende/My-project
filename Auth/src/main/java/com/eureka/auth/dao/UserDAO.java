package com.eureka.auth.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eureka.auth.entities.Users;

@Transactional
@Repository
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Users findUserByUserName(String userName) {
		try {
			String sql = "Select u from " + Users.class.getName() + " u Where u.userName =:userName ";

			Session session = this.sessionFactory.getCurrentSession();
			System.out.println("abc1234");
			Query<Users> query = session.createQuery(sql, Users.class);
			System.out.println("def1234");
			query.setParameter("userName", userName);
			Users user = (Users) query.getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		}
	}
}
