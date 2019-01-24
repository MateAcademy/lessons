package com.mateacademy.mock;

import org.junit.Test;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class UnderTestTest {

    @Test
    public void dockAdd() {
        IListener mock = createMock(IListener.class);
        UnderTest cl = new UnderTest();
     //   cl.dockAdd(mock);

//        expect(mock.dockAdd(anyObject()));
        replay();


//        cl.dockAdd(Document);
        verify();

    }

    @Test
    public void docDelited() {
    }
}