package com.heroku.springboot.heroku.app.service;

import com.heroku.springboot.heroku.app.entity.DummyEntity;

public interface IDummyService {
    DummyEntity saveDummyEntity(DummyEntity dummyEntity);
}
