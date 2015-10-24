package DAL;

import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class InvoiceMgr implements IInvoiceMgr{
    @Override
    public List<InvoiceEntity> GetAll() {
        return null;
    }

    @Override
    public boolean Create(InvoiceEntity Invoice) {
        return false;
    }

    @Override
    public boolean Update(int ArticleID, InvoiceEntity Invoice) {
        return false;
    }

    @Override
    public boolean DeleteByID(int InvoiceID) {
        return false;
    }
}
