package BLL;

/**
 * Created by A046098 on 23.10.2015.
 */
public class SysCtr {
    ArticleCtr _ArticleCtr;
    InvoiceCtr _InvoiceCtr;


    public SysCtr(){
        _ArticleCtr=new ArticleCtr();
        _InvoiceCtr=new InvoiceCtr();
    }

}
