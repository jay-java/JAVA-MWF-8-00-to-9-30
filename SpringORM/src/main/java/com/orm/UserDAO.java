package com.orm;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void createOrUpdateUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}

	public User getUserById(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}

//	@Transactional
//	public void updateUser(User u) {
//		this.hibernateTemplate.update(u);
//	}

	@Transactional
	public void deleteUser(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}
}
