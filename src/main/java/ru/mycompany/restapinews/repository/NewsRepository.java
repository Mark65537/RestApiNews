package ru.mycompany.restapinews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.mycompany.restapinews.model.News;

public interface NewsRepository extends CrudRepository<News, Long> {
}
