package base.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import base.po.Order;

public interface OrderRepository extends GraphRepository<Order>{

}
