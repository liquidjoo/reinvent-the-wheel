package liquidjoo.reinventthewheel.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
