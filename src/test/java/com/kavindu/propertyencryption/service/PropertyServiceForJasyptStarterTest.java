package com.kavindu.propertyencryption.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyServiceForJasyptStarterTest {

    @Autowired
    private PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;

    @Test
    public void whenDecryptedPasswordNeeded_GetFromService() {
        System.out.println(propertyServiceForJasyptStarter.getProperty());
    }

}