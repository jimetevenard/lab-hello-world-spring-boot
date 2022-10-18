package com.jimetevenard.helloworldspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CapitalizeServiceTests {

    @Autowired
    private CapitalizeService capitalizeService;

    @Test
    void assertInputIsCapitalized(){
        assertThat(capitalizeService.capitalize("ExamPle")).isEqualTo("EXAMPLE");
    }
}
