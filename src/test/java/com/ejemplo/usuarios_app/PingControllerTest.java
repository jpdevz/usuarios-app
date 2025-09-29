package com.ejemplo.usuarios_app;

import com.ejemplo.usuarios_app.health.HealthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = HealthController.class)
class PingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void debeResponderPongEnPing() throws Exception {
        mockMvc.perform(get("/ping"))
               .andExpect(status().isOk())
               .andExpect(content().string("pong"));
    }
}
