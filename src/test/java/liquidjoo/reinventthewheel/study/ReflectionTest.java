package liquidjoo.reinventthewheel.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import java.util.Set;

public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    @DisplayName("Car 객체 정보 가져오기")
    void showClass() {
        Class<Car> clazz = Car.class;
        logger.debug(clazz.getName());
    }

    @Test
    @DisplayName("test 이름이 있는 메소드만 실행")
    void testMethodRun() {
        Class<Car> clazz = Car.class;
        logger.debug(clazz.getName());
    }

    @Test
    void testAnnotationMethodRun() {
        Class<Car> clazz = Car.class;
        logger.debug(clazz.getName());
    }

    @Test
    void privateFieldAccess() {
        Class<Car> clazz = Car.class;
        logger.debug(clazz.getName());

    }

    @Test
    void constructorWithArgs() {
        Class<Car> clazz = Car.class;
        logger.debug(clazz.getName());
    }

    @Test
    void testScanClass() {
        Reflections reflections = new Reflections(
                new ConfigurationBuilder()
                        .setUrls(ClasspathHelper.forPackage("liquidjoo.reinventthewheel.example")));

        final Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Controller.class);
        classes.forEach(clazz -> logger.debug("controller annotation class : {}", clazz.getName()));
    }
}
