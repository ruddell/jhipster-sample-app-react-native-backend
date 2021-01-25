package com.mycompany.myapp.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class JobHistoryDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(JobHistoryDTO.class);
        JobHistoryDTO jobHistoryDTO1 = new JobHistoryDTO();
        jobHistoryDTO1.setId(1L);
        JobHistoryDTO jobHistoryDTO2 = new JobHistoryDTO();
        assertThat(jobHistoryDTO1).isNotEqualTo(jobHistoryDTO2);
        jobHistoryDTO2.setId(jobHistoryDTO1.getId());
        assertThat(jobHistoryDTO1).isEqualTo(jobHistoryDTO2);
        jobHistoryDTO2.setId(2L);
        assertThat(jobHistoryDTO1).isNotEqualTo(jobHistoryDTO2);
        jobHistoryDTO1.setId(null);
        assertThat(jobHistoryDTO1).isNotEqualTo(jobHistoryDTO2);
    }
}
