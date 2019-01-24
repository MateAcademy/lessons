package com.mateacademy.exeptioN;

public class Test2 {
    public static void main(String[] args) {
        try { }
        catch (Exception e) { }
        catch (Error e) {
            try { }
            catch (Exception t) { }
            catch (Error t) { }
            catch (Throwable t) {
                try { }
                catch (Exception s) { }
                catch (Error s) { }
                catch (Throwable s) { }
                finally { }
            }
            finally { }
        }
        catch (Throwable e) { }
        finally { }
    }
}
