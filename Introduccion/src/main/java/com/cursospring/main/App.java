package com.cursospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cursospring.main.servicio.Servicio;
import com.cursospring.main.servicio.Celsius;

import java.util.Date;
import org.hibernate.Session;
import com.cursospring.main.modelo.Stock;
import com.cursospring.main.modelo.StockDetail;
import com.cursospring.main.util.HibernateUtil;


public class App {
    public static final CharSequence MENSAJE = "Has entrado al curso de Spring Framework";

    private ISaludo saludo;
    
    public App(ISaludo saludo){
      this.saludo = saludo;
    }
    
    public void mensaje(){
      saludo.mensaje(MENSAJE);
    }

    public static void main( String[] args ){
        ISaludo saludoImpl = new SaludoImpl();
        new App(saludoImpl).mensaje();

        //Usando archivo de contexto XML
        contexto();

        //Usando @Configuration
        configuracion();

        //Usando @Configuration
        servicio();

        //Usando archivo de contexto XML
        celsius();
    }

    public static void hibernateTest(){
      System.out.println("Hibernate one to one (XML mapping)");
      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      
      Stock stock = new Stock();
      stock.setStockCode("4715");
      stock.setStockName("GENM");
      
      StockDetail stockDetail = new StockDetail();
      stockDetail.setCompName("GENTING Malaysia");
      stockDetail.setCompDesc("Best resort in the world");
      stockDetail.setRemark("Nothing Special");
      stockDetail.setListedDate(new Date());
      
      stock.setStockDetail(stockDetail);
      stockDetail.setStock(stock);
      
      session.save(stock);
      session.getTransaction().commit();
      System.out.println("Hecho!!");
    }

    public static void celsius(){
      ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
      Celsius objBean = (Celsius) context.getBean("celsiusBean");
      System.out.printf("Valor: %s , Celsis: %f\n",objBean.getValor(), objBean.getCalculo());
    }

    public static void servicio(){
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      context.register(AppConfig.class);
      context.refresh();
      Servicio mi_servicio = (Servicio) context.getBean("servicioBean",Servicio.class);
      System.out.println(mi_servicio.getMensaje());
      context.close();
    }

    public static void configuracion(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHelloWorld("hemos logrado la configuracion");
    }

    public static void contexto(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        MiBean objBean = (MiBean) context.getBean("miBean");
        System.out.println(objBean.getValor());
    }
}
