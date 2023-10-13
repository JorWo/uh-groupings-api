package edu.hawaii.its.api.type;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupingServiceResultExceptionTest extends GroupingsServiceResult {

    private GroupingsServiceResultException groupingsServiceResultException;

    @BeforeEach
    public void setup() {
        groupingsServiceResultException = new GroupingsServiceResultException();
    }

    @Test
    @Disabled
    public void construction() {
        assertNotNull(groupingsServiceResultException);
        assertNull(groupingsServiceResultException.getGsr());
        groupingsServiceResultException.setGsr(new GroupingsServiceResult("resultCode0", "404"));
        String test = "GroupingsServiceResult " +
                "[action=404, resultCode=resultCode0]";
        String expected = test.replaceAll("\\\\", "");
        assertThat(groupingsServiceResultException.getGsr().toString(), equalTo(expected));
    }

    @Test
    public void constructorTest() {
        GroupingsServiceResultException exception = new GroupingsServiceResultException();
        assertNull(exception.getGsr());
    }
    @Test
    public void getGsrTest() {
        GroupingsServiceResult groupingsServiceResult = new GroupingsServiceResult();
        GroupingsServiceResultException exception = new GroupingsServiceResultException(groupingsServiceResult);
        assertThat(exception.getGsr(), equalTo(groupingsServiceResult));
    }

    @Test
    public void setGsrTest() {
        GroupingsServiceResult groupingsServiceResult = new GroupingsServiceResult();
        GroupingsServiceResultException exception = new GroupingsServiceResultException();
        exception.setGsr(groupingsServiceResult);
        assertThat(exception.getGsr(), equalTo(groupingsServiceResult));
    }
}
