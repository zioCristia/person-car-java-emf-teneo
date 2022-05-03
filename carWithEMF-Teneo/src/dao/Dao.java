package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;

public abstract class Dao<T> {
	private Session currentSession;
	private Transaction currentTransaction;

	public Session openCurrentSession() {
        currentSession = HibernateUtils.getSessionFactory().openSession();
        return currentSession;
    }
 
    public Session openCurrentSessionwithTransaction() {
        currentSession = HibernateUtils.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
     
    public void closeCurrentSession() {
        currentSession.close();
    }
     
    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
     
    public Session getCurrentSession() {
        return currentSession;
    }
 
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }
 
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
 
    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

	abstract List<T> getAll();

	public void save(T t) {
		openCurrentSessionwithTransaction();
		getCurrentSession().save(t);
		closeCurrentSessionwithTransaction();
	}

	public void update(T t) {
		openCurrentSessionwithTransaction();
		getCurrentSession().update(t);
		closeCurrentSessionwithTransaction();
	}

	public void delete(T t) {
		openCurrentSessionwithTransaction();
		getCurrentSession().delete(t);
		closeCurrentSessionwithTransaction();
	}
}
