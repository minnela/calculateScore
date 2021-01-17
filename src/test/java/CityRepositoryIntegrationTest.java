import com.city.score.calculator.Application;
import com.city.score.calculator.domain.City;
import com.city.score.calculator.repository.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@SpringBootTest(classes= Application.class)
public class CityRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private CityRepository cityRepository;

    @Test
    public void whenFindByPlaqueNo_thenReturnCity() {
        // given
        City trying = new City(34);
        entityManager.persist(trying);
        entityManager.flush();

        // when
        City found = cityRepository.getCityByPlaque(trying.getPlaqueno());

        // then
        assertThat(found.getPlaqueno())
                .isEqualTo(found.getPlaqueno());
    }
}
