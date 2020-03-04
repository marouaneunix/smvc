package ma.naf.cinatis.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
public class HomeControllerTest {

    /*
    @Test
    public void shoul() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(get("/v1/cinatis"))
                .andExpect(view().name("index"));
                //.andExpect(model().attribute("now", Object.class));
    }*/
}
