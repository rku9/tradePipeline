package com.rku.tradepipeline.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class BaseDocument {
    @Id
    private String id;
    private Instant created_at;
    private Instant updated_at;
}
