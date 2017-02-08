package base.controller;



import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import base.po.Item;
import base.po.Order;
import base.service.impl.ItemService;
import base.service.impl.OrderService;


@Controller
public class Neo4jController {
	
	
	@Autowired
	OrderService orderservice;
	
	@Autowired
	ItemService itemservice;
	
	@RequestMapping(value="/create")
	@ResponseBody
	public MSG showpic(){
		Order o=new Order("2011","mark"); 
		Item i1=new Item("book",3.0);
		Item i2=new Item("bag",6.0);
		Item i3=new Item("phone",888.0);
		HashSet<Item> items=new HashSet<Item>();
		items.add(i2);
		items.add(i1);
		o.setItems(items);
        orderservice.createOrder(o);
        
        itemservice.createItem(i3);
        Order order=orderservice.findOrderById(9L);
        Item phone=itemservice.findItemById(12L);
        itemservice.addLine(order, phone, 99);
		return new MSG("");
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public String a(){
		itemservice.deleteall();
		return "a";
	}
	
}
