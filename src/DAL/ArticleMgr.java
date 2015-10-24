package DAL;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class ArticleMgr implements IArticleMgr {
    @Override
    public List<ArticleEntity> GetAll() {
        List<ArticleEntity> ResultList;
        try {
            ResultList=new ArrayList<ArticleEntity>();
        }
        catch (Exception Ex){
            throw Ex;
        }
        return ResultList;
    }

    @Override
    public boolean Create(ArticleEntity Article) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            throw Ex;
        }
        return Success;
    }

    @Override
    public boolean Update(int ArticleID, ArticleEntity Article) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            throw Ex;
        }
        return Success;
    }

    @Override
    public boolean DeleteByID(int ArticleID) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            throw Ex;
        }
        return Success;
    }
}


