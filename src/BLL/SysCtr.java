package BLL;

import java.util.Scanner;

/**
 * Created by A046098 on 23.10.2015.
 */
public class SysCtr {
    ArticleBll _ArticleCtr;
    InvoiceBll _InvoiceCtr;


    public SysCtr(){
        _ArticleCtr=new ArticleBll();
        _InvoiceCtr=new InvoiceBll();
    }

    public void DisplayConsole(){

        int Choice=0;
        boolean Check=true;

        do {
            System.out.println("1- Articles Management .");
            System.out.println("2- Invoice Management .");
            System.out.println("3- Articles Statistics .");
            System.out.println("4- Invoice Statistics .");
            System.out.println("5- Exit .");
            Scanner in = new Scanner(System.in);
            try{
                Choice = Integer.parseInt(in.nextLine());
                switch (Choice){
                    case 1:
                        DisplayArticleManagement();
                        break;
                    case 2:
                        DisplayInvoiceManagement();
                        break;
                    case 3:
                        DisplayArticleStatistics();
                    case 4:
                        DisplayInvoiceStatistics();
                }
                if (Choice==5)
                    Check=false;
            } catch (NumberFormatException e){
                System.err.println("Input error - Invalid Number please chose only between 1-5.");
                Check = false;
            }
        }while (Check);

    }

    private void DisplayInvoiceStatistics() {
        try {
            System.out.println("just entered Articles Management .");
        }catch (Exception e){}
    }

    private void DisplayArticleStatistics() {
        try {
            System.out.println("just entered DisplayArticleStatistics .");
        }catch (Exception e){}
    }

    private void DisplayInvoiceManagement() {
        try {
            System.out.println("just entered DisplayInvoiceManagement .");
        }catch (Exception e){}
    }

    private void DisplayArticleManagement() {
        try {
            System.out.println("just entered DisplayArticleManagement .");
        }catch (Exception e){}
    }

}
