package com.heroku.springboot.heroku.app.repository;

import com.heroku.springboot.heroku.app.entity.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDummyRepository extends JpaRepository<DummyEntity, Long> {
}
