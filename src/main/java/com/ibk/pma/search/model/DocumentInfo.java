package com.ibk.pma.search.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Document(indexName = "ProjectManager", type = "DocumentInfo")
public class DocumentInfo {

    @Id
    private String id;


    private String title ;//사업명
    private String product;//도입항목
    private String functionPointYN;//기능점수여부
    private long price;//가격
    private String department;//발의부서
    private String cooperationDepartment;//협조부서
    private String sort ;//법령/사업/
    //
}
