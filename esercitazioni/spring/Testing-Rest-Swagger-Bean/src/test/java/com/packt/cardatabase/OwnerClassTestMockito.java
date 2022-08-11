package com.packt.cardatabase;

import com.packt.cardatabase.exception.NotFoundException;
import com.packt.cardatabase.model.entity.Car;
import com.packt.cardatabase.model.entity.Owner;
import com.packt.cardatabase.model.repository.OwnerRepository;
import com.packt.cardatabase.service.SimpleService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(MockitoExtension.class)
public class OwnerClassTestMockito {

    @InjectMocks
    private SimpleService simpleService = new SimpleService();
    @Mock
    private OwnerRepository ownerRepository;

    private Car car1;
    private Owner owner1;

    @Before("")
    public void setUp() {
        // best way to setFields is in setUp() method even we can also set same in test
        // method as well
        ReflectionTestUtils.setField(simpleService, "ownerRepository", ownerRepository);
    }

    @Test
    public void test_transform_full_name(){
        owner1 = new Owner("Elpidio", "Mazza");
        owner1.setOwnerId(1L);

        Mockito.when(ownerRepository.findById(1L)).thenReturn(Optional.ofNullable(owner1));
        assertEquals(simpleService.transformFullName(1L),
                owner1.getFirstname() + " " + owner1.getLastname());
    }
    @Test
    public void test_transform_full_name_not_found(){
        Mockito.when(ownerRepository.findById(2L)).thenReturn(Optional.ofNullable(null));
        assertThrows(NotFoundException.class,
                () ->  simpleService.transformFullName(2L), "Non esiste owner con qusto id");
    }



    /*
    @BeforeAll
    public void setup() {
        car1 = new Car("Seat","Ibiza","Black","005522",2015,50000,"",null);
        car1.setId(20L);

        owner1 = new Owner("Elpidio", "Mazza");
        owner1.setOwnerId(1L);
    }*/

}
