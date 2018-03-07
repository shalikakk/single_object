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
public class DBconecter_for_Text_file {
    private static DBconecter_for_Text_file instance=null;

    private DBconecter_for_Text_file() {
    }

    public static DBconecter_for_Text_file getinstence() {
        if (instance == null) {
            instance = new DBconecter_for_Text_file();
            System.out.println("create an instence-first time");
        }
        return instance;
    }
    
    void add_text(){
        System.out.println("text added by student");
    }
    void read_text(){
        System.out.println("text read by student");
    }
}
