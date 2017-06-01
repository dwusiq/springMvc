package com.wusiq;

import com.wusiq.controller.LoginController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * MockMvc测试springmvc（不用启动服务器和浏览器）
 */
public class SpringMvcTest
{
    @Test
    public void testSpringMvc() throws Exception{
        LoginController controller = new LoginController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/loginController/welcome.do")).andExpect(view().name("welcomePage"));
    }
}
