package com.web.eran.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @author Promise
* @createTime 2019年3月28日 上午11:00:51
* @description
*/
@Controller
@RequestMapping("/server")
public class ServerController {

	private final static Logger log = LoggerFactory.getLogger(ServerController.class);
	
	@RequestMapping(value="/zonglan",method=RequestMethod.GET)
	public String userInfo() {
		return "server/serverZonglan";
	}
}
