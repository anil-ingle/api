package com.krushidj.module.dashbord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krushidj.model.Contact;
import com.krushidj.util.JsonUtil;

@RestController
@RequestMapping("/v1")
public class DashbordController {

	@Autowired
	DashbordServiceImpl service;

	@RequestMapping(value = { "/contact" },method = RequestMethod.POST)
	public void saveContact(@RequestBody Contact contact) throws Throwable {
		service.saveContact(contact);

	}

	@RequestMapping(value = { "/contact" },method = RequestMethod.DELETE)
	public void deleteContact(@RequestParam("id") Long id) throws Throwable {
		service.deleteContact(id);

	}

	@RequestMapping(value = { "/contact" },method = RequestMethod.PUT)
	public void updateContact(@RequestBody Contact contact) throws Throwable {
		service.updateContact(contact);

	}

	@RequestMapping(value = { "/contact" },method = RequestMethod.GET)
	public ResponseEntity<String> getContacts(@RequestParam("id") Long id) throws Throwable {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(JsonUtil.convertJavaToJson(service.getContacts(id)), responseHeaders,
				HttpStatus.OK);

	}

	// this method temp. testing purpose
	@RequestMapping(value = { "/test" }, method = RequestMethod.GET)
	public void test() throws Throwable {
		/*
		 * Employee employee = new Employee(); employee.setName("anil ingle");
		 * employee.setSalary(Integer.parseInt("784")); employee.setSsn("5745");
		 * 
		 * service.saveEmployee(employee);
		 */
		Contact contact = new Contact();
		contact.setAvatarPath("https://s3.amazonaws.com/uifaces");
		contact.setFirstName("Amol");
		contact.setLastName("Adkine");
		contact.setMobileNumber("9822140905");
		contact.setHome("854545545");
		contact.setCompany("dshfsgfhjf");
		contact.setWork("dshghgfsjdfg<sf");
		contact.setText("dsfjhskjdfhsjk");
		contact.setLoginId(1l);
		contact.setActive(true);
		service.saveContact(contact);

	}

}
