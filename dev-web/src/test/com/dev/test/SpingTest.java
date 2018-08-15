package com.dev.test;

import com.dev.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.util.WebUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhy
 * @desc ${DESCRIPTION}
 * @create 2018-08-13 21:08
 **/
public class SpingTest {

    public static void main(String[] args){
       Student s =  BeanUtils.instantiateClass(Student.class);
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("name","122");
        mpv.add("age",34);
        BeanWrapper bw = new BeanWrapperImpl(s);
        bw.setPropertyValues(mpv);
//        PropertyDescriptor[] pdArray = bw.getPropertyDescriptors();
//        for (PropertyDescriptor pd : pdArray){
//           Method mm = pd.getWriteMethod();
////           try{
//               if (mm != null){
//                   System.out.println(mm.getName());
////                   mm.invoke(s,mpv.get(mm.getName()).toString());
//               }
////           } catch (IllegalAccessException e) {
////               e.printStackTrace();
////           } catch (InvocationTargetException e) {
////               e.printStackTrace();
////           }catch (Exception e){
////               e.printStackTrace();
////           }
//
//        }

        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
