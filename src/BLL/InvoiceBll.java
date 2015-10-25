package BLL;

import DAL.Mgrs.IInvoiceMgr;
import DAL.Entities.InvoiceEntity;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;

/**
 * Created by A046098 on 23.10.2015.
 */
public class InvoiceBll {

    private IInvoiceMgr _Dal;
    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ArticleBll.class);

    public InvoiceBll(IInvoiceMgr Dal){
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
     * Add new Invoice .
     */
    public boolean AddInvoice(List<InvoiceEntity> Invoice){
        boolean Success=false;
        try {
            _Dal.Create(Invoice);
            Success=true;
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at AddInvoice : %s Detail Exception : %s", Invoice, Ex.getMessage()));
        }
        return Success;
    }

    /**
     * Get All Invoices from Database .
     * @return List of Invoices .
     */
    public List<InvoiceEntity> GetAll(){
        List<InvoiceEntity> Result=null;
        try {
            Result=_Dal.GetAll();
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at GetAll ,Detail Exception : %s",  Ex.getMessage()));
        }
        return Result;

    }

    /**
     * Get Invoices by InvoiceID from Database .
     * @return List of Invoices.
     */
    public List<InvoiceEntity> GetByID(int InvoiceID){
        List<InvoiceEntity> Result=null;
        try {
            Result=_Dal.GetByID(InvoiceID);
        }
        catch (Exception Ex){
            log.error(String.format("Business Layer Error at GetAll ,Detail Exception : %s",  Ex.getMessage()));
        }
        return Result;

    }
}
