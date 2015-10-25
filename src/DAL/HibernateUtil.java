package DAL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final Logger log =Logger.getLogger(HibernateUtil.class);

    static{
        try{
            BindConfiguration();
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            log.fatal("Session Factory could not be created." + ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }
    static void BindConfiguration() {
        PropertyConfigurator.configure("log4j.properties");
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}