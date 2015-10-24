package BLL;

import DAL.IInvoiceMgr;

/**
 * Created by A046098 on 23.10.2015.
 */
public class InvoiceBll {

    private IInvoiceMgr _Dal;

    public InvoiceBll(IInvoiceMgr Dal){
        _Dal=Dal;
    }
    /**
     * Add new Invoice .
     */
    public boolean AddInvoice(){
        return false;
    }

    /**
     * Edit Article .
     * @return
     */
    public boolean EditInvoice(){
        return false;
    }

    /**
     * Delete Article .
     * @return
     */
    public boolean DelInvoice(){return false;}
}
