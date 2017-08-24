/*
 * @(#)LoginServiceTest.java 1.0 Jun 26, 2017
 */

import org.junit.Test;
import p.r.g.login.service.LoginService;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * <code>LoginServiceTest</code> class is
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
public class LoginServiceTest {
    LoginService service = new LoginService();

    @Test
    public void testNoUserName() {
        assertFalse(service.isValidUser("junk123", "hjsahgsajsdh"));
    }

    @Test
    public void testBadPassword() {
        assertFalse(service.isValidUser("test", "hjsahgsajsdh"));
    }

    @Test
    public void testSuccessfulLogin() {
        assertTrue(service.isValidUser("test", "12345"));
    }

}



