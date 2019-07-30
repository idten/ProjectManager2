package com.ibk.pma;

import com.ibk.pma.dto.WedulPlay;
import com.ibk.pma.repository.WedulPlayRepository;
import com.ibk.pma.service.WedulPlayService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import org.hamcrest.core.IsNull;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * wedul play document 조회
 *
 * @author wedul
 * @since 2019-02-09
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class WedulPlayTest {

    WedulPlayService wedulPlayService;

    @Autowired
    @Qualifier("wedulPlayRepository")
    WedulPlayRepository wedulPlayRepository;

    @Before
    public void setup() {
        wedulPlayService = new WedulPlayService(wedulPlayRepository);
    }

    @Test
    public void whenValidParameter_thenSuccessFind() {
        List<WedulPlay> list = wedulPlayService.findAll();
        System.out.println("Test="+list.size());
        assertNotNull(list);
    }

    @Test
    public void whenValidParameter_thenSuccessSave() {
        Exception ex = null;

        try {
            wedulPlayService.save(WedulPlay.builder().title("안녕 이건 테스트야").user("위들").startAt(1242421424).endAt(23214124).build());
            System.out.println("save success");
        } catch (Exception exception) {
            ex = exception;
        }

        assertTrue(null == ex);
    }

    @Test
    public void whenValidParameter_thenSuccessFindByUser() {
        Exception ex = null;

        try {
            WedulPlay play = wedulPlayService.findByUser("위들");

            assertThat(play, is(IsNull.notNullValue()));
        } catch (Exception exception) {
            ex = exception;
        }

        assertTrue(null == ex);
    }


}


