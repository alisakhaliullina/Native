package com.example.tests;

import org.testng.annotations.Test;

import com.example.fw.Contact;

public class TestContactCreation extends TestBase{

		@Test
		public void shouldCreateValidContact(){
			Contact contact = new Contact().setFirstName("tester").setLastName("testerov");
			app.getContactHelper().createContact(contact);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
							e.printStackTrace();
			}
			
		}

}
