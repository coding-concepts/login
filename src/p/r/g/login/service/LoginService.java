/*
 * @(#)LoginService.java 1.0 Jun 26, 2017
 */
package p.r.g.login.service;

/**
 * <code>LoginService</code> class is
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
public class LoginService {

    private PasswordProvider provider = new PasswordProvider();


    public boolean isValidUser(String userName, String password) {
       return provider.isValidUser(userName, password);
    }

}



