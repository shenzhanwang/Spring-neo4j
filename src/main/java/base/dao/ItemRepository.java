package base.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import base.po.Item;
import base.po.Order;

public interface ItemRepository extends GraphRepository<Item>{

}
