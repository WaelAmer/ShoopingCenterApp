package DAL;

import java.util.List;

/**
 * Created by A046098 on 23.10.2015.
 */
public interface IInvoiceMgr {

    public List<InvoiceEntity> GetAll();
    public boolean Create(InvoiceEntity Invoice);
    public boolean Update(int ArticleID,InvoiceEntity Invoice);
    public boolean DeleteByID(int InvoiceID);
}
