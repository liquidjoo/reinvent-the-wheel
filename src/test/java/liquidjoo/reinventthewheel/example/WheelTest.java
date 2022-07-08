package liquidjoo.reinventthewheel.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WheelTest {
    private static final Logger logger = LoggerFactory.getLogger(WheelTest.class);

    @DisplayName("요구사항 1")
    @Test
    void getAllFieldByColumnAnnotation() {
        Class<Wheel> wheelClass = Wheel.class;

        assertAll("필드 값 확인", () -> {
            assertThat("").contains("");
            assertThat("").contains("");
        });
    }


    @DisplayName("요구사항 2")
    @Test
    void getFieldByColumnAnnotationNameValue() {
        Class<Wheel> wheelClass = Wheel.class;

        assertAll("필드 값 확인", () -> {
            assertThat("").contains("");
            assertThat("").contains("");
        });
    }

    @DisplayName("요구사항 3")
    @Test
    void getFieldByTransient() {
        Class<Wheel> wheelClass = Wheel.class;

        assertAll("필드 값 확인", () -> {
            assertThat("").contains("");
            assertThat("").contains("");
        });
    }


    @DisplayName("요구사항 4")
    @Test
    public void getSelectQuery() {
        Class<Wheel> wheelClass = Wheel.class;

    }
}
