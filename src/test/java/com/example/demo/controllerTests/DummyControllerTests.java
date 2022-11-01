package com.example.demo.controllerTests;

import com.example.demo.controllers.DummyController;
import com.example.demo.services.DummyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DummyController.class)
public class DummyControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    DummyService ds;

    @Test
    public void mockNumTest() throws Exception {

        Mockito.when(ds.getMsg()).thenReturn("4");

        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(
                        "4")))
                .andDo(print());
    }
}
