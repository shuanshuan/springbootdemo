package cn.hasome.youdian.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.hasome.youdian.entity.Resource;

@Repository
public class TestDaoImpl implements TestDao {
	
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public Object Simple() {
		Session session = this.sessionfactory.getCurrentSession();
		return session.get(Resource.class, 1);
	}

}
