package com.orm;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDAO {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createUser(User u) {
		this.hibernateTemplate.save(u);
	}

	public User getUserById(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	@Transactional
	public void updateUser(User u) {
		this.hibernateTemplate.update(u);
	}

	@Transactional
	public void deleteUser(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}
}
