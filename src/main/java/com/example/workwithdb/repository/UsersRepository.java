package com.example.workwithdb.repository;

import com.example.workwithdb.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// под каждую таблицу создаем свой интерфейс
// Всегда наследуем его от JpaRepository<Наш класс Java, который ассоциируется с этой таблицей; второй это тип данных нашего id поля>
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

}
