package BLL;

import DAL.ArticleEntity;
import DAL.IArticleMgr;

import java.util.logging.Logger;

/**
 * Created by A046098 on 23.10.2015.
 */
public class ArticleBll {
    private IArticleMgr _Dal;

    public ArticleBll(IArticleMgr Dal){
        _Dal=Dal;
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
            //TODO:Log Exception.
        }
        return Success;
    }

    /**
     * Edit Article .
     * @return true if success false if failed.
     */
    public boolean EditArticle(ArticleEntity Article){
        return false;
    }

    /**
     * Delete Article .
     * @return true if success false if failed.
     */
    public boolean DelArticle(int ArticleID){return false;}


}
