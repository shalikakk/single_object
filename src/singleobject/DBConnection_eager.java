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
public class DBConnection_eager {
    public DBConnection_eager() {
    }
    private static DBConnection_eager instance = new DBConnection_eager();

    public static DBConnection_eager getInstance() {
        if (instance == null) {
            instance = new DBConnection_eager();
            System.out.println("create an instence-first time");
        }

        return instance;
    }

    public static void main(String[] args) {
        getInstance();
        getInstance();
    }
}
