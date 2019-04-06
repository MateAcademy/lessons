package mate.academy.less07;

import mate.academy.less07.di.Injector;
import mate.academy.less07.handler.ConsoleHandler;

import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException, IllegalAccessException {
            Injector.injectDependency();
            ConsoleHandler.handle();

        }
}
