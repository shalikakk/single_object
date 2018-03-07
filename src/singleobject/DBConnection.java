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
public class DBConnection {

    public DBConnection() {
    }
    private static DBConnection instance = new DBConnection();

    public static DBConnection getInstance() {

        System.out.println("create an instence-first time");

        return instance;
    }

    public static void main(String[] args) {
        getInstance();
        getInstance();
    }
}
