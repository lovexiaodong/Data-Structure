package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<String> menus = new ArrayList<String>();
		menus.add("/111/112/menu.jso");
		menus.add("/111/113/menu.jso");
		 StringBuilder sb = new StringBuilder();
		 if(menus != null && menus.size() > 0){
             for(int i = 0; i < menus.size(); i++){
                 sb.append(menus.get(i));
                 if(i != menus.size()-1){
                     sb.append(",");
                 }
             }
		 }
		 
		 String[] str = sb.toString().split(",");
		List<String> menuPath =  Arrays.asList(str);
		 for(int i = 0; i < menuPath.size(); i++) {
			 System.out.println(menuPath.get(i));
		 }
 }
}
