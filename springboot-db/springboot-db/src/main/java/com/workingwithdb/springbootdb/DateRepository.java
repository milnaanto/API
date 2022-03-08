package com.workingwithdb.springbootdb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<sample, Long> {

}
