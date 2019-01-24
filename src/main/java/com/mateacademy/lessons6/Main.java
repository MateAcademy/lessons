package com.mateacademy.lessons6;

public class Main {
    public static void main(String[] args) {

        try {
            double anser = ProgramUtill.multM(10, 10);
        } catch (UnschExc | CheckExc e) { System.err.println("Exception");
        } catch (Exception ee)  { System.err.println("Exception!!!!!!!");


//        catch (CheckExc e) { System.err.println("My own Exception"); }
//        catch (UnschExc e) { System.err.println("My own UncheckedException"); }
//        catch (Exception ex) {System.err.println("Exception "); }


        try { double anser2 = ProgramUtill.divM(5, 10); }
        catch (UnschExc e) { System.err.println("My own UncheckedException"); }


    }}
}
