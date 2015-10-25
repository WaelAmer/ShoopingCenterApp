package DAL.Mgrs;

import DAL.Entities.ArticleEntity;

import java.util.List;

/**
 * Created by A046098 on 23.10.2015.
 */
public interface IArticleMgr {

    public List<ArticleEntity> GetAll();
    public boolean Create(ArticleEntity Article);
    public boolean Update(int ArticleID,ArticleEntity Article);
    public boolean DeleteByID(int ArticleID);

}
