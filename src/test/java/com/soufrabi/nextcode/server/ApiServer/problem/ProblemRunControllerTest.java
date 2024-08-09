package com.soufrabi.nextcode.server.ApiServer.problem;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProblemRunController.class)
@AutoConfigureMockMvc
public class ProblemRunControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    @MockBean
    ProblemRunService problemRunService;

    @Test
    void shouldWork() throws Exception {
        List<ProblemRunTestCase> problemRunTestCaseList = new ArrayList<>();
        problemRunTestCaseList.add(new ProblemRunTestCase(0L,"1 2 3"));
        problemRunTestCaseList.add(new ProblemRunTestCase(1L, "3 4 5"));
        ProblemRunRequest problemRunRequest = new ProblemRunRequest(
                "This is python source code",
                Instant.now(),
                problemRunTestCaseList,
                1L,
                2
        );

        String problemRunRequestJsonString = objectMapper.writeValueAsString(problemRunRequest);

        when(problemRunService.run(problemRunRequest)).thenReturn(new ProblemRunResponse("received problem run request"));

        mockMvc.perform(
                post("/problem/run")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(problemRunRequestJsonString)
        ).andExpect(status().isOk());
    }

}
