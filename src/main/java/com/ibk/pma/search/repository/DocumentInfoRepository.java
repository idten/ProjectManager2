package com.ibk.pma.search.repository;

import com.ibk.pma.search.model.DocumentInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DocumentInfoRepository  extends ElasticsearchRepository<DocumentInfo, String> {

}
