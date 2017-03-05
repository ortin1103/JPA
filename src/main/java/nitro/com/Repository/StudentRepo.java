package nitro.com.Repository;

import nitro.com.Entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nitro on 05.03.2017.
 */
public interface StudentRepo extends CrudRepository<Student, Long> {
}
