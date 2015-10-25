package BLL;

import DAL.ArticleEntity;
import DAL.HibernateUtil;
import DAL.IArticleMgr;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by A046098 on 23.10.2015.
 */
public class ArticleBll {
    private IArticleMgr _Dal;
    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ArticleBll.class);

    public ArticleBll(IArticleMgr Dal){
        _Dal=Dal;
        BindConfiguration();
    }

    /**
     * Bind the Logger Properties.
     */
    private void BindConfiguration() {
        PropertyConfigurator.configure("log4j.properties");
    }
    /**
     * Add new Article .
     * @return true if success false if failed.
     */
    public boolean AddArticle(ArticleEntity Article){
        boolean Success=false;
        try {
            _Dal.Create(Article);
            Success=true;
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at AddArticle : %s Detail Exception : %s", Article, Ex.getMessage()));
        }
        return Success;
    }

    /**
     * Edit Article .
     * @return true if success false if failed.
     */
    public boolean EditArticle(int ArticleID,ArticleEntity Article){
        boolean Success=false;
        try {
            _Dal.Update(ArticleID,Article);
            Success=true;
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at EditArticle : %s Detail Exception : %s", ArticleID, Ex.getMessage()));
        }
        return Success;
    }

    /**
     * Delete Article .
     * @return true if success false if failed.
     */
    public boolean DelArticle(int ArticleID){
        boolean Success=false;
        try {
            _Dal.DeleteByID(ArticleID);
            Success=true;
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at EditArticle : %s Detail Exception : %s", ArticleID, Ex.getMessage()));
        }
        return Success;
    }

    /**
     * Get All Articles from Database .
     * @return true if success false if failed.
     */
    public List<ArticleEntity> GetAll(){
        List<ArticleEntity> Result=null;
        try {
            return _Dal.GetAll();
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at GetAll ,Detail Exception : %s",  Ex.getMessage()));
        }
        return Result;

    }


}
