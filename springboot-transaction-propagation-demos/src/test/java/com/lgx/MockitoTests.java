package com.lgx;

import com.lgx.module.domain.User;
import com.lgx.module.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-17 16:31 <br>
 * @description: MockitoTests <br>
 */
@ExtendWith(MockitoExtension.class)
public class MockitoTests {
    @Mock
    private UserService userService;

}
