package com.mycompany.myapp.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JobHistoryMapperTest {

    private JobHistoryMapper jobHistoryMapper;

    @BeforeEach
    public void setUp() {
        jobHistoryMapper = new JobHistoryMapperImpl();
    }
}
