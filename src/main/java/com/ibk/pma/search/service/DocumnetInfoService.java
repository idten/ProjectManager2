package com.ibk.pma.search.service;

import com.google.common.collect.Lists;
import com.ibk.pma.dto.WedulPlay;
import com.ibk.pma.search.model.DocumentInfo;
import com.ibk.pma.search.repository.DocumentInfoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class DocumnetInfoService {
    @Autowired
    DocumentInfoRepository documentInfoRepository;

    public void save(DocumentInfo documentInfo) {

        documentInfoRepository.save(documentInfo);
    }

    public List<DocumentInfo> findAll() {
        return Lists.newArrayList(documentInfoRepository.findAll());
    }

}
