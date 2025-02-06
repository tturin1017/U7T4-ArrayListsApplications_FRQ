package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                String name1 = list.get(i).getLastName();
                String name2 = list.get(j).getLastName();
                if(name1.compareTo(name2)>0){     
                    swap(list,i,j);
                }else if (name1.compareTo(name2)==0){// Smith vs Smith
                    //compare first name
                    name1 = list.get(i).getFirstName();
                    name2 = list.get(j).getFirstName();
                    if(name1.compareTo(name2)>0){ //John Frank vs Andy Frank
                        swap(list,i,j);
                    }else if(name1.compareTo(name2)==0){ //John Frank vs John Frank
                        //compare GPA
                        if(list.get(i).getGpa()<list.get(j).getGpa()){ //same first and last name, swap if current i has lower gpa
                            swap(list,i,j);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void swap(ArrayList<Student> list, int i, int j){
        Student temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
