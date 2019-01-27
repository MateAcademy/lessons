package com.mateacademy.lessons10;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
@RunWith(MockitoJUnitRunner.class)
public class StringChangerServiceUnitTestMockUnitTest {

    @Spy
    @InjectMocks
    private StringChangerService stringChangerService;
    @Spy
    private StringLowerUpperService lowerUpperService;

    @Test
    public void testAddEnd() {
        String expected = "MainStrEndString";
        String actual = stringChangerService.addEnd("EndString", "MainStr");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddEndWhenInputNull() {
        String expected = "nullEndString";
        String actual = stringChangerService.addEnd("EndString", null);
        assertEquals(expected, actual);
    }


    @Test
    public void addStartAndEnd() {
        String expected = "lovervalueInput";
        doReturn("lovervalue").when(stringChangerService).addStart("aa", "BB");
    String actual = stringChangerService.addStartAndEnd("aa", "Input", "BB");
            assertEquals(expected, actual);
    }

    @Test
    public void testAddStartUpperInputLower() {
        when(lowerUpperService.toLower(Mockito.anyString())).thenReturn("lovervalue");
        when(lowerUpperService.toUpper(Mockito.anyString())).thenReturn("UPPERVALUE");
        // doReturn("lovervalue").when(lowerUpperService).toLower(Mockito.anyString());
        // doReturn("UPPERVALUE").when(lowerUpperService).toUpper(Mockito.anyString());
        String expected = "UPPERVALUElovervalue";
        String actual = stringChangerService.addStartUpperInputLower("some","some");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddStartUpperInputLowerWithWordMate() {
        when(lowerUpperService.toLower("Mate")).thenReturn("lovervalue");
        when(lowerUpperService.toUpper(Mockito.anyString())).thenReturn("UPPERVALUE");
        String expected = "UPPERVALUElovervalue";
        String actual = stringChangerService.addStartUpperInputLower("some","Mate");
        assertEquals(expected, actual);
    }


// TODO нужно разобраться с этим вопросом!!!!!!

    @Test
    public void testAddStartUpperInputLowerWithWordHELLO() {
        //  when(lowerUpperService.toLower("Mate")).thenReturn("lovervalue");
        when(lowerUpperService.toUpper(Mockito.anyString())).thenReturn("UPPERVALUE");
        String expected = "UPPERVALUEhello";
        String actual = stringChangerService.addStartUpperInputLower("some","HELLO");
        assertEquals(expected, actual);
    }
    @Test(expected = NullPointerException.class)
    public void testAddStartUpperInputLowerWhenStartNull() {
        when(lowerUpperService.toUpper(null)).thenThrow(new NullPointerException());
        stringChangerService.addStartUpperInputLower(null, "some");
    }

    //  It is not the unittest
    @Test
    public void testAddStartEndTotalLower() {
        stringChangerService.addStartAndEndTotalLower("sTArt", "eNd", "INput");
        verify(lowerUpperService).toLower("sTArtINputeNd");
    }
    @Test
    public void addStartAndEndWithConstructionWhen() {
        String expected = "lovervalueInput";
        when(stringChangerService.addStart("aa", "BB")).thenReturn("lovervalue");
//        doReturn("lovervalue").when(stringChangerService).addStart("aa", "BB");
        String actual = stringChangerService.addStartAndEnd("aa", "Input", "BB");
        assertEquals(expected, actual);
    }

    @Test
    public void testaddStartAndEndUpper() {
        when(lowerUpperService.toLower(Mockito.anyString())).thenReturn("lovervalue");
        when(lowerUpperService.toUpper(Mockito.anyString())).thenReturn("UPPERVALUE");
        String expected = "UPPERVALUElovervalue";
        String actual = stringChangerService.addStartUpperInputLower("some","some");
        assertEquals(expected, actual);
    }
    @Test
    public void testAddStartAndEndTotalLower() {
        doReturn("startinput").when(stringChangerService).addStart("start", "input");
        stringChangerService.addStartAndEndTotalLower("start" ," end ", "input");
        verify(lowerUpperService).toLower("startinput end ");
    }








    @Test(expected = NullPointerException.class)
    public void testaddStartUpperInputLowerWhenSturtNull() {
        when(lowerUpperService.toUpper(null)).thenThrow(new NullPointerException());
        stringChangerService.addStartUpperInputLower(null, "some");
    }
}
