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
public class DBConnection_multi_threaded {
       private static DBConnection_multi_threaded instance;

    private DBConnection_multi_threaded() {
    }

    public static DBConnection_multi_threaded getinstence() {
        if (instance == null) {
            instance = new DBConnection_multi_threaded();
            System.out.println("create an instence-first time");
        }
        return instance;
    }

    public static void main(String[] args) {
        getinstence();
        getinstence();
    }
}
