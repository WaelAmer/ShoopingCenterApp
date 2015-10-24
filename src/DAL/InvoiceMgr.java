package DAL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
public class InvoiceMgr implements IInvoiceMgr{

    private static final Logger log =Logger.getLogger(ArticleMgr.class);

    private void BindConfiguration() {

        PropertyConfigurator.configure("log4j.properties");
//        log.debug("DisplayConsole Display menu entered");
//        log.info("DisplayConsole Display menu entered");
//        log.fatal("DisplayConsole Display menu entered");
//        log.warn("DisplayConsole Display menu entered");
//        log.error("DisplayConsole Display menu entered");
    }
    public InvoiceMgr(){
        BindConfiguration();
    }

    @Override
    public List<InvoiceEntity> GetAll() {

        List<InvoiceEntity> ResultList;
        try {
            ResultList=new ArrayList<InvoiceEntity>();
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception GetAll : "+ Ex.getMessage());
            throw Ex;
        }
        return ResultList;
    }

    @Override
    public boolean Create(InvoiceEntity Invoice) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception Create : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }

    @Override
    public boolean Update(int ArticleID, InvoiceEntity Invoice) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception Update : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }

    @Override
    public boolean DeleteByID(int InvoiceID) {
        boolean Success=false;
        try {
            Success=true;
        }
        catch (Exception Ex){
            log.fatal("Data Layer Exception DeleteByID : "+ Ex.getMessage());
            throw Ex;
        }
        return Success;
    }
}
