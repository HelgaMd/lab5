package com.lab5;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public interface Service {
    String getMessage() throws JAXBException, IOException;
}