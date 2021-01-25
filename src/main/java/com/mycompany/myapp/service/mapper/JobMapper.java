package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.JobDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Job} and its DTO {@link JobDTO}.
 */
@Mapper(componentModel = "spring", uses = { TaskMapper.class, EmployeeMapper.class })
public interface JobMapper extends EntityMapper<JobDTO, Job> {
    @Mapping(target = "tasks", source = "tasks", qualifiedByName = "titleSet")
    @Mapping(target = "employee", source = "employee", qualifiedByName = "email")
    JobDTO toDto(Job s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    JobDTO toDtoId(Job job);

    @Mapping(target = "removeTask", ignore = true)
    Job toEntity(JobDTO jobDTO);
}
