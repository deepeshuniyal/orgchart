package com.example.easynotes.controller;


import com.example.easynotes.dto.AppUsersDto;
import com.example.easynotes.service.AppUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppUsersController {

	@Autowired
    AppUsersService appUsersService;

	@GetMapping("/fetchData/{id}")
	public ResponseEntity<AppUsersDto> greeting(@PathVariable("id") Integer id) {
		//return appUsersService.findHierarchalData(id);
		return ResponseEntity.ok(appUsersService.findHierarchalData(id));
		//return "[{\"id\":2,\"name\":\"null\",\"title\":\"Regional Head\",\"childern\":[{\"id\":4,\"name\":\"null\",\"title\":\"Regional Head\",\"childern\":[{\"id\":5,\"name\":\"null\",\"title\":\"Vertical Head\",\"childern\":\"null\"},{\"id\":10,\"name\":\"null\",\"title\":\"AVP\",\"childern\":[{\"id\":12,\"name\":\"null\",\"title\":\"GM\",\"childern\":[{\"id\":16,\"name\":\"null\",\"title\":\"Manager Sales\",\"childern\":\"null\"}]},{\"id\":13,\"name\":\"null\",\"title\":\"AM ,Sales Accounts\",\"childern\":\"null\"}]}]},{\"id\":6,\"name\":\"null\",\"title\":\"National Sales Head\",\"childern\":[{\"id\":7,\"name\":\"null\",\"title\":\"Regional Head \",\"childern\":[{\"id\":8,\"name\":\"null\",\"title\":\"Vertical  Head\",\"childern\":\"null\"},{\"id\":9,\"name\":\"null\",\"title\":\"Vertical  Head\",\"childern\":\"null\"}]}]}]},{\"id\":14,\"name\":\"null\",\"title\":\"senior manager\",\"childern\":\"null\"},{\"id\":15,\"name\":\"null\",\"title\":\"sr manager\",\"childern\":\"null\"}]";
		//return "{ \"name\": \"Lao Lao\", \"title\": \"general manager\", \"children\": [ { \"name\": \"Bo Miao\", \"title\": \"department manager\" }, { \"name\": \"Su Miao\", \"title\": \"department manager\", \"children\": [ { \"name\": \"Tie Hua\", \"title\": \"senior engineer\" }, { \"name\": \"Hei Hei\", \"title\": \"senior engineer\", \"children\": [ { \"name\": \"Pang Pang\", \"title\": \"engineer\" }, { \"name\": \"Xiang Xiang\", \"title\": \"UE engineer\" }] }] }, { \"name\": \"Hong Miao\", \"title\": \"department manager\" }, { \"name\": \"Chun Miao\", \"title\": \"department manager\" }] }";
	}
}
