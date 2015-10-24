package DAL;

import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class ArticleMgr implements IArticleMgr {
    @Override
    public List<ArticleEntity> GetAll() {
        return null;
    }

    @Override
    public boolean Create(ArticleEntity Article) {
        return false;
    }

    @Override
    public boolean Update(int ArticleID, ArticleEntity Article) {
        return false;
    }

    @Override
    public boolean DeleteByID(int ArticleID) {
        return false;
    }
}


