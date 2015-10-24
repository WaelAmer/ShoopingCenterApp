package BLL;

import DAL.ArticleEntity;
import DAL.ArticleMgr;
import DAL.InvoiceMgr;

import java.util.Scanner;

/**
 * Created by A046098 on 23.10.2015.
 */
public class SysCtr {
    private ArticleBll _ArticleCtr;
    private InvoiceBll _InvoiceCtr;


    public SysCtr(){
        //TODO: Improvement needed.
        _ArticleCtr=new ArticleBll(new ArticleMgr());
        _InvoiceCtr=new InvoiceBll(new InvoiceMgr());
    }

    /**
     * Display Main Menu.
     */
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
                        break;
                    case 4:
                        DisplayInvoiceStatistics();
                        break;
                }
                if (Choice==5)
                    Check=false;
            } catch (NumberFormatException e){
                System.err.println("Input error - Invalid Number please chose only between 1-5.");
            }
        }while (Check);

    }

    /**
     * Display the Invoice Statistics menu.
     */
    private void DisplayInvoiceStatistics() {
        try {
           // Runtime.getRuntime().exec("cls");
           // Runtime.getRuntime().exec("clear");

        }catch (Exception e){
            //TODO: Log Exception
        }
    }
    /**
     * Display the Article Statistics menu.
     */
    private void DisplayArticleStatistics() {
        try {
            System.out.println("just entered DisplayArticleStatistics .");
        }catch (Exception e){
            //TODO: Log Exception
        }
    }
    /**
     * Display the Invoice Management menu.
     */
    private void DisplayInvoiceManagement() {
        try {
            System.out.println("just entered DisplayInvoiceManagement .");
        }catch (Exception e){
            //TODO: Log Exception
        }
    }

    private void DisplayArticleManagement() {
        try {
            int Choice=0;
            boolean Check=true;
            do {
                //System.out.println("just entered DisplayArticleManagement .");
                System.out.println("1- Add new Article .");
                System.out.println("2- Edit Exist Article .");
                System.out.println("3- Delete Exist Article .");
                System.out.println("4- Search for Article .");
                System.out.println("5- Exit .");
                Scanner in = new Scanner(System.in);
                try{
                    Choice = Integer.parseInt(in.nextLine());
                    switch (Choice){
                        case 1:
                            DisplayAddArticle();
                            break;
                        case 2:
                            DisplayEditArticle();
                            break;
                        case 3:
                            DisplayDelArticle();
                            break;
                        case 4:
                            DisplayInvoiceStatistics();
                            break;
                    }
                    if (Choice==5)
                        Check=false;
                } catch (NumberFormatException e){
                    System.err.println("Input error - Invalid Number please chose only between 1-5.");
                }
            }while (Check);

        }catch (Exception e){
            //TODO: Log Exception
        }
    }

    private void DisplayDelArticle() {

    }

    private void DisplayEditArticle() {

    }

    /**
     * Create new Article from Console.
     */
    private void DisplayAddArticle() {
        try {
            ArticleEntity Entity=new ArticleEntity();
            Scanner in = new Scanner(System.in);

            System.out.println("Enter Article Name : ");

            System.out.println("Enter Article CategoryID : ");

            System.out.println("Enter Article Price : ");

            _ArticleCtr.AddArticle(Entity);
        }catch (Exception e){
            //TODO: Log Exception
        }
    }

}
