package net.honux.login;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;

class LoggerTest {

    @Test
    void loggerTest() {
        Logger logger = LoggerFactory.getLogger(LoggerTest.class);
        logger.debug("Logger is well");
        assertThat(logger).isNotNull();
    }
}
