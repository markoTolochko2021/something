package com.marko.spring.aop.aspect;

import com.marko.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//
//    @Pointcut("execution (* com.marko.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution (public void com.marko.spring.aop.UniLibrary.returnMagazine())" )
//    private void returnMagazineFromUniLibrary(){
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: log #10");
//
//    }

//    @Pointcut("execution (* com.marko.spring.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* com.marko.spring.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeAllGetAndReturnMethodsFromUniLibrary(){
//        System.out.println("beforeAllGetAndReturnMethodsFromUniLibrary: writing log #3");
//    }



    @Before("com.marko.spring.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Book info: " + myBook.getAuthor() + " " + myBook.getName() + " " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println(obj + " add the book to library");
                }
            }
        }
        System.out.println("beforeAddBookAdvice: Try get a book/magazine");
        System.out.println("****************************************");

    }
}
