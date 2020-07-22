package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {
    StringDuplicator SUT;

    @Before
    public void setup() {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        String result = SUT.duplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void duplicate_singleString_singleStringReturned() {
        String result = SUT.duplicate("a");
        assertThat(result, is("aa"));

    }

    @Test
    public void duplicate_String_StringReturned() {
        String result = SUT.duplicate("Roshan Rai");
        assertThat(result, is("Roshan RaiRoshan Rai"));

    }
}