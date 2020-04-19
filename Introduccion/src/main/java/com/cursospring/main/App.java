package com.cursospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cursospring.main.servicio.Servicio;
import com.cursospring.main.servicio.Celsius;

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
