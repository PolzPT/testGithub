/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.of.objects;

/**
 *
 * @author Paul
 */
public class StudentDemo {
    
    public static void main(String[] args) {
        Student s1 = new Student("Paul","paul@gmail.com");
        Student s2 = new Student("Steve","steve@gmail.com");
        
        Student [] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        
        for(int i = 0; i < students.length; i++){
            System.out.println("Name: " + students[i].getName());
        }
        
        for(Student s: students){
            System.out.println("Name: " + s.getName());
        }
    }
    
}
