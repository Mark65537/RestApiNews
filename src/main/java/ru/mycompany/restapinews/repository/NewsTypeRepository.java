package ru.mycompany.restapinews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.mycompany.restapinews.model.NewsType;

@Repository
public interface NewsTypeRepository extends CrudRepository<NewsType, Long> {
}
