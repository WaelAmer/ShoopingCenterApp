package DAL.Mgrs;

import DAL.Entities.ArticleEntity;
import DAL.Entities.InvoiceEntity;
import DAL.Utils.HibernateUtil;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class InvoiceMgr implements IInvoiceMgr{

    private static final Logger log =Logger.getLogger(InvoiceMgr.class);

    private void BindConfiguration() {

        PropertyConfigurator.configure("log4j.properties");
    }
    public InvoiceMgr(){
        BindConfiguration();
    }

    @Override
    public List<InvoiceEntity> GetAll() {

        List<InvoiceEntity> ResultList;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ResultList = (List<InvoiceEntity>) session.createQuery("FROM InvoiceEntity").list();
            session.getTransaction().commit();
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception GetAll : "+ Ex.getMessage());
            throw Ex;
        }
        return ResultList;
    }

    @Override
    public boolean Create(List<InvoiceEntity> Invoice) {
        boolean Success=false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            int id = (Integer) session.save(Invoice);
            session.getTransaction().commit();
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception Create : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }


    @Override
    public List<InvoiceEntity> GetByID(int InvoiceID) {

        List<InvoiceEntity> ResultList;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ResultList = (List<InvoiceEntity>) session.createQuery("FROM InvoiceEntity i where i.id = :InvId").setInteger("InvId",InvoiceID).list();
            session.getTransaction().commit();
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception GetAll : "+ Ex.getMessage());
            throw Ex;
        }
        return ResultList;
    }

    @Override
    public boolean DeleteByID(int InvoiceID) {
        boolean Success=false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            session.createQuery("delete FROM InvoiceEntity i where i.id = :InvId").setInteger("InvId",InvoiceID).executeUpdate();
            session.getTransaction().commit();
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception DeleteByID : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }
}
