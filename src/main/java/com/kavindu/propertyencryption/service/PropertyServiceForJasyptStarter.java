package com.kavindu.propertyencryption.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceForJasyptStarter {
    @Value("${password}")
    private String property;

    public String getProperty() {
        return property;
    }
}
