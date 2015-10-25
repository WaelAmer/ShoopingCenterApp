package DAL.Mgrs;

import DAL.Entities.ArticleEntity;
import DAL.Utils.HibernateUtil;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class ArticleMgr implements IArticleMgr {
    private static final Logger log =Logger.getLogger(ArticleMgr.class);
    public ArticleMgr(){
        BindConfiguration();
    }
    private void BindConfiguration() {
        PropertyConfigurator.configure("log4j.properties");
    }

    @Override
    public List<ArticleEntity> GetAll() {
        List<ArticleEntity> ResultList;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ResultList = (List<ArticleEntity>) session.createQuery("FROM ArticleEntity s ORDER BY s.name ASC").list();
            session.getTransaction().commit();
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception GetAll : "+ Ex.getMessage());
            throw Ex;
        }
        return ResultList;
    }

    @Override
    public boolean Create(ArticleEntity Article) {
        boolean Success=false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            int id = (Integer) session.save(Article);
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
    public boolean Update(int ArticleID, ArticleEntity Article) {
        boolean Success=false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ArticleEntity ArticleDb = (ArticleEntity) session.get(ArticleEntity.class, ArticleID);
            ArticleDb.setCategoryId(Article.getCategoryId());
            ArticleDb.setName(Article.getName());
            Article.setPrice(Article.getPrice());
            //No need to update manually as it will be updated automatically on transaction close.
            session.getTransaction().commit();
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception Update : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }

    @Override
    public boolean DeleteByID(int ArticleID) {
        boolean Success=false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ArticleEntity ArticleDb = (ArticleEntity) session.get(ArticleEntity.class, ArticleID);
            session.delete(ArticleDb);
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


