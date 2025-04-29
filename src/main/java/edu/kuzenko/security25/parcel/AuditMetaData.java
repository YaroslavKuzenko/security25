package edu.kuzenko.security25.parcel;

/*
    @author yaroslavkuzenko
    @project security25
    @class AuditMetaData
    @since 29.04.2025 - 21.46
*/

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class AuditMetaData {
    @CreatedDate
    private LocalDateTime createdDate;
    @CreatedDate
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
    @LastModifiedBy
    private String lastModifiedBy;
}
