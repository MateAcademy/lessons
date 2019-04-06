package mate.academy.less07.di;

import mate.academy.less07.dao.ClientDao;
import mate.academy.less07.dao.FileClientDao;
import mate.academy.less07.dao.InMemoryClientDao;
import mate.academy.less07.factory.ClientDaoFactory;
import mate.academy.less07.handler.ConsoleHandler;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDao = InMemoryClientDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                if (fileDao) {
                    System.out.println("Работа с файлами разрешена");
                }
                boolean inMemoryDao = inMemoryClientDao.isAnnotationPresent(Component.class);
                if (inMemoryDao) {
                    System.out.println("Работа с ОЗУ разрешена");
                }
                ClientDao clientDao = ClientDaoFactory.getClientDao(fileDao, inMemoryDao);
                field.set(null, clientDao);
            }
        }
    }
}
