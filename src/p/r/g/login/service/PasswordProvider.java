/*
 * @(#)PasswordProvider.java 1.0 Jun 26, 2017
 */
package p.r.g.login.service;

import java.util.HashMap;

/**
 * <code>PasswordProvider</code> class is
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    6/26/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Jun 26, 2017
 */
public class PasswordProvider {

    private HashMap<String, String> passwords = new HashMap();

    public PasswordProvider() {
        passwords.put("test", "12345");
        passwords.put("user", "welcome");
        passwords.put("prg", "whoa");
        passwords.put("abcd", "xyz");
        passwords.put("aaa", "bbb");
    }

    public boolean isValidUser(String userName, String password) {
        if (passwords.containsKey(userName)) {
            if (password.equals(passwords.get(userName))) {
                return true;
            }
        }
        return false;
    }



}



