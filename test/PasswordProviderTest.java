/*
 * @(#)PasswordProviderTest.java 1.0 Jun 26, 2017
 */

import org.junit.Test;
import p.r.g.login.service.PasswordProvider;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordProviderTest {

    PasswordProvider provider = new PasswordProvider();

    @Test
    public void testNoUserName() {
        assertFalse(provider.isValidUser("junk123", "hjsahgsajsdh"));
    }

    @Test
    public void testBadPassword() {
        assertFalse(provider.isValidUser("test", "hjsahgsajsdh"));
    }

    @Test
    public void testSuccessfulLogin() {
        assertTrue(provider.isValidUser("test", "12345"));
    }



}



