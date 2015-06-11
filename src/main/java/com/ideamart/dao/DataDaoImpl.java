package com.ideamart.dao;

import com.ideamart.entity.Receive;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chathura on 6/11/15.
 */
public class DataDaoImpl implements DataDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public int insertRow(Receive receive) {
        Session session=sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(receive);
        tx.commit();
        Serializable id = session.getIdentifier(receive);
        session.close();
        return (Integer) id;
    }

    @Override
    public List<Receive> getList() {
        Session session =sessionFactory.openSession();
       List<Receive> receiveList = session.createQuery("from com.ideamart.entity.Receive").list();
       session.close();
        return receiveList;
    }

    @Override
    public int deleteRow(int id) {
       Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Receive receive=(Receive)session.load(Receive.class,id);
        session.delete(receive);
        tx.commit();
        Serializable ids=session.getIdentifier(receive);
        session.close();
        return (Integer) ids;
    }
}
