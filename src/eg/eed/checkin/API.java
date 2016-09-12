/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.eed.checkin;

/**
 *
 * @author ahmedengu
 */
public class API {

    public static String SITE = "http://localhost";
    public static String URI = SITE + "/MyApi";
    public static String PASSWORD = "123";
    public static String PASS = "?pass=" + PASSWORD;
    public static String VISITOR = URI + "/visitor" + PASS;
    public static String CHECKIN = URI + "/checkin" + PASS;
    public static String CHECKOUT = URI + "/checkout" + PASS;
    public static String NEWQR = URI + "/newQR" + PASS;
}
