package org.springframework.data.cassandra.repository.example;

import org.springframework.data.cassandra.repository.support.CassandraJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends CassandraJpaRepository<User, String> {
}
