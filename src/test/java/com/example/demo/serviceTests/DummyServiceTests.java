package com.example.demo.serviceTests;

import com.example.demo.services.DummyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class DummyServiceTests {

    @MockBean
    DummyService ds = new DummyService();

    @Test
    public void testMsg() {

        Assertions.assertEquals("Up and at 'em!", ds.getMsg());

    }

    @Test
    public void testMsg2() {

        Assertions.assertEquals("Up and at 'em!", ds.getMsg2());

    }
}
