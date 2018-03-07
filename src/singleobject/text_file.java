/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleobject;

/**
 *
 * @author cst140021
 */
public class text_file{
    public static void main(String[] args) {
    DBconecter_for_Text_file db_student=DBconecter_for_Text_file.getinstence();
    DBconecter_for_Text_file db_teacher=DBconecter_for_Text_file.getinstence();

    db_student.add_text();
    db_student.read_text();
    db_teacher.read_text();
    
    }
}